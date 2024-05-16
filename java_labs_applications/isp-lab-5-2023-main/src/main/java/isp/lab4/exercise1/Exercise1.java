package isp.lab4.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Dorobantilo","Cluj-Napoca");
        Customer customer1 = new Customer("22","Marian Ionel","0733978155",adress1);
        ProductCategory category = ProductCategory.Beauty;
        Order.Product product = new Order.Product("11", "sampon",23.5,category,customer1);
        System.out.println(product.toString());

        }
    }

