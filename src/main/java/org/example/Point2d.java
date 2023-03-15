package org.example;

public class Point2d {
    private double x;
    private double y;
    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point2d() {
        this(0,0);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void  setY(double y) {
        this.y = y;
    }
}
