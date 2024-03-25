package summer_2021_a;

public class Ex2 {
    public static void main(String[] args) {

        Queue<Integer> check= new Queue<>();
        check.insert(2);
        check.insert(5);
        check.insert(5);
        check.insert(7);
        check.insert(2);
        check.insert(4);
        check.insert(1);
        check.insert(3);
        check.insert(2);
        check.insert(5);
        check.insert(5);
        check.insert(1);
        Queue<Integer> ret = doubleCount(check);
        System.out.println(check);
        System.out.println(ret);
    }

    public static Queue<Integer> doubleCount(Queue<Integer> queue) {
        Queue<Integer> ret = new Queue<>();
        Queue<Integer> tmp = new Queue<>();
        queue.insert(null);
        while (queue.head() != null) {
            tmp.insert(queue.head());
            queue.insert(queue.remove());
        }
        queue.remove();
        int shown;
        while (!tmp.IsEmpty()){
            shown=0;
            int search = tmp.remove();
            tmp.insert(null);
            while(tmp.head()!=null){
                if(tmp.head()==search){
                    shown++;
                    if(shown==2 && !isExist(ret,search)){
                        ret.insert(search);
                        tmp.remove();
                    }else {
                        tmp.remove();
                    }
                }else{
                    tmp.insert(tmp.remove());
                }
            }
            tmp.remove();
        }
            return ret;
    }
    public static boolean isExist(Queue<Integer> ret,int search){
        ret.insert(null);
        boolean b=false;
        while(ret.head()!=null){
            if(search== ret.head()){
                b=true;
            }
            ret.insert(ret.remove());
        }
        ret.remove();

        return b;
    }
}
