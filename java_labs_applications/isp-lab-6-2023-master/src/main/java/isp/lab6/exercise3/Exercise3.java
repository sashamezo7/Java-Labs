package isp.lab6.exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Product product1 = new Product("Coca Cola",5);
        Product product2 = new Product("Pepsi",5.5);
        Product product3 = new Product("Cipsuri", 10);
        Product product4 = new Product("Energizant",7);
        OnlineStore store = new OnlineStore();
        store.setProduct(product1);
        store.setProduct(product2);
        store.setProduct(product3);
        store.setProduct(product4);

        UserInterface user = new UserInterface(loginSystem,store);
        user.loadInterface();

    }
}
