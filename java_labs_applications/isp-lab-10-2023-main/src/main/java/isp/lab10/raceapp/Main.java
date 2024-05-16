package isp.lab10.raceapp;

//import isp.lab10.racedemo.Car;
//import isp.lab10.racedemo.CarPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
        JFrame frame = new JFrame("Semaphore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame.getContentPane().add(semaphorePanel);
        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();
        try{
            semaphoreThread.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Race!");
        JFrame frame1 = new JFrame("Car Race");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame1.getContentPane().add(carPanel);
        frame1.pack();
        frame1.setSize(500,300);
        frame1.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        PlaySound ps = new PlaySound();
        ps.playSound();
        try{
            car1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            car2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            car3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            car4.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        ps.stopSound();




    }
}