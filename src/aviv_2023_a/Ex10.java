package aviv_2023_a;

public class Ex10 {
    public static void main(String[] args) {

    }
    public static boolean isPerfect(Queue<Stack<Integer>> q){
        q.insert(null);
        if(isUpper(q.head()))
            return false;
        int end = endNumber(q.head());
        int counter=count(q.head());
        int biggest=endNumber(q.head());
        q.insert(q.remove());
        while(q.head()!=null){
            int tmpCounter=count(q.head());
            int tmpBiggest=endNumber(q.head());
            if(tmpBiggest>biggest && tmpCounter>counter && isUpper(q.head()) && end ==q.head().top()){
                counter=tmpCounter;
                biggest=tmpBiggest;
                end=endNumber(q.head());
            }

            q.insert(q.remove());
        }

        return true;
    }

    //I can combine count and isUpper too lazy to do it
    public static int count(Stack<Integer> stack){
        int counter=0;
        Stack<Integer> tmp = new Stack<>();
        while(!stack.isEmpty()){
            counter++;
            tmp.push(stack.pop());
        }
        return counter;
    }
    public static boolean isUpper(Stack<Integer> stack){
        int num= stack.pop();
        boolean ret = true;
        Stack<Integer> tmp = new Stack<>();
        while(!stack.isEmpty()){
            if(num> stack.top()){
                ret=false;
                break;
            }
            tmp.push(stack.pop());
        }
        while(tmp.isEmpty()){
            stack.push(tmp.pop());
        }
        return ret;
    }
    public static int endNumber(Stack<Integer> stack){
        int ret=0;
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()){
            ret=stack.top();
            tmp.push(stack.pop());
        }
        clean(stack,tmp);
        return ret;
    }
    public static void clean(Stack stack,Stack<Integer> tmp){
        while(!tmp.isEmpty()){
            stack.push(tmp.pop());
        }
    }


}
