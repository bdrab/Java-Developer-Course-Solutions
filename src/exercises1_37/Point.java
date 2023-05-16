package exercises1_37;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x*this.x + this.y*this.y));
    }

    public double distance(int x1, int y1){
        return Math.sqrt((x1 - this.x) * (x1 - this.x) + (y1 - this.y) * (y1 - this.y));
    }

    public double distance(Point x1){
        return Math.sqrt((this.x - x1.x)*(this.x - x1.x) + (this.y - x1.y)*(this.y - x1.y));
    }

}