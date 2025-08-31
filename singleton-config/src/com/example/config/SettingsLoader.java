package com.example.config;

import java.nio.file.Path;

/** Thin wrapper that encourages re-loading and multiple instances. */
public class SettingsLoader {
    
    /**
     * Load settings from a file using the singleton
     * 
     * @param file The path to the configuration file
     * @return The singleton instance (always the same one)
     */
    public AppSettings load(Path file) {    
            
        AppSettings settings = AppSettings.getInstance(); // Get the singleton
        settings.loadFromFile(file); // Load the file into the singleton
        
        System.out.println("Settings loaded into the singleton instance");
        
        return settings; // Return the same singleton instance
    }
}
