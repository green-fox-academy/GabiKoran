package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.User;

public interface UserService {

    User save(User user);

    User findById(Long id);

    boolean isEmailRegistered(String email);

    boolean isEmailAndPasswordCorrect(String email, String password);

    String getLoginPath(String email, String password);

    User getUserByEmail(String email);
}
