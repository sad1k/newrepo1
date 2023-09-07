package Lab1.graphics;

import java.util.Arrays;

public class Rectangle {

    public Point[] points;

    Rectangle(Point[] points){
        this.points = points;
    }

    public String toString(){
        return "Points=" + Arrays.toString(this.points);
    }

    void draw(){

    }
    Object moveTo(float dx, float dy){
        for(int i =0; i<this.points.length; i++){
            this.points[i].x += dx;
            this.points[i].y += dy;
        }
        return new Rectangle(this.points);
    }


    double calculateArea(){
        float dxA = this.points[1].x - this.points[0].x;
        float dyA = this.points[1].y - this.points[0].y;
        float dxB = this.points[2].x - this.points[1].x;
        float dyB =  this.points[2].y - this.points[1].y;
        double a = Math.sqrt(Math.pow(dxA, 2) + Math.pow(dyA, 2));
        double b = Math.sqrt(Math.pow(dxB, 2) + Math.pow(dyB, 2));
        double angle = (dxA*dxB + dyA*dyB)/(a*b);
        return a * b * Math.sin(angle);
    }

    void increaseSize(int n){
        for(int i = 0; i < this.points.length; i++){
            this.points[i].x *= n;
            this.points[i].y *= n;
        }
    }



}
