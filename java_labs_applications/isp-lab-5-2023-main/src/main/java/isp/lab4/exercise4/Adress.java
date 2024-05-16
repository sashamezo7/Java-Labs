package isp.lab4.exercise4;

public class Adress {
    private String street;
    private String city;
    private int number;
    private int postCode;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getNumber() {
        return number;
    }

    public int getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number=" + number +
                ", postCode=" + postCode +
                '}';
    }
}
