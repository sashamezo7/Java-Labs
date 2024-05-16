package isp.lab4.exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String []args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int option;

        do{

            System.out.println("Bine ati venit la Formula 1 circuitul Las Vegas !");
            System.out.println("comenzi disponibile: 1-Buy ticket");
            System.out.println("                     2-Selectre produse");
            System.out.println("                     3-Administrator");
            System.out.println("                     0-Iesire");
            option = input.nextInt();

            switch (option){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    Client client = new Client();
                    Adress adress = new Adress();
                    System.out.print("First Name: ");
                    String FirstName = scanner.nextLine();
                    client.setFirstName(FirstName);
                    System.out.print("Last Name: ");
                    String LastName = scanner.nextLine();
                    client.setLastName(LastName);
                    System.out.print("City: ");
                    String City = scanner.nextLine();
                    adress.setCity(City);
                    System.out.print("Street: ");
                    String Street = scanner.nextLine();
                    adress.setStreet(Street);
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    adress.setNumber(number);
                    System.out.print("Post Code: ");
                    int postCode = scanner.nextInt();
                    adress.setPostCode(postCode);
                    client.setAdress(adress);
                    System.out.println(client.adress.toString());

                    break;
            }

        }while(option!=0);
    }
}
