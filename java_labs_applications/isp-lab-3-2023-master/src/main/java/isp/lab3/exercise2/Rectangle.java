package isp.lab3.exercise2;

public class Rectangle {

    int length=2;
    int width=1;
    String color="red";

    public Rectangle(){

    }
     public Rectangle(int lungime,int latime) {
        this.length=lungime;
        this.width=latime;
    }
     public Rectangle(int lungime,int latime,String culoare) {
        this.length=lungime;
        this.width=latime;
        this.color=culoare;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public String getColor() {
        return this.color;
    }
}
