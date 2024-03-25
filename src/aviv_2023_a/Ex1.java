package aviv_2023_a;

public class Ex1 {
    public static void main(String[] args) {

        Queue<Integer> a = new Queue<>();
        a.insert(80);
        a.insert(90);
        a.insert(100);
        a.insert(75);
        a.insert(96);
        a.insert(100);
        a.insert(100);
        a.insert(97);
        a.insert(96);
        a.insert(88);
        a.insert(94);
        Queue<Integer> test = new Queue<>();
        test.insert(3);
        test.insert(2);
        test.insert(4);
        test.insert(2);
        Queue<Double> ret = avgQue(test, a);
        System.out.println(ret);
    }

    public static Queue<Double> avgQue(Queue<Integer> test, Queue<Integer> marks) {
        test.insert(null);
        Queue<Double> ret = new Queue<>();
        while (test.head() != null) {
            double sum = 0;
            for (int i = 0; i < test.head(); i++) {
                sum += marks.head();
                marks.insert(marks.remove());
            }
            ret.insert(sum / test.head());
            test.insert(test.remove());
        }
        return ret;
    }
}
