package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.*;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */

    public static String[] searchSubstrings(String input, String substring) {

        String[] sir=input.split(",");
        int nr=0;

        for(int i=0;i< sir.length;i++)
        {
            if(sir[i].contains(substring))
                nr++;
        }

        String[] rezultat=new String[nr];
        int j=0;
        for(int i=0;i< sir.length;i++)
        {

            if(sir[i].contains(substring))
            {
                rezultat[j]=sir[i];
                j++;
            }

        }
        return rezultat;

    }


    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        return scanner.nextLine();
    }
    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the substring: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(readFromConsoleInt(),readFromConsole());
        for (String string : result) {
                //if(string!= null)
                    System.out.println(string);
        }
    }
}
