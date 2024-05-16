package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession {
    private String username;
    private HashMap<Product,Integer> shoppingChart;

    public ActiveSession() {
        this.username = username;
        this.shoppingChart = new HashMap<>();
    }
    public void addToCart(Product product, int quantity){
        shoppingChart.put(product,quantity);
    }
}
