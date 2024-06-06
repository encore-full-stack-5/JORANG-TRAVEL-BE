package com.example.travel_diary.service;

import com.example.travel_diary.global.domain.entity.User;
import com.example.travel_diary.global.domain.repository.UserRepository;
import com.example.travel_diary.global.request.SignInRequestDto;
import com.example.travel_diary.global.request.SignUpRequestDto;
import com.example.travel_diary.global.response.GetUserByIdResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;



    @Override
    public UUID signUp(SignUpRequestDto signUpRequestDto) throws Exception {
        Optional<User> byEmail = userRepository.findByEmail(signUpRequestDto.email());
        if(byEmail.isPresent()) throw new Exception("이메일 있음");
        User entity = signUpRequestDto.toEntity();
        userRepository.save(entity);
        return entity.getId();
    }

    @Override
    public void signIn(SignInRequestDto signInRequestDto) throws Exception {
        Optional<User> byLoginId = userRepository.findByLoginId(signInRequestDto.loginId());
        if(!byLoginId.get().getPassword().equals(signInRequestDto.password()))
            throw new Exception("로그인 실패");
    }

    @Override
    public GetUserByIdResponseDto getUserById(UUID id) throws Exception {
        Optional<User> byId = userRepository.findById(id);
        if(byId.isEmpty()) throw new Exception("uuid 없음");
        User user = byId.get();
        return new GetUserByIdResponseDto(user.getNickname(),user.getPassword(),user.getEmail());
    }

    @Override
    public void updateUserNickname(UUID id, String nickname) throws Exception {
        Optional<User> byId = userRepository.findById(id);
        if(byId.isEmpty()) throw new Exception("uuid 없음");
        User user = byId.get();
        user.setNickname(nickname);
        userRepository.save(user);
    }

    @Override
    public void updateUserPassword(UUID id, String password) throws Exception {
        Optional<User> byId = userRepository.findById(id);
        if(byId.isEmpty()) throw new Exception("uuid 없음");
        User user = byId.get();
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(UUID id) throws Exception {
        Optional<User> byId = userRepository.findById(id);
        if(byId.isEmpty()) throw new Exception("uuid 없음");
        User user = byId.get();
        userRepository.deleteById(user.getId());
    }

    @Override
    public void findLoginId(String email) {

    }

    @Override
    public void findPassword(String loginId) {

    }
}
