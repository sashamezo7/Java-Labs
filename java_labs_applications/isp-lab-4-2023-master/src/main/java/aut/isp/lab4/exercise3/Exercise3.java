package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder f = new FishFeeder("Catalin SRL", "jmecher112");
        AquariumController acvariu = new AquariumController("Sasha SRL", "T321",f);

        acvariu.setFeedingTime(22.30F);
        acvariu.setCurrentTime(12.20F);
        acvariu.setCurrentTime(22.30F);

    }
}
