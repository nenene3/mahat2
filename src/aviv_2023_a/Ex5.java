package aviv_2023_a;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 7, 9, 9, 7, 7, 2, 9};
        Node<Integer> a = arrToList(arr);
        System.out.println(minDis(a));
//        System.out.println(distance(a,4));
    }

    public static int distance(Node<Integer> head, int num) {
        int start = -1;
        int end = 0;
        int counter = 0;
        while (head != null) {
            if (head.getValue() == num) {
                start = counter;
                break;
            }
            counter++;
            head = head.getNext();
        }
        while (head != null) {
            end = head.getValue() == num ? 0 : end + 1;
            head = head.getNext();
        }

        return start != -1 ? start + end : -1;
    }

    public static int minDis(Node<Integer> lst) {
        int ret = distance(lst, lst.getValue());
        int number = lst.getValue();
        Node<Integer> current = lst;
        while (current != null) {
            int check = distance(lst, current.getValue());
            if (ret > check) {
                ret = check;
                number = current.getValue();
            }
            current = current.getNext();
        }


        return number;
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
