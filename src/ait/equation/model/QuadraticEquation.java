package ait.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    double delta = delta();

    public int quantityRoots() {
        int resQuantity = 0;
        if (delta == 0) {
            return resQuantity = 1;
        } else if (delta > 0) {
            return resQuantity = 2;
        } else if (delta < 0) {
            return resQuantity = 0;
        }
        return resQuantity;
    }

    public double delta() {
        double delta = (b * b) + (4 * a * c);
        return delta;
    }

    public void display() {
        System.out.println(a + "*(x*x)" + b + "*x+" + c + "=0");
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
