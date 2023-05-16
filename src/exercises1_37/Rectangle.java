package exercises1_37;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        if(width >= 0) {
            this.width = width;
        } else{
            this.width = 0;
        }

        if(length >= 0) {
            this.length = length;
        } else{
            this.length = 0;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.length*this.width;
    }
}


class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);

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









