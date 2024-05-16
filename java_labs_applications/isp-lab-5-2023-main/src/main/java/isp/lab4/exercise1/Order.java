package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {

    private String orderid;
    private LocalDateTime date;
    private double totalPrice;
    public  Product []products = new Product[10];

    public Order(Product[] products) {
        this.products = products;
    }

    public Order() {
    }

    static public class Product {
        private String productid;
        private String name;
        private double price;
        private ProductCategory productCategory;
        private Customer customer;

        public Product(String productid, String name, double price, ProductCategory productCategory, Customer customer) {
            this.productid = productid;
            this.name = name;
            this.price = price;
            this.productCategory = productCategory;
            this.customer = customer;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productid='" + productid + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", productCategory=" + productCategory +
                    ", customer=" + customer +
                    '}';
        }
    }

}
