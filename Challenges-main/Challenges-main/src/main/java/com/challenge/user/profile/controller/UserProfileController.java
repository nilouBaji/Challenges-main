package com.challenge.user.profile.controller;

import com.challenge.user.profile.entity.UserProfile;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.challenge.user.profile.service.UserProfileServiceImpl;


@Api(value = "User Profile Controller")
@RestController
@RequestMapping("/api/registration")
public class UserProfileController {

    @Autowired
    private UserProfileServiceImpl userProfileService;
    private static final Logger LOG = LoggerFactory.getLogger(UserProfileController.class);


    /**
     * register one user
     * @param userProfile
     * @return
     */
    @PostMapping("/user")
    public ResponseEntity<UserProfile> register (@RequestBody UserProfile userProfile) {
        UserProfile newUserProfile = userProfileService.register (userProfile);
        return new ResponseEntity<>(newUserProfile, HttpStatus.CREATED);
    }

}


