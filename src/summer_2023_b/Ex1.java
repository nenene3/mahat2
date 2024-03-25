package summer_2023_b;




public class Ex1 {
    public static void main(String[] args) {

        Queue<Integer> a = new Queue<>();
        a.insert(2);
        a.insert(10);
        a.insert(12);
        a.insert(3);
        a.insert(7);
        a.insert(4);
        a.insert(1);
        System.out.println(a);
        change(a,9);
        
    }
    public static boolean strangers(int num1,int num2){
        for(int i = (Math.min(num1, num2)); i>=2; i--){
            if(num1%i ==0 &&num2%i==0)
                return false;
        }
        return true;
    }
    public static void change(Queue<Integer> a,int num ){
        Queue<Integer> tmp = new Queue<>();
        a.insert(null);
        while(a.head()!=null){
            if(strangers(a.head(),num))
                a.insert(a.remove());
            else
                tmp.insert(a.remove());
        }
        a.remove();
        while(!tmp.IsEmpty())
            a.insert(tmp.remove());


        System.out.println(a);
    }
}
