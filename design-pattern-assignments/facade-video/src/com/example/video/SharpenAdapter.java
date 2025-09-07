package com.example.video;

public class SharpenAdapter {
    private LegacySharpen legacySharpen;
    
    public SharpenAdapter() {
        this.legacySharpen = new LegacySharpen();
    }
    
    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = "frames_" + frames.length;
        String result = legacySharpen.applySharpen(handle, strength);
        System.out.println("Sharpened with strength " + strength);
        return frames;
    }
}
