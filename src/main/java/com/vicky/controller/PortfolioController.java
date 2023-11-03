package com.vicky.controller;

import com.vicky.model.Profile;
import com.vicky.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortfolioController.class);
    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Long id) {
        LOGGER.info("Profile Controller - getProfile() with given id {}", id);
        return profileService.fetchProfile(id);
    }

}
