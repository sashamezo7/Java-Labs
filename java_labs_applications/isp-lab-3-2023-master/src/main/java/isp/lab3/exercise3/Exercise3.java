package isp.lab3.exercise3;

public class Exercise3 {

    public static void main(String[] args){
        Vehicle v=new Vehicle("Mercedes","S-class",240,'D');
        Vehicle v1=new Vehicle("BMW","seria 7",250,'B');

        v.set_model("Audi");
        v.set_type("A8");
        v.set_speed(230);
        v.set_fuelType('D');
        v1.set_model("Audi");
        v1.set_type("A8");
        v1.set_speed(230);
        v1.set_fuelType('D');

        System.out.println(v.get_model());
        System.out.println(v.get_type());
        System.out.println(v.get_speed());
        System.out.println(v.get_fuelType());
        System.out.println(v1.get_model());
        System.out.println(v1.get_type());
        System.out.println(v1.get_speed());
        System.out.println(v1.get_fuelType());

        System.out.println("cele doua masini sunt identice: "+v.equals(v1));
        System.out.println("numarul obiectelor create: ");
        Vehicle.number_vehicle();
    }
}
