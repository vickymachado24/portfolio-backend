package com.vicky.service.implementation;


import com.vicky.model.Profile;
import com.vicky.repository.ProfileRepository;
import com.vicky.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileServiceImpl.class);

    @Autowired
    private ProfileRepository profileRepository;


    @Override
    public Profile fetchProfile(Long id) {
        LOGGER.info("ProfileServiceImpl() - fetchProfile , " +
                "fetching profile with the id {},{}", id);
        Optional<Profile> fetchedProfile = profileRepository.findById(id);
        if( fetchedProfile.isPresent())
            return fetchedProfile.get();
        return null;
    }
}
