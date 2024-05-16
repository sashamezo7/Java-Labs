package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String[] args){
        MyPoint p = new MyPoint();
        MyPoint p1 = new MyPoint();

        p.set_xyz(-2,3,2);
        p1.set_xyz(10,-4,-5);

        System.out.println(p.distance(1,2,1));
        System.out.println("the distance between the 2 points is: "+p.distance(p1));
    }
}
