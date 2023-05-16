package exercises1_37;

public class Circle {
    private double radius;


    public Circle(double radius){
        if(radius >= 0) {
            this.radius = radius;
        } else{
            this.radius = 0;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        if(height >= 0) {
            this.height = height;
        } else{
            this.height = 0;
        }
    }
    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.getArea()*this.height;
    }
}