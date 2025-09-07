package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        VideoPipelineFacade pipeline = new VideoPipelineFacade();
        
        // Process video: source, output, grayscale, scale, sharpen
        Path result = pipeline.process(
            Path.of("in.mp4"), 
            Path.of("out.mp4"), 
            true,    // grayscale
            0.5,     // scale
            3        // sharpen
        );
        
        System.out.println("Done: " + result);
    }
}
