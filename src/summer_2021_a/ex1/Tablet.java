package summer_2021_a.ex1;

public class Tablet {

    private String name;
    private String Kind;
    private char type;
    private double size;
    private double price;

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", Kind='" + Kind + '\'' +
                ", type=" + type +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public Tablet(String name, String kind, char type, double size, double price) {
        this.name = name;
        Kind = kind;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isSame(Tablet other){
        return this.name.equals(other.name) && this.Kind.equals(other.Kind) && this.size==other.size;
    }
}
