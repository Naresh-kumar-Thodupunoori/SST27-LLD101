package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static final Map<String, TextStyle> cache = new HashMap<>();

    private static String key(String font, int size, boolean bold) {
        return font + "|" + size + "|" + (bold ? "B" : "N");
    }

    public static TextStyle get(String font, int size, boolean bold) {
        String k = key(font, size, bold);
        TextStyle style = cache.get(k);
        if (style == null) {
            style = new TextStyle(font, size, bold);
            cache.put(k, style);
        }
        return style;
    }
}


