package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;
    
    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }
    
    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = csvReader.read(csvFile);
        int count = 0;
        
        for (String[] row : rows) {
            // Skip header row
            if (row[0].equals("id")) {
                continue;
            }
            
            // Check if row has valid data
            if (row.length >= 3 && !row[0].trim().isEmpty() && 
                !row[1].trim().isEmpty() && row[1].contains("@")) {
                
                try {
                    String id = row[0].trim();
                    String email = row[1].trim();
                    String displayName = row[2].trim();
                    
                    profileService.createProfile(id, email, displayName);
                    count++;
                } catch (Exception e) {
                    System.out.println("Skipped: " + String.join(",", row));
                }
            } else {
                System.out.println("Skipped: " + String.join(",", row));
            }
        }
        
        return count;
    }
}
