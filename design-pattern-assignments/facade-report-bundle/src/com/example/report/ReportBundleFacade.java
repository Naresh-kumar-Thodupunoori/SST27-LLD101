package com.example.report;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    
    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data);
        Objects.requireNonNull(outDir);
        Objects.requireNonNull(baseName);
        
        Path jsonFile = new JsonWriter().write(data, outDir, baseName);
        Path zipFile = new Zipper().zip(jsonFile, outDir.resolve(baseName + ".zip"));
        new AuditLog().log("exported " + zipFile);
        
        return zipFile;
    }
}
