package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public boolean isEmailRegistered(String email) {
        if (userRepository.findUserByEmail(email).isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmailAndPasswordCorrect(String email, String password) {
        if (userRepository.findUserByEmail(email).isPresent()) {
            if (userRepository.findUserByEmail(email).get().getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String getLoginPath(String email, String password) {
        if (isEmailRegistered(email) && isEmailAndPasswordCorrect(email, password)) {
            return "redirect:/" + getUserByEmail(email).getId() + "/p1";
        } else {
            return "redirect:/login?error=invalid%20email%20or%20password";
        }
    }

    @Override
    public User getUserByEmail(String email) {
        if (isEmailRegistered(email)) {
            return userRepository.findUserByEmail(email).get();
        } else {
            return null;
        }
    }
}
