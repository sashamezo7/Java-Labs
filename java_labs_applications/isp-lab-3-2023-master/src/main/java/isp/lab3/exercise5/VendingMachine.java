package isp.lab3.exercise5;

import java.util.Objects;
import java.util.Scanner;

public class VendingMachine {
    public String  product_name;
    public int quantity;
    public static int number_of_products=0;
    public int selection_id;
    public int cost;
    public static int credit=0;
    public static int total_money=100;

    public VendingMachine(String nume_produs,int cantitate,int id,int pret) {
        this.product_name=nume_produs;
        this.quantity=cantitate;
        this.selection_id=id;
        this.cost=pret;
        number_of_products++;
    }

    public void set_name(String m) {this.product_name = m;}

    public String get_name() {return this.product_name;}

    public void set_quantity(int c) {this.quantity = c;}

    public int get_quantity() {return this.quantity;}

    public void set_cost(int c) {this.cost = c;}

    public int get_cost() {return this.cost;}
    public void set_id(int i) {this.selection_id = i;}

    public int get_id() {return this.selection_id;}

    public int insertCoin(int value){
        total_money+=value;
        credit+=value;
       return credit;
    }

    public String selectProduct(int id){
        if(id==this.selection_id)
            return this.product_name;
        return "error";
    }

    public static void display_products(VendingMachine []v){
        for (VendingMachine vendingMachine : v) {
            if (vendingMachine.quantity != 0) {
                System.out.println("Numele produsului: " + vendingMachine.product_name + " Codul: " + vendingMachine.selection_id + " Costul: " + vendingMachine.cost);
            }
        }
    }


    public static void userMenu(VendingMachine []v) {
        Scanner myInput = new Scanner(System.in);
        int numar;

        do {

            System.out.println("Bine ati venit la Vending Machine !");
            System.out.println("comenzi disponibile: 1-Afisare produse");
            System.out.println("                     2-Selectre produse");
            System.out.println("                     3-Administrator");
            System.out.println("                     0-Iesire");

            numar = myInput.nextInt();

            switch (numar) {
                case 1:
                    VendingMachine.display_products(v);
                    break;
                case 2:
                    System.out.println("introduceti id:  ");
                    Scanner p = new Scanner(System.in);
                    int s = p.nextInt();
                    int ok = 0;
                    int ii=0;
                    for (int i = 0; i < v.length && ok == 0; i++)
                        if (!Objects.equals(v[i].selectProduct(s), "error")) {
                            System.out.println("ati selectat: " + v[i].selectProduct(s));
                            ok = 1;
                            ii=i;
                        }
                    if (ok == 0) {
                        System.out.println("ati introdus un id inexistent: ");
                    }

                    System.out.println("introduceti banii: ");

                    Scanner valoare=new Scanner(System.in);
                    int var=valoare.nextInt();
                    credit=0;

                    int credit_produs=v[ii].insertCoin(var);

                    if(credit_produs<v[ii].cost){
                        while (credit_produs<v[ii].cost) {
                            int de_patit = v[ii].cost - credit_produs;
                            System.out.println("mai aveti de platit: " + de_patit);
                            var=valoare.nextInt();
                            credit_produs=v[ii].insertCoin(var);
                        }
                    }
                    if (credit_produs>v[ii].cost){
                        int rest = credit_produs-v[ii].cost;
                        if(total_money<rest)
                            System.out.println("Ne pare rau nu avem cum sa va dam rest. Contactati managerul...");
                        else {
                            if(rest>=0) {
                                System.out.println("Rest: " + rest);
                                total_money-=rest;
                            }
                            System.out.println("Multumim pentru ca ati cumparat de la noi! ");

                        }

                    }
                    if (credit_produs==v[ii].cost){
                        System.out.println("Multumim pentru ca ati cumparat de la noi! ");
                    }
                    break;

                case 3:
                    System.out.println("Introduceti parola: ");
                    Scanner par=new Scanner(System.in);
                    String parola=par.next();
                    if(Objects.equals(parola, "Boss")) {
                        System.out.println("Soldul este de: " + total_money);
                        System.out.println("numarul de produse: "+ number_of_products);
                    }
                    else
                        System.out.println("parola gresita...");
                    break;
            }

        } while (numar != 0);

    }

}
