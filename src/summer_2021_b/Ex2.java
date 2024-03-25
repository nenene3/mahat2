package summer_2021_b;

import summer_2021_a.Node;

public class Ex2 {
    public static void main(String[] args) {

        // int[] arr= {1,1,2,4,8,16,32};
        int[] rev= {64,32,16,8,8,4};
        Node<Integer> revN= arrToList(rev);
        System.out.println(isOpposite(revN));
        while(revN!=null)
        {
            System.out.println(revN.getValue());
            revN=revN.getNext();
        }
    }
    public static boolean isStairs(Node<Integer> head ){
        int count = head.getValue();
        head=head.getNext();
        while(head!=null){
            if(head.getValue()!=count)
                return false;
            count+=count;
            head=head.getNext();
        }
        return true;
    }
    public static boolean isOpposite(Node<Integer> head ){
        if(!head.hasNext())
            return true;
        int count = head.getValue()/2 ;
        head=head.getNext();
        int candid= head.getValue();
        while(head.hasNext()){
            if(head.getValue()!=count){
                return false;
            }
            count/=2;
            candid=head.getValue();
            head=head.getNext();
        }

        return candid== head.getValue();
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
