package aviv_2023_b;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr={1,3,6,13,27,300,600};
        Node<Integer> a = arrayToList(arr);

        System.out.println(isSuper(a));
        System.out.println(addToSuper(a,17000));




      while(a!=null){
            System.out.print(a +" ");
            a=a.getNext();
        }


    }

    public static boolean isSuper(Node<Integer> head){
        int sum = head.getValue();
        head=head.getNext();
        while(head!=null){
            if(sum>= head.getValue())
                return false;
            sum+= head.getValue();
            head=head.getNext();
        }


        return true;
    }
    public static boolean addToSuper(Node<Integer> head,int num){
        Node<Integer> candid = head;
        Node<Integer> tmp = head.getNext();
        int sum= head.getValue();
        while(tmp!=null){
            if(sum >= num)
                break;
            candid=tmp;
            sum+= tmp.getValue();
            tmp=tmp.getNext();
        }
        Node<Integer> newNode = new Node<>(num,candid.getNext());
        candid.setNext(newNode);
        if(isSuper(head))
            return true;

        candid.setNext(newNode.getNext());
        return false;
    }



    public static Node<Integer> arrayToList(int[] arr){
        Node<Integer> ret = new Node<>(arr[0]);
        Node<Integer> tmp = ret;
        for(int i=1;i< arr.length;i++){
            tmp.setNext(new Node<>(arr[i]));
            tmp=tmp.getNext();
        }
        return ret;
    }
}
