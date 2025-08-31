package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings {
    
    private static AppSettings theOnlyInstance = null;    

    AppSettings() {
        
    }
    
    public static AppSettings getInstance() {
        // return new AppSettings(); // returns a fresh instance (bug)
        if (theOnlyInstance == null) {
            theOnlyInstance = new AppSettings();
        }
        return theOnlyInstance;
    }

    private Properties props = new Properties();    
    public void loadFromFile(Path file) {
        try {
            // Try to read the file
            InputStream in = Files.newInputStream(file);
            props.load(in);
            in.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
