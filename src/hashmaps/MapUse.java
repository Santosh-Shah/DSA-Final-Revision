package hashmaps;

public class MapUse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        for (int i = 0; i < 20; i++) {
            map.insert("santosh" + i, i + 1);
            System.out.println(map.loadFactor());
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("santosh" + i + ":" + map.getValue("santosh" + i));
        }
    }
}
