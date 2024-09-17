package com.example.autocourse.lecture07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Examples {
    public static void main(String[] args) {
    }

    public static void testHashMapEntrySet() {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        //An Entry set returns key-value pairs
        for (Map.Entry<Integer, String> fruit : map.entrySet()) {
            System.out.println(fruit.getKey() + " " + fruit.getValue());
        }
    }

    public static void testHashMapKeySet() {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        //A key set returns all keys of the map
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void testHashMapOperations() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Ivan");
        hashMap.put(101, "Georgi");
        hashMap.put(102, "Stoyan");
        System.out.println("Initial list of elements:");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        hashMap.replace(102, "Miroslav");//replaces the value of a specified key
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        //Replace the old value of the specified key only if the key is previously mapped with the specified old value
        hashMap.replace(101, "Georgi", "Anton");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println("Updated list of elements:");
        //Replaces the values of all keys
        hashMap.replaceAll((k, v) -> "Asen");
        for (Map.Entry<Integer, String> name : hashMap.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public static void testHashSetForEach() {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");

        for (String number : set) {
            System.out.println(number);
        }
        System.out.println(set.size());
    }

    public static void testHashSetOperations() {
        HashSet<String> set = new HashSet<>();
        set.add("Niki");
        set.add("Ivan");
        set.add("Georgi");
        set.add("Stoyan");
        System.out.println("An initial list of elements: " + set);

        //Removing specific element from HashSet
        set.remove("Ivan");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<>();
        set1.add("Ekaterina");
        set1.add("Maya");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);

        //Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Nik"));
        System.out.println("After invoking removeIf() method: " + set);

        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }
}