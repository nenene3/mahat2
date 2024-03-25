package summer_2021_b.ex6;

import summer_2021_a.Node;

public class ForeignCurrency {
    private String name;
    private Node<Double> rates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node<Double> getRates() {
        return rates;
    }

    public void setRates(Node<Double> rates) {
        this.rates = rates;
    }

    public ForeignCurrency(String name, Node<Double> rates) {
        this.name = name;
        this.rates = rates;
    }

    public void addRate(Double rate) {
        Node<Double> add = new Node<Double>(rate, this.rates);
        this.rates = add;

    }

    public boolean high() {

        double highest = this.rates.getValue();
        Node<Double> current = this.rates.getNext();

        while (current != null) {
            if (current.getValue() >= highest)
                return false;
            current = current.getNext();
        }
        return true;
    }

    public boolean isWorthInvesting() {
        if (this.high())
            return false;

        Node<Double> currNode = this.rates.getNext();
        Double up = this.rates.getValue();

        for (int i = 0; i < 4; i++) {
            if (up <= currNode.getValue())
                return false;
            currNode = currNode.getNext();
        }

        return true;
    }
}
