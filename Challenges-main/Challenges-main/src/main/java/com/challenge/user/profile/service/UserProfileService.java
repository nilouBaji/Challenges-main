package com.challenge.user.profile.service;

import com.challenge.user.profile.entity.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface UserProfileService {

    public UserProfile register (UserProfile userProfile);

}