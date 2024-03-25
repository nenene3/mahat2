package aviv_2022_a;

import summer_2021_a.Stack;

public class Ex2 {
    public static void main(String[] args) {

        Stack<Integer> test = new Stack<>();
        test.push(7);
        test.push(5);
        test.push(10);
        test.push(2);
        test.push(12);
        test.push(6);
        System.out.println(test);
        clean(test);
        
    }

    public static void clean(Stack<Integer> stack) {
        Stack<Integer> tmp = new Stack<>();
        int counter = 0;
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.top();
            counter++;
            tmp.push(stack.pop());
        }
        Stack<Integer> tmp2 = new Stack<>();
        
        int avg = sum / counter;
        while(!tmp.isEmpty()){
            if(tmp.top()>avg){
                tmp2.push(tmp.pop());
            }else{
                stack.push(tmp.pop());
            }
        }
        while(!tmp2.isEmpty()){
            stack.push(tmp2.pop());
        }
        System.out.println(stack);
    }
}
