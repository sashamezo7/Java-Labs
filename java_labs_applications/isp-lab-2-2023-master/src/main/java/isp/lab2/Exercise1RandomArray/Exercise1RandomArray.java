package isp.lab2.Exercise1RandomArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1RandomArray {



    public static int[] getArrayOfRandomNumbers(int n, int min, int max) {
        // creează un obiect Random
        Random rand = new Random();

        // generează un număr întreg aleatoriu între 0 și 99
        int randomNumber = rand.nextInt(10);
        // afișează numărul întreg aleatoriu generat
        System.out.println("Numarul intreg aleatoriu generat este: " + randomNumber);


        return new int[]{randomNumber};
    }

    public static int[] readIntegerFromConsole(int[] a) {
        int number;
        int[] b=new int[a[0]];
        Scanner scanner = new Scanner(System.in);
        // citirea unui număr întreg de la consolă

        for(int i=0;i<a[0];i++) {
            System.out.print("Introduceti un numar intreg: ");
            number = scanner.nextInt();

            b[i]=number;
        }

        return b;
    }

    public static int[] findMaxAndMin(int[] a) {
        int[] vector = new int[2];
        if(a.length!=1) {
            int min = 20, max = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min)
                    min = a[i];
                if (a[i] > max)
                    max = a[i];
            }

            vector[0] = min;
            vector[1] = max;
        }
        else {
            vector[0] = a[0];
            vector[1] = a[0];
        }
        return vector;
    }

    public static void main(String[] args) {


       int[] a = getArrayOfRandomNumbers(10, 1, 10);
        int[] b= readIntegerFromConsole(a);


        int[] mm = findMaxAndMin(b);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}
