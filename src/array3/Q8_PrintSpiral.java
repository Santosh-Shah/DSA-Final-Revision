package array3;

public class Q8_PrintSpiral {
    public static void main(String[] args) {
        //TODO: print largest column sum
        int[][] arr = {
                {1, 3, 2},
                {4, 5, 6},
                {7, 9, 8}
        };

        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr) {
        int maxR = arr.length;

        // base case
        if (maxR == 0) {
            return;
        }

        int minC = 0;
        int minR = 0;
        int maxC = arr[0].length;
        int count = 0;
        int totalNumberToRun = maxR * maxC;

        while (count < totalNumberToRun) {
            for (int i = minR, j = minC; j < maxC && count <totalNumberToRun; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minR++;

            for (int i = minR, j = maxC - 1; i < maxR && count < totalNumberToRun; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxC--;

            for (int i = maxR - 1, j = maxC - 1; j >= minC && count < totalNumberToRun; j--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxR--;

            for (int i = maxR - 1, j = minC; i >= minR && count < totalNumberToRun; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minC++;
        }
    }
}
