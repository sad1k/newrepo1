package Lab1.graphics;

public class Point {
    public float x;
    public float y;

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){

        return "Point x= " + this.x + "y= " + this.y;
    }

    void draw(){

    }
    Object moveTo(float dx, float dy){
        return new Point(this.x + dx, this.y+dy);
    }


}
