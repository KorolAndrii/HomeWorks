package com.korol.homeworks.homework3.task12;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Somebody on 20.02.2017.
 */
public class SoftCache {
    private Map<String, SoftReference> cache = new HashMap<>();

    public Map<String, SoftReference> getCache() {
        return cache;
    }

    public Object getSoftFile(String location) throws IOException {

        if (cache.containsKey(location)) {
            return cache.get(location);
        } else {
            cache.put(location, new SoftReference(Files.readAllBytes(Paths.get(location))));
        }
        return cache.get(location);
    }

    public boolean putSoftFile(String location) throws IOException {
        if (location != null) {
            cache.put(location, new SoftReference(Files.readAllBytes(Paths.get(location))));
            return true;
        } else return false;
    }
}

