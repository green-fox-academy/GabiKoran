package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PostRepository postRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
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
            return "redirect:/" + getUserByEmail(email).getId();
        } else {
            return "redirect:/login?loginerror=Invalid%20email%20or%20password.";
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

    @Override
    public String getSignUpPath(String name, String email, String password, String password2) {
        if (isEmailRegistered(email)) {
            return "redirect:/login?signuperror=This%20email%20was%20registered%20earlier.";
        } else if (!password.equals(password2)) {
            return "redirect:/login?signuperror=Please%20check%20the%20password.";
        } else {
            save(new User(name, email, password));
            return "redirect:/" + getUserByEmail(email).getId();
        }
    }
}
