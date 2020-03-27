package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.Doubling;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public MainService() {
    }

    public Doubling doubling(int received) {
        Doubling doubling = new Doubling(received, received * 2);
        return doubling;
    }
}
