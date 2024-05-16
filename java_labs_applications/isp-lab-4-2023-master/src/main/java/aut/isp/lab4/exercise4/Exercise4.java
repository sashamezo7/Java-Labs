package aut.isp.lab4.exercise4;


public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder f = new FishFeeder("Catalin SRL", "jmecher112");
        AquariumController acvariu = new AquariumController("Sasha SRL", "T321",f);
        float ore=0;
        while(ore!=23){
            acvariu.setCurrentTime(ore);
            ore++;
        }
        System.out.print("\n");
        System.out.print("timpul lumiinlor aprinse: "+acvariu.getLightOnTime()+" ");
        System.out.print("\n");
        System.out.print("timpul luminilor stinse: "+acvariu.getLightsOffTime());

    }
}
