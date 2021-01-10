package kap6.a2;

import org.jetbrains.annotations.NotNull;

public class Triangle {

    Point A;
    Point B;
    Point C;

    double a = length(C,B);
    double b = length(A,C);
    double c = length(B,A);
    double h =  Math.pow(a, 2)/ c + Math.pow(b, 2)/ c;


    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public double perimeter(){
        return length(A,B) + length(B, C) + length(C, A);
    }

    public double area(){
        return 0.5 * c * h;
    }

    public Point lowerLeft(){
        Point lowerLeft = new Point(Math.min(A.x, Math.min(B.x, C.x)), Math.min(A.y, Math.min(B.y, C.y)));
        return lowerLeft;
    }

    public Point upperRight(){
        Point upperRight = new Point(Math.max(A.x, Math.max(B.x, C.x)), Math.max(A.y, Math.max(B.y, C.y)));
        return upperRight;
    }

    public Triangle moved(double dx, double dy){
        Point A1 = new Point(A.x + dx,A.y + dy);
        Point A2 = new Point(B.x + dx,B.y + dy);
        Point A3 = new Point(C.x + dx,C.y + dy);
        Triangle movedTriangle = new Triangle(A1, A2, A3);
        return movedTriangle;
    }

    public Triangle zoomed(double f){
        Point A1 = new Point(A.x * f,A.y * f);
        Point A2 = new Point(B.x * f,B.y * f);
        Point A3 = new Point(C.x * f,C.y * f);
        Triangle zoomedTriangle = new Triangle(A1, A2, A3);
        return zoomedTriangle;
    }

    public Triangle zoomed(double f, @NotNull Point P){
        Point A1 = new Point(Math.abs(A.x - P.x) * f,Math.abs(A.y - P.y) * f);
        Point A2 = new Point(Math.abs(B.x - P.x) * f,Math.abs(B.y - P.y) * f);
        Point A3 = new Point(Math.abs(C.x - P.x) * f,Math.abs(C.y - P.y) * f);
        Triangle zoomedTriangle = new Triangle(A1, A2, A3);
        return zoomedTriangle;
    }


    private double length(Point a1, Point a2){
        return Math.sqrt(Math.pow(Math.abs(a1.x - a2.x), 2) + Math.pow(Math.abs(a1.y - a2.y), 2));
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }
}
