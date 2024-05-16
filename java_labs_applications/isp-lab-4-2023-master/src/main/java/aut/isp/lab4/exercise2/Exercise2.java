package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {

        FishFeeder f = new FishFeeder("Catalin SLR","jmecher");
        f.fillUp();
        f.feed();
       System.out.println(f.toString());
    }
}
