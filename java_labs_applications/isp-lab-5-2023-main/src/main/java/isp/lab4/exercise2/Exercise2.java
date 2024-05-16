package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String []args){
        Laptop laptop = new Laptop(0);
        SmartPhone smartPhone = new SmartPhone(0);
        SmartWatch smartWatch = new SmartWatch(0);

        laptop.charge(10);
        smartPhone.charge(30);
        smartWatch.charge(50);

        System.out.println("Laptopul s-a incarcat: " + laptop.getBatteryLevel() + "%\n");
        System.out.println("SmartPhone s-a incarcat: " + smartPhone.getBatteryLevel() + "%\n");
        System.out.println("SmartWatch s-a incarcat: " + smartWatch.getBatteryLevel() + "%\n");


    }
}
