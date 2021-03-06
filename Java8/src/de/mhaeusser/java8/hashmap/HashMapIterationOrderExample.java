package de.mhaeusser.java8.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * This class shows that there are no difference in the iteration order of hash
 * maps and linked hash maps in java 7.
 * 
 * From
 * https://examples.javacodegeeks.com/core-java/util/hashmap/hashmap-changes-in-java-8/
 * 
 * @author dgutierrez-diez
 */
public class HashMapIterationOrderExample {

    public static void main(String[] args) {

        // Using HashMap
        System.out.println("Using plain hash map using linked lists in java 7:");

        HashMap<String, String> stringMap = new HashMap<>();

        for (int i = 0; i < 100; ++i) {
            stringMap.put("index_" + i, String.valueOf(i));
        }

        for (String string : stringMap.values()) {
            System.out.println(string);
        }

        // Using HashMap
        System.out.println("using LinkedHashMap with linked lists:");

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 100; ++i) {
            linkedHashMap.put("index_" + i, String.valueOf(i));
        }

        for (String string : linkedHashMap.values()) {
            System.out.println(string);
        }
    }
}
