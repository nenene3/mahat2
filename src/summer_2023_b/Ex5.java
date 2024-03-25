package summer_2023_b;

public class Ex5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(7);
//        stack.push(3);
//        stack.push(10);
//        stack.push(12);
//        stack.push(21);
//        stack.push(12);
//        stack.push(3);
//        stack.push(13);
//        stack.push(15);
//        stack.push(3);
//        stack.push(18);
//        System.out.println(firstPlace(stack,3));
//        System.out.println(lastPlace(stack,3));
//        System.out.println(lastPlace(stack,3)-firstPlace(stack,3)-1);
        stack.push(1);
        stack.push(8);
        stack.push(-2);
        stack.push(1);
        stack.push(11);
        stack.push(4);
        stack.push(11);
        stack.push(-2);
        stack.push(8);
        stack.push(4);
        System.out.println(distance(stack));
    }

    public static int firstPlace(Stack<Integer> stack, int num) {
        int index = -1;
        int counter = 0;
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            counter++;
            if (stack.top() == num) {
                index = counter;
                break;
            }
            tmp.push(stack.pop());
        }
        while (!tmp.isEmpty())
            stack.push(tmp.pop());

        return index;
    }

    public static int lastPlace(Stack<Integer> stack, int num) {
        int index = -1;
        int counter = 0;
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            counter++;
            if (stack.top() == num) {
                index = counter;
            }
            tmp.push(stack.pop());
        }
        while (!tmp.isEmpty())
            stack.push(tmp.pop());

        return index;
    }

    public static int distance(Stack<Integer> stack) {
        int dis = lastPlace(stack, stack.top()) - firstPlace(stack, stack.top()) - 1;
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            if (firstPlace(stack, stack.top()) != lastPlace(stack, stack.top()))
                if (lastPlace(stack, stack.top()) - firstPlace(stack, stack.top()) - 1 < dis){
                    dis = lastPlace(stack, stack.top()) - firstPlace(stack, stack.top()) - 1;
                    System.out.println(stack.top());
                }
            tmp.push(stack.pop());
        }


        return dis;
    }
}
