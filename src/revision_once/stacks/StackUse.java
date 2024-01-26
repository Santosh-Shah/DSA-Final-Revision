package revision_once.stacks;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
//        StackUsingArray stack = new StackUsingArray();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);

//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.top());

//        while (!stack.isEmpty()) {
//            stack.pop();
//        }
//
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.top());


        StackUsingLL<Integer> stackLL = new StackUsingLL<>();
        stackLL.push(100);
        stackLL.push(200);
        stackLL.push(500);
        stackLL.push(600);

        System.out.println(stackLL.size());
        System.out.println(stackLL.isEmpty());
        System.out.println(stackLL.top());

        while (!stackLL.isEmpty()) {
            stackLL.pop();
        }

        System.out.println(stackLL.size());
        System.out.println(stackLL.isEmpty());
        System.out.println(stackLL.top());


    }
}
