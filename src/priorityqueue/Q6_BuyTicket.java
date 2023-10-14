package priorityqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q6_BuyTicket {
    public static void main(String[] args) {
        int[] arr = {3, 9, 4};
        int k = 2;
        System.out.println("Buy Ticket: " + buyTicket(arr, k));
    }

    public static int buyTicket(int input[], int k) {

        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<input.length; i++){

            pq.add(input[i]);
            q.add(i);
        }
        int ans = 0;
        while(!pq.isEmpty()){
            int b = q.peek();
            if(input[q.peek()]==pq.peek()){
                ans++;
                pq.poll();
                q.poll();

                if(b==k){

                    break;
                }
            }else{
                q.poll();
                q.add(b);
            }

        }
        return ans;
    }
}
