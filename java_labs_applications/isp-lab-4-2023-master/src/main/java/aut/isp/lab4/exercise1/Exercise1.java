package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController a = new AquariumController("Aqua","Xlarge");
        a.setCurrentTime(3.30F);
        System.out.print(a.toString());
    }
}
