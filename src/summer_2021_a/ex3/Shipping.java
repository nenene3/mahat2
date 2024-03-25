package summer_2021_a.ex3;

public class Shipping {

    private String address;
    private Object[] arr;

    public double sum() {
        double sumO = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i] instanceof Book) {
                sumO += ((Book) arr[i]).getPrice();
            } else
                sumO += ((Clothes) arr[i]).getPrice();

        }

        return sumO;
    }
}
