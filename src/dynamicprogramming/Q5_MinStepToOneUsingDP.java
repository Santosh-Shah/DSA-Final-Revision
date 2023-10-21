package dynamicprogramming;

public class Q5_MinStepToOneUsingDP {
    public static void main(String[] args) {
//        int n = 10;
//        int[] dp = new int[n + 1];
//        for (int i = 0; i < dp.length; i++) {
//            dp[i] = -1;
//        }
//        System.out.println(countMinStepsToOne(5, dp));

        System.out.println(countMinStepsToOne(7));
    }

    public static int countMinStepsToOne(int n, int[] dp) {
        if (n == 1) {
            return 0;
        }

        int ans1;
        if (dp[n - 1] == -1) {
            ans1 = countMinStepsToOne(n - 1, dp);
            dp[n - 1] = ans1;
        } else {
            ans1 = dp[n - 1];
        }

        int ans2 = Integer.MAX_VALUE;
        if ((n % 2) == 0) {
            if (dp[n / 2] == -1) {
                ans2 = countMinStepsToOne(n / 2, dp);
                dp[n / 2] = ans2;
            } else {
                ans2 = dp[n / 2];
            }
        }

        int ans3 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            if (dp[n / 3] == -1) {
                ans3 = countMinStepsToOne(n / 3, dp);
                dp[n / 3] = ans3;
            } else {
                ans3 = dp[n / 3];
            }
        }

        return Math.min(ans1, Math.min(ans2, ans3)) + 1;
    }

    public static int countMinStepsToOne(int n) {
        //Your code goes here
        int[] storage =new int[n+1];
        storage[1]=0;

        for(int i=2;i<storage.length;i++)
        {
            int op1=Integer.MAX_VALUE;
            int op2=Integer.MAX_VALUE;
            int op3=Integer.MAX_VALUE;
            op1=storage[i-1];
            if(i%2==0)
                op2=storage[i/2];
            if(i%3==0)
                op3=storage[i/3];
            storage[i]=1+Math.min(Math.min(op1,op2),op3);
        }
        return storage[n];
    }
}
