package isp.lab4.exercise1;

import isp.lab4.exercise1.Adress;
import isp.lab4.exercise1.Adress;
import isp.lab4.exercise1.Customer;
import isp.lab4.exercise1.Order;
import isp.lab4.exercise1.Order.Product;
import isp.lab4.exercise1.ProductCategory;
import org.junit.Test;

public class Exercise1Test {
    @Test
    public void testExercise1(){
        Adress adress1 = new Adress("Dorobantilo","Cluj-Napoca");
        Customer customer1 = new Customer("22","Marian Ionel","0733978155",adress1);
        ProductCategory category = ProductCategory.Beauty;
        Order.Product product = new Order.Product("11", "sampon",23.5,category,customer1);
        System.out.println(product.toString());

    }
}