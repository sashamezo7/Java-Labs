package isp.lab4.exercise1;

public class Customer {
    private String customerid;
    private String name;
    private String phone;
    protected Adress adress;

    public Customer(String customerid, String name, String phone, Adress adress) {
        this.customerid = customerid;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }
}
