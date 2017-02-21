package com.korol.homeworks.homework3.task12;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Somebody on 20.02.2017.
 */
public class FileCache {
    //private SoftReference<HashMap<String, byte[]>> cache = new SoftReference<HashMap<String, byte[]>>();
    private Map<String, byte[]> cache = new HashMap<>();

    public byte[] softCache(String location) throws IOException {

        if (cache.containsKey(location)) {
            return cache.get(location);
        } else {
            cache.put(location, Files.readAllBytes(Paths.get(location)));
        }
        return cache.get(location);
    }

    public static void main(String[] args) throws IOException {
        FileCache fileCache = new FileCache();
        double start = System.nanoTime();

        System.out.println(new String(fileCache.softCache("C://book5.pdf")));
       /* System.out.println(new String(fileCache.softCache("C://book5.pdf")));
        System.out.println(new String(fileCache.softCache("C://book5.pdf")));
        System.out.println(new String(fileCache.softCache("C://book5.pdf")));*/
       /* start = System.nanoTime();
        fileCache.softCache("C://book2.pdf");
        System.out.println(System.nanoTime() - start);
        start = System.nanoTime();
        fileCache.softCache("C://book3.pdf");
        System.out.println(System.nanoTime() - start);*/

    }
}
