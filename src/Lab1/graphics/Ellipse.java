package Lab1.graphics;

public class Ellipse {
    public float x;
    public float y;

    public   float minorAxis;
    public float majorAxis;

    Ellipse(float x, float y, float a, float b){
        this.x = x;
        this.y = y;
        this.minorAxis = b;
        this.majorAxis = a;
    }

    public String toString(){

        return "Point x= " + this.x + "y= " + this.y + "minorAxis= " + this.minorAxis + "majorAxis= " + this.majorAxis;
    }

    void draw(){

    }

    Object moveTo(float dx, float dy){
        return new Ellipse(this.x + dx, this.y + dy, this.majorAxis, this.minorAxis);
    }

    double calculateArea(){
        return Math.PI * this.minorAxis * this.majorAxis;
    }

    void increaseSize(int n){
        this.majorAxis *= n;
        this.minorAxis *= n;
    }
}
