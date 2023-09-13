package com.challenge.user.profile.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
//@Document(collection = "user_profile")
public class UserProfile {

    private String userId;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;

    @Embeddable
    public static class Address {
        private String addressLine;
        private String city;
        private String postalCode;

    }

}