package summer_2021_b.ex6;

import summer_2021_a.Node;

public class Main {
    public static void main(String[] args) {
        double[] arr = { 8, 3, 4, 3, 4, 2, 9, 91 };
        Node<Double> a = arrToList(arr);
        ForeignCurrency name = new ForeignCurrency("hi", a);
        System.out.println(name.isWorthInvesting());
    }

    public static Node<Double> arrToList(double[] arrayL) {
        Node<Double> head = new Node<Double>(arrayL[0]);
        Node<Double> temp = head;
        for (int i = 1; i < arrayL.length; i++) {
            temp.setNext(new Node<Double>(arrayL[i]));
            temp = temp.getNext();
        }

        return head;

    }
}
