package com.korol.homeworks.homework3.task12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Somebody on 22.02.2017.
 */
public class StrongCache {
    private Map<String, byte[]> cache = new HashMap<>();

    public Map<String, byte[]> getCache() {
        return cache;
    }

    public Object getFile(String location) throws IOException {
        if (cache.containsKey(location)) {
            return cache.get(location);
        } else {
            cache.put(location, (Files.readAllBytes(Paths.get(location))));
        }
        return cache.get(location);
    }

    public static void main(String[] args) throws IOException {
        StrongCache st = new StrongCache();
        st.getFile("C://book1.pdf");
        st.getFile("C://book2.pdf");
        st.getFile("C://book3.pdf");
        st.getFile("C://book4.pdf");
      //  st.getFile("C://book5.pdf");


    }
}
