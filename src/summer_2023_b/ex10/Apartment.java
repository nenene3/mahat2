package summer_2023_b.ex10;

public class Apartment {
    private int code;
    private String city;
    private int numRooms;
    private int numPictures;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getNumPictures() {
        return numPictures;
    }

    public void setNumPictures(int numPictures) {
        this.numPictures = numPictures;
    }

    public Apartment(int code, String city, int numRooms, int numPictures) {
        this.code = code;
        this.city = city;
        this.numRooms = numRooms;
        this.numPictures = numPictures;
    }
}
