package com.example.travel_diary.service;

import com.example.travel_diary.global.domain.entity.Diary;
import com.example.travel_diary.global.domain.entity.Photo;
import com.example.travel_diary.global.domain.repository.PhotoRepository;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {
    private final PhotoRepository photoRepository;

    @Override
    @Transactional
    public void insert(String[] paths, Long diaryId) throws IOException {
        Storage storage =  StorageOptions.newBuilder().setProjectId("titanium-vision-424101-s9").build().getService();
        String bucketName = "jorang";
        Diary diary = Diary.builder().id(diaryId).build();
        for (int i = 0; i < paths.length; i++) {
            BlobId blobId = BlobId.of(bucketName, "diary/" + diaryId + "/image" + (i+1));
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
            storage.createFrom(blobInfo, Paths.get(paths[i]));
            String googlePath = storage.get(blobId).getMediaLink();
            photoRepository.save(Photo.builder().path(googlePath).diary(diary).build());
        }
    }

    @Override
    public Photo getById(Long id) {
        return photoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public List<Photo> getByDiaryId(Long diaryId) {
        return photoRepository.findAllByDiary_Id(diaryId);
    }

    @Override
    @Transactional
    public void update(Long id, String path) {
        Photo photo = photoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        photo.setPath(path);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        photoRepository.deleteById(id);
    }
}
