package summer_2021_a.ex7;

import summer_2021_a.Node;

public class Memory {
    private Node<Data> start;

    public Memory(int totalSize) {
        this.start = new Node<Data>(new Data(totalSize));

    }

    public boolean dangerState() {
        Node<Data> current = this.start;
        int all = 0;
        int allAvl = 0;
        while (current != null) {
            all += current.getValue().getSize();
            if (current.getValue().isFree())
                allAvl += current.getValue().getSize();
            current = current.getNext();
        }

        return all * 0.10 > allAvl;
    }

    public boolean firstFit(int num) {
        if (this.dangerState())
            return false;

        Node<Data> current = this.start;
        while (current != null) {
            if (current.getValue().getSize() >= num && current.getValue().isFree()) {
                current.getValue().setFree(false);
                if (current.getValue().getSize() == num) {
                    return true;
                }
                current.getValue().setSize(current.getValue().getSize() - num);
                Node<Data> between = new Node<>(new Data(num), current.getNext());
                current.setNext(between);
            }
            current = current.getNext();
        }

        return false;
    }
}
