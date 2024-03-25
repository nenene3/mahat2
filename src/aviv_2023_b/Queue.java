package aviv_2023_b;

class Queue<T>
{
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(T x) {
        Node<T> temp = new Node<T>(x);
        if (this.first == null)
            this.first = temp;
        else
            this.last.setNext(temp);
        this.last = temp;
    }

    public T remove() {
        T x = this.first.getValue();
        this.first = this.first.getNext();
        if (this.first == null)
            this.last = null;
        return x;
    }

    public T head() {
        return this.first.getValue();
    }

    public boolean IsEmpty() {
        return this.first == null;
    }

    public String toString() {
        String s = "[ ";
        Node<T> p = this.first;
        while (p .hasNext()) {
            s = s + p.getValue().toString() + " , ";
            p = p.getNext();
        }
        s = s + p.getValue().toString() + " ]";
        return s;
    }

}
	