package dynamicprogramming;

public class Q10_CoinTower {
    public static void main(String[] args) {
        System.out.println(findWinner(4, 2, 3));
    }

    public static String findWinner(int n, int x, int y) {
        //Your code goes hereeee
        int dp [] = new int[n+1];

        dp[1] = 1;

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for(int i=2;i<dp.length;i++){
            if(i == x || i == y){
                dp[i] = 1;
                continue;
            }

            if(i-x >= 1){
                a1 = dp[i-x] ^ 1;
            }
            if(i-y >= 1){
                a2 = dp[i-y] ^ 1;
            }

            a3 = dp[i-1] ^ 1;
            dp[i] = Math.max(a1 ,Math.max(a2 ,a3));
        }

        if(dp[n] != 0){
            return "Beerus";
        }else{
            return "Whis";
        }

    }
}
