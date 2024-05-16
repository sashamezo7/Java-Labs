package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static public int number=0;

    public Vehicle(String modell, String tip, int viteza, char combustibil) {
        this.model = modell;
        this.type = tip;
        this.speed = viteza;
        this.fuelType = combustibil;
        number++;
    }

    public void set_model(String m) {
        this.model = m;
    }

    public String get_model() {
        return this.model;
    }

    public void set_type(String tip) {
        this.type = tip;
    }

    public String get_type() {
        return this.type;
    }

    public void set_speed(int viteza) {
        this.speed = viteza;
    }

    public int get_speed() {
        return this.speed;
    }

    public void set_fuelType(char combustibil) {
        if (combustibil == 'D' || combustibil == 'B')
            this.fuelType = combustibil;
        else System.out.println("Tipul de combustibil trebuie sa fie D sau B...");
    }

    public char get_fuelType() {
        return this.fuelType;
    }

    public String toString() {
        return this.model + " (" + this.type + ") " + " speed " + this.speed + " fuel type " + this.fuelType;
    }

    public boolean equals(Vehicle other) {
        if (!Objects.equals(this.model, other.model)) return false;
        if (!Objects.equals(this.type, other.type)) return false;
        if (this.speed != other.speed) return false;
        if (this.fuelType != other.fuelType) return false;
        return true;
    }
    public static void number_vehicle() {
        System.out.println(number);
    }

}
