package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OnlineStore {
    private List <Product> product = new ArrayList<>();
    private HashMap <String,ActiveSession> session = new HashMap<>();

    public OnlineStore() {
    }
    public OnlineStore(List<Product> product) {
        this.product = product;
    }
    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(Product products) {
        product.add(products);
    }

    protected void addSession(String username,ActiveSession activeSession){
        session.put(username,activeSession);
    }
    protected void removeSession(String username){
        session.remove(username);
    }

}
