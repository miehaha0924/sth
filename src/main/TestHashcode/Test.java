package main.TestHashcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"miehaha1");
        map.put(2,"miehaha2");
        map.put(3,"miehaha3");
        map.put(4,"miehaha4");
        map.put(null,null);
        map.put(1,"miehahaha");
        System.out.println(map.get(1));
        System.out.println(map.get(null));
        Map<Integer,String> cmap = new ConcurrentHashMap<>();
        cmap.put(1,"asd");
        cmap.put(2,"asdasd");
        cmap.put(3,"asasdqwed");
        System.out.println(cmap.get(3));
    }
}
