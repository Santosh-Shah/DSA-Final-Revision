package stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException{
//        StackUsingArray stack = new StackUsingArray();
//        stack.push(5);
//        stack.push(10);

//        int[] arr = {3, 4, 5, 6, 7, 10, 40, 11, 12, 13, 15};
//        for (int ans : arr) {
//            stack.push(ans);
//        }
//        System.out.println(stack.size());
//        System.out.println(stack.top());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
////
//        System.out.println(stack.size());
//        System.out.println(stack.top());
//        System.out.println(stack.isEmpty());



        // Stack using LL
        int[] arr = {3, 4, 5, 6, 7, 10, 40, 11, 12, 13, 15};
        StackUsingLL stack = new StackUsingLL();
        for (int ans : arr) {
            stack.push(ans);
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.top());
    }
}
