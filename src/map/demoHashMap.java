package map;

import java.util.HashMap;
import java.util.Map;

public class demoHashMap {
    public static void main(String [] args){
        Map<Integer,String> map =new HashMap<>();
        map.put(18,"vk");
        map.put(7,"thala");
        map.put(33,"majnu");
        map.put(45,"shana");
        map.put(10,"legend");
        System.out.println(map);
        System.out.println(map.get(10));
        map.put(45,"hitman");
        System.out.println(map);
        map.remove(33);
        map.put(12,"ap the legend");
        System.out.println(map.keySet());
        boolean has = map.containsKey(18);
        System.out.println(has);
        System.out.println(map.values());


    }
}
