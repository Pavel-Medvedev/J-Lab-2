package org.example;

public class Point3d extends Point2d {
    private double z;
    public Point3d(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }
    public Point3d() {
        this(0,0,0);
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public boolean equal(Point3d other) {
        return other.getX() == this.getX() && other.getY() == this.getY() && other.getZ() == this.z;
    }
    public double distanceTo(Point3d other) {
        return Math.sqrt(Math.pow(Math.abs(other.getX() - this.getX()), 2) + Math.pow(Math.abs(other.getY() - this.getY()), 2) + Math.pow(Math.abs(other.getZ() - this.getZ()), 2));
    }
}
