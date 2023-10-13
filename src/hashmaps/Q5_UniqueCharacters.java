package hashmaps;

import java.util.Calendar;
import java.util.HashMap;

public class Q5_UniqueCharacters {
    public static void main(String[] args) {
        String str = "ababcd";
        System.out.println("Unique Character: " + uniqueCharacter(str));
    }

    public static String uniqueCharacter(String str) {
        HashMap<Character, Boolean> map = new HashMap<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                continue;
            } else {
                s = s + str.charAt(i);
                map.put(str.charAt(i), true);
            }
        }

        return s;
    }
}
