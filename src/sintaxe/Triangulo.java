package sintaxe;

public class Triangulo {
    double a; // Lado a
    double b; // Lado b
    double c; // Lado c

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    double perimetro() {
        double p = (this.a + this.b + this.c) / 2;
        return p;
    }

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area(double p) {
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
