package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
    private static final Map<String, Image> images = new HashMap<>();

    public static Image getImage(String filename, int width, int height) {
        String key = filename + "_" + width + "_" + height;

        if (!images.containsKey(key)) {
            images.put(key, new ConcreteImage(filename, width, height));
        }

        return images.get(key);
    }
}
