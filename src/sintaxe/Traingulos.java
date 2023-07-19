package sintaxe;


import java.util.Scanner;

public class Traingulos {

    static double AreaTriangulo(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) {
        double x1, x2, x3; // lados do triangulo x
        double y1, y2, y3; // lados do triangulo y

        System.out.println("Entre com os lados do primeiro triangulo:");
        Scanner sc = new Scanner(System.in);
//        x1 = sc.nextDouble();
//        x2 = sc.nextDouble();
//        x3 = sc.nextDouble();

        Triangulo tx = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Entre com os lados do segundo triangulo:");
//        y1 = sc.nextDouble();
//        y2 = sc.nextDouble();
//        y3 = sc.nextDouble();

        Triangulo ty = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());


//        double areax = AreaTriangulo(x1, x2, x3);
//        double areay = AreaTriangulo(y1, y2, y3);

        System.out.printf("Área do triangulo x: %f \n", tx.area(tx.perimetro()));
        System.out.printf("Área do triangulo y: %f \n", ty.area(ty.perimetro()));

        if (tx.area(tx.perimetro()) > ty.area(ty.perimetro())){
            System.out.println("O triangulo x tem maior área.");
        } else if (ty.area(ty.perimetro()) > tx.area(tx.perimetro())) {
            System.out.println("O triangulo y tem maior área.");
        } else {
            System.out.println("Os triangulos tem áreas iguais.");
        }


    }
}
