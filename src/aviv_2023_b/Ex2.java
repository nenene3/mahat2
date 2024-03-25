package aviv_2023_b;

public class Ex2 {
    public static void main(String[] args) {
    int[] arr = {1,2};
    Node<Integer> a = arrToList(arr);
    fix(a);
    while(a!=null){
        System.out.print(a+" ");
        a=a.getNext();
    }

    }
    public static void fix(Node<Integer> head){
        int counter=0;
        int sum =0;
        while(head.hasNext()) {
            counter++;
            sum += head.getValue();
            head = head.getNext();
        }
        counter++;
        sum+= head.getValue();
        if(sum!=0){
            head.setNext(new Node<>(-sum));
            head=head.getNext();
            counter++;
        }
        if(counter%2==1)
            head.setNext(new Node<>(0));

    }
    public static Node<Integer> arrToList(int[] arrayL) {
        Node<Integer> head = new Node<Integer>(arrayL[0]);
        Node<Integer> temp = head;
        for (int i = 1; i < arrayL.length; i++) {
            temp.setNext(new Node<Integer>(arrayL[i]));
            temp=temp.getNext();
        }

        return head;

    }
}
