package isp.lab3.exercise4;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class MyPoint {
    public int x;
    public int y;
    public int z;

    public MyPoint(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public MyPoint(int xx,int yy,int zz){
        this.x=xx;
        this.y=yy;
        this.z=zz;
    }
    public void set_x(int m) {
        this.x = m;
    }
    public int get_x() {
        return this.x;
    }
    public void set_y(int t) {
        this.y = t;
    }
    public int get_y() {
        return this.y;
    }
    public void set_z(int v) {
        this.z = v;
    }
    public int get_z() {
        return this.z;
    }
    public void set_xyz(int xa,int ya,int za){
        this.x=xa;
        this.y=ya;
        this.z=za;
    }
    public String toString(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
    public double distance(int x,int y,int z) {
        double distanta = sqrt((abs(this.x-x))^2+(abs(this.y-y))^2+(abs(this.z-z))^2);
        return distanta;
    }
    public double distance(MyPoint another){
        double distanta = sqrt((abs(this.x-another.x))^2+(abs(this.y-another.y))^2+(abs(this.z-another.z))^2);
        return distanta;
    }
}
