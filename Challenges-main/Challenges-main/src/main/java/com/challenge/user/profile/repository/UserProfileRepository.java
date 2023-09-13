package com.challenge.user.profile.repository;


import com.challenge.user.profile.entity.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

}