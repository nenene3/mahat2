package aviv_2023_b;


public class Ex1 {
    public static void main(String[] args) {

        Queue<Integer> tmp = new Queue<>();
        tmp.insert(80);
        tmp.insert(80);
        tmp.insert(80);
        tmp.insert(-1);
        tmp.insert(3);
        tmp.insert(4);
        tmp.insert(-1);
        tmp.insert(-1);
        tmp.insert(80);
        tmp.insert(80);
        tmp.insert(-1);
        System.out.println(tmp);
        Queue<Integer> a = arrangeData(tmp);
        System.out.println(a);
    }

    public static Queue<Integer> arrangeData(Queue<Integer> marks) {

        Queue<Integer> test = new Queue<>();
        marks.insert(-2);
        int counter = 0;
        while (marks.head() != -2) {
            if (marks.head() == -1) {
                test.insert(counter);
                counter=0;
                marks.remove();
            }else{
                counter++;
                marks.insert(marks.remove());
            }
        }
        return test;
    }
}
