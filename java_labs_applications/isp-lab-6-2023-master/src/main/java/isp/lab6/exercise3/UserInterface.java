package isp.lab6.exercise3;

import java.util.Scanner;

public class UserInterface {

    public ActiveSession activeSession = new ActiveSession();

    public LoginSystem loginSyst ;
    public OnlineStore store;

    public UserInterface(LoginSystem loginSyst, OnlineStore store) {
        this.loginSyst = loginSyst;
        this.store = store;
    }

    public void loadInterface(){
        Scanner option = new Scanner(System.in);
        int numar;
        do {
            System.out.println("Bine ati venit la Online Store !");
            System.out.println("comenzi disponibile: 1-Login");
            System.out.println("                     2-Register");
            System.out.println("                     0-Iesire");
            numar = option.nextInt();
            switch (numar){
                case 1:
                    Scanner log = new Scanner(System.in);
                    String input1,input2;
                    System.out.print("Username: ");
                    input1 = log.nextLine();
                    System.out.print("Password: ");
                    input2 = log.nextLine();
                    if(loginSyst.login(input1, input2)){

                        store.addSession(input1,activeSession);
                       do{
                            System.out.println("Logare efectuata cu susces! ");
                            System.out.println("comenzi disponibile: 1-View Products");
                            System.out.println("                     2-Add products to cart");
                            System.out.println("                     3-View cart");
                            System.out.println("                     4-Checkout");
                            System.out.println("                     5-Logout");

                            numar = option.nextInt();

                            switch (numar){
                                case 1:
                                    for (Product product : store.getProduct()) {
                                        System.out.println(product.getName() + " - " + product.getPrice());
                                    }
                                    break;
                                case 5: break;

                            }

                        } while(numar!=5);

                    }
                    else {
                        System.out.println("Username sau Parola inexistenta...");
                        break;
                    }
                    break;
                case 2:
                    Scanner reg = new Scanner(System.in);
                    System.out.print("Username: ");
                    input1 = reg.nextLine();
                    System.out.print("Password: ");
                    input2 = reg.nextLine();
                    if(loginSyst.register(input1, input2)){

                        store.addSession(input1,activeSession);
                        do{
                            System.out.println("Inregistrare efectuata cu susces! ");
                            System.out.println("comenzi disponibile: 1-View Products");
                            System.out.println("                     2-Add products to cart");
                            System.out.println("                     3-View cart");
                            System.out.println("                     4-Checkout");
                            System.out.println("                     5-Logout");

                            numar = option.nextInt();

                            switch (numar){
                                case 1:
                                    for (Product product : store.getProduct()) {
                                        System.out.println(product.getName() + " - " + product.getPrice());
                                    }
                                    break;
                                case 5: break;
                            }

                        } while(numar!=5);

                    }
                    else {
                        System.out.println("Username si parola existenta, va rugam sa va logati");
                        break;
                    }
            }

        }while(numar!=0);
    }
}
