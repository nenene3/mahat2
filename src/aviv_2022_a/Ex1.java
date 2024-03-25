package aviv_2022_a;

import summer_2021_a.Node;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        Node<Integer> a = arrToList(arr);
         dupNode(a);
//        dupOrder(a);
        while (a != null) {
            System.out.print(a+" ");
            a = a.getNext();
        }
    }

    public static void dupNode(Node<Integer> head) {

        while (head != null) {
            Node<Integer> between = new Node<Integer>(head.getValue(), head.getNext());
            head.setNext(between);
            head = head.getNext().getNext();
        }
    }

    public static void dupOrder(Node<Integer> head) {
        if (head == null)
            return;
        Node<Integer> a = new Node<Integer>(head.getValue());
        Node<Integer> aStart= a;
        if(!head.hasNext()){
            head.setNext(a);
            return;
        }
        head=head.getNext();
        while (head.hasNext()) {
            a.setNext(new Node<Integer>(head.getValue()));
            a=a.getNext();
            head=head.getNext();
        }
        a.setNext(new Node<Integer>(head.getValue()));
        head.setNext(aStart);

    }

    public static Node<Integer> arrToList(int[] arrayL) {
        Node<Integer> head = new Node<Integer>(arrayL[0]);
        Node<Integer> temp = head;
        for (int i = 1; i < arrayL.length; i++) {
            temp.setNext(new Node<Integer>(arrayL[i]));
            temp = temp.getNext();
        }

        return head;

    }
}
