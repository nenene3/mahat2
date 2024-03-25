package summer_2021_b;

public class Ex1 {
    public static void main(String[] args) {

        Queue<Integer> a = ret(4);
        System.out.println(a);
    }

    public static Queue<Integer> ret(int n) {

        Queue<Integer> a = new Queue<Integer>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                a.insert(i);
            }
        }

        return a;
    }
}
