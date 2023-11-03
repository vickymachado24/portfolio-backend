package com.vicky.service;


import com.vicky.model.Profile;

import java.util.Optional;

public interface ProfileService {

    Profile fetchProfile(Long id);

}
