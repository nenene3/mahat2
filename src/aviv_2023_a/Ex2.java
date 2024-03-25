package aviv_2023_a;

public class Ex2 {
    public static void main(String[] args) {

    }

    public static int numDigit(Node<Integer> head) {
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.getNext();
        }

        return counter;
    }

    public static int compare(Node<Integer> num1, Node<Integer> num2) {
        int count1 = numDigit(num1);
        int count2 = numDigit(num2);

        if (count1 != count2)
            return count1 > count2 ? 1 : 2;

        while (num1 != null && num2 != null) {
            if (num1.getValue() != num2.getValue())
                return num1.getValue() > num2.getValue() ? 1 : 2;
            num1 = num1.getNext();
            num2 = num2.getNext();
        }

        if (num1 == null && num2 == null)
            return 0;

        return num1 != null ? 1 : 2;
    }
}
