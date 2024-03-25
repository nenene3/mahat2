package summer_2023_b.ex10;

import summer_2021_a.Node;

public class Client {
    private String id;
    private Node<Integer> codeList;
    private int totalSum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Node<Integer> getCodeList() {
        return codeList;
    }

    public void setCodeList(Node<Integer> codeList) {
        this.codeList = codeList;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public Client(String id, Node<Integer> codeList, int totalSum) {
        this.id = id;
        this.codeList = codeList;
        this.totalSum = totalSum;
    }

    public Client(String id) {
        this.id = id;
        this.codeList = null;
        this.totalSum = 0;
    }

    public void addApCode(int code) {
        Node<Integer> current = this.codeList;
        while (current != null) {
            if (current.getValue() == code)
                return;
            current = codeList.getNext();
        }
        this.codeList = new Node<>(code, this.codeList);
        this.totalSum++;
    }
}
