package com.example.travel_diary.service;


import com.example.travel_diary.global.request.SignInRequestDto;
import com.example.travel_diary.global.request.SignUpRequestDto;
import com.example.travel_diary.global.response.GetUserByIdResponseDto;

import java.util.UUID;

public interface AuthService {
    UUID signUp(SignUpRequestDto signUpRequestDto) throws Exception;
    void signIn(SignInRequestDto signInRequestDto) throws Exception;

    GetUserByIdResponseDto getUserById(UUID id) throws Exception;

    void updateUserNickname(UUID id, String nickname) throws Exception;

    void updateUserPassword(UUID id, String password) throws Exception;

    void deleteUserById(UUID id) throws Exception;

    void findLoginId(String email);
    void findPassword(String loginId);
}
