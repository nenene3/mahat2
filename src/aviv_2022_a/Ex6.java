package aviv_2022_a;

import summer_2021_a.Node;

public class Ex6 {

    public static void main(String[] args) {
        int[] arr = {80,40,90,-1,95,-1,85,80,-1};
        Node<Integer> a = arrToList(arr);
        Node<Double> ret = avg(a);
        while(ret!=null){
            System.out.println(ret);
            ret=ret.getNext();
        }
    }
    public static Node<Double> avg(Node<Integer> head){
        Node<Double> a = new Node<>(0.0);
        Node<Double> ret = a;
        int counter=0;
        double sum=0;

        while(head!=null){
            if(head.getValue()==-1){
                if(counter==0){
                    head=head.getNext();
                    break;
                }else{
                    a.setValue(sum/counter);
                    head=head.getNext();
                    sum=0;
                    counter=0;
                    break;
                }
            }
            sum+=head.getValue();
            counter++;
            head=head.getNext();
        }

        while(head!=null){
            if(head.getValue()==-1){
                if(counter==0 || sum==0){
                    a.setNext(new Node<Double>(0.0));
                    a=a.getNext();
                }else{
                    a.setNext(new Node<Double>(sum/counter));
                    a=a.getNext();
                    sum=0;
                    counter=0;
                }
            }else{
                counter++;
                sum+= head.getValue();
            }
            head=head.getNext();
        }
        return ret;
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