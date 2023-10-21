package dynamicprogramming;

public class Q9_LootHouses {
    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 20, 3, 50};
        System.out.println(maxMoneyLooted(arr));
    }

    public static int maxMoneyLooted(int[] arr) {
        //Your code goes here
        if(arr.length==0)
            return 0;
        int[] storage =new int[arr.length];
        storage[0]=arr[0];
        storage[1]=Math.max(arr[1],storage[0]);
        for(int i=2;i<storage.length;i++){
            storage[i]=Math.max(arr[i]+storage[i-2],storage[i-1]);
        }
        return storage[storage.length-1];
    }
}
