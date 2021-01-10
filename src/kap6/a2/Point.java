package kap6.a2;

public class Point {

    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x +
                ", y: " + y;
    }


}
