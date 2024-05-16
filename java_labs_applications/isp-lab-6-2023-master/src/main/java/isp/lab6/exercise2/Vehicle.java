package isp.lab6.exercise2;

public class Vehicle {
    String  VIN;
    String licensePlate;
    String make;
    String model;
    int year;

    public Vehicle(String VIN, String licensePlate, String make, String model, int year) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
