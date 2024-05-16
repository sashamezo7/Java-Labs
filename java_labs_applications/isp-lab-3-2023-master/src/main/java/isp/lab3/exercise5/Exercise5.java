package isp.lab3.exercise5;

import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args){

        VendingMachine []v = new VendingMachine[6];

        v[0]= new VendingMachine("Pepsi",10,113,5);
        v[1]= new VendingMachine("Cola",12,144,6);
        v[2]= new VendingMachine("Lays sare",3,155,7);
        v[3]= new VendingMachine("Lays maxx ",8,156,8);
        v[4]= new VendingMachine("Bake Rolls usturoi",10,160,10);
        v[5]= new VendingMachine("Bake Rolls sare",2,161,7);

        VendingMachine.userMenu(v);


    }
}

