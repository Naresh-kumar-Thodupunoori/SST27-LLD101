import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        
        UserProfile p1 = svc.createMinimal("u1", "a@b.com");
        System.out.println("Profile 1: " + p1.getEmail());
        
        // Try to change email (this will cause compilation error!)
        System.out.println("Profile 1 (unchanged): " + p1.getEmail());
        
        // Create a new profile with different email (immutable way)
        UserProfile p2 = svc.createMinimal("u1", "new@b.com");
        System.out.println("Profile 2: " + p2.getEmail());
        
        // Using Builder pattern directly
        UserProfile p3 = new UserProfile.Builder("u2", "user@example.com")
            .displayName("John Doe")
            .phone("123-456-7890")
            .marketingOptIn(true)
            .build();
        
        System.out.println("Profile 3: " + p3.getDisplayName() + " (" + p3.getEmail() + ")");        
    }
}
