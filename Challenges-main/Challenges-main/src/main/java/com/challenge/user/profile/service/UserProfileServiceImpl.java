package com.challenge.user.profile.service;

import com.challenge.user.profile.entity.UserProfile;
import com.challenge.user.profile.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
    private static final Logger LOG = LoggerFactory.getLogger(UserProfileServiceImpl.class);
    @Autowired
    private UserProfileRepository userProfileRepository;
    public UserProfile register (UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }



}