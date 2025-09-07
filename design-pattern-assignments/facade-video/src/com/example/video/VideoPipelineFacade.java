package com.example.video;
import java.nio.file.Path;

public class VideoPipelineFacade {
    private Decoder decoder;
    private FilterEngine filterEngine;
    private SharpenAdapter sharpenAdapter;
    private Encoder encoder;
    
    public VideoPipelineFacade() {
        this.decoder = new Decoder();
        this.filterEngine = new FilterEngine();
        this.sharpenAdapter = new SharpenAdapter();
        this.encoder = new Encoder();
    }
    
    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        // Decode video
        Frame[] frames = decoder.decode(src);
        
        if (gray) {
            frames = filterEngine.grayscale(frames);
        }
        
        if (scale != null) {
            frames = filterEngine.scale(frames, scale);
        }
        
        if (sharpenStrength != null) {
            frames = sharpenAdapter.sharpen(frames, sharpenStrength);
        }
        
        return encoder.encode(frames, out);
    }
}
