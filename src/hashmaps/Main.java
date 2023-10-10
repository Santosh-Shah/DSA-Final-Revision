package hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // inserting
        map.put("abc", 1);
        map.put("deff", 3);

        // presence
        if (map.containsKey("abc")) {
            System.out.println("map has abc");
        }

        if (map.containsKey("def")) {
            System.out.println("map has def");
        } else {
            System.out.println("map do not have def");
        }


        // get value
//        int v1 = map.get("abcc");    // if you do not find, it will through null pointer exception, because get() function return value, else null and null is booolean
        int v1 = 0;
        if (map.containsKey("abcv")) {
            v1 = map.get("abc");
        }
        System.out.println(v1);

        // size
        System.out.println("map size: " + map.size());

        // remove
//        map.remove("abc");

//        System.out.println("map size: " + map.size());

        // iterating to print all keys
        Set<String> keys = map.keySet();
        for (String ans : keys) {
            System.out.print(ans + " ");
        }

    }
}
