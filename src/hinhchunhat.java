import java.util.Scanner;


public class hinhchunhat {

    double width, height;

    public hinhchunhat(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String disPlay(){
        return "Rectangle(" + "width=" + width + ", height=" + height + ")";
    }



}