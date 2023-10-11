package hashmaps;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int count;
    int numBuckets;

    public Map() {
        buckets = new ArrayList<MapNode<K, V>>();
        numBuckets = 20;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }
}
