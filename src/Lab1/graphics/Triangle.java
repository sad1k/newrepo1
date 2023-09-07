package Lab1.graphics;

import java.util.Arrays;

public class Triangle {

    private Point[] points;
    Triangle(Point[] points){
        this.points = points;
    }

    public String toString(){

        return "Points=" + Arrays.toString(this.points);
    }

    Object moveTo(float dx, float dy){
        for(int i =0; i<this.points.length; i++){
            this.points[i].x += dx;
            this.points[i].y += dy;
        }
        return new Triangle(this.points);
    }

    float calculateArea(){
        return 1/2 * ((this.points[0].x - this.points[2].x)*(this.points[1].y - this.points[2].y) - (this.points[1].x - this.points[2].x) * (this.points[0].y - this.points[2].y));
    }


    void increaseSize(int n){
        for(int i = 0; i < this.points.length; i++){
            this.points[i].x *= n;
            this.points[i].y *= n;
        }
    }

}
