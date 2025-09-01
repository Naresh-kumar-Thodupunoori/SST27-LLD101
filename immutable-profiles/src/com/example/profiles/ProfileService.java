package com.example.profiles;

/**
 * Assembles profiles using Builder pattern with centralized validation.
 */
public class ProfileService {

    // Creates immutable profile using Builder pattern
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email)
            .build();
    }

    // Creates profile with display name using Builder
    public UserProfile createWithDisplayName(String id, String email, String displayName) {
        return new UserProfile.Builder(id, email)
            .displayName(displayName)
            .build();
    }

    // Creates full profile using Builder
    public UserProfile createFull(String id, String email, String phone, String displayName, 
                                 String address, boolean marketingOptIn, String twitter, String github) {
        return new UserProfile.Builder(id, email)
            .phone(phone)
            .displayName(displayName)
            .address(address)
            .marketingOptIn(marketingOptIn)
            .twitter(twitter)
            .github(github)
            .build();
    }

    // Note: No more updateDisplayName method because UserProfile is immutable!
    // If you need to change a profile, you must create a new one.
}
