package summer_2023_b;

public class Ex2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 7, 8, 4, 6, 11, 7};
        Node<Integer> a = arrToList(arr);
        Node<Integer> b = split(a);
        while (a != null) {
            System.out.print(a + " ");
            a = a.getNext();
        }
        System.out.println();
        System.out.println("-------");
        while (b != null) {
            System.out.print(b + " ");
            b = b.getNext();
        }
    }

    public static Node<Integer> split(Node<Integer> chain) {
        Node<Integer> tmp = null;
        Node<Integer> currentTmp = null;
        Node<Integer> candid = chain;
        int valid = chain.getValue() % 2;


        while (chain != null) {
            if (chain.getValue() % 2 != valid) {
                if (tmp == null) {
                    tmp = chain;
                    currentTmp = tmp;
                    candid.setNext(tmp.getNext());
                } else {
                    candid.setNext(chain.getNext());
                    currentTmp.setNext(chain);
                    currentTmp = currentTmp.getNext();
                }

            } else {
                candid = chain;
            }


            chain = chain.getNext();
        }


        return tmp;
    }

    public static Node<Integer> arrToList(int[] arrayL) {
        Node<Integer> head = null;
        Node<Integer> temp = null;
        for (int i = 0; i < arrayL.length; i++) {
            if (i == 0) {
                head = new Node<Integer>(arrayL[i]);
                temp = head;
            } else {
                while (temp.hasNext()) {
                    temp = temp.getNext();
                }
                temp.setNext(new Node<Integer>(arrayL[i]));
            }
        }

        return head;

    }
}
