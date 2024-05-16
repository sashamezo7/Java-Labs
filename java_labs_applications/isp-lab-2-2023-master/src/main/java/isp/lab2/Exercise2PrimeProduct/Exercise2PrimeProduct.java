package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static int prim(int a)
    {
        if(a<2) return 0;
        if(a==2) return 1;
        for(int i=2;i<=a/2;i++)
            if(a%i==0)
                return 0;
        return 1;
    }
    public static long getPrimeProduct(int n, int m) {

        int produs=1;
        for(int i=n;i<=m;i++)
            if(prim(i)==1)
                produs=produs*i;

        return produs;
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
