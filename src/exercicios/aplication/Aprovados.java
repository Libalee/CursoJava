package exercicios.aplication;

import exercicios.entities.Estudantes;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos alunos as notas serão calculadas:");
        int n = sc.nextInt();

        Estudantes[] estu = new Estudantes[n]; // todos estudantes

        for(int i = 0; i < estu.length; i++) {
            sc.nextLine();
            System.out.println("Informe o nome do estudante " + i);
            String nome = sc.nextLine();
            System.out.println("Informe a nota 1 do estudante " + i);
            double nota1 = sc.nextDouble();
            System.out.println("Informe a nota 2 do estudante " + i);
            double nota2 = sc.nextDouble();
            estu[i] = new Estudantes(nome, nota1, nota2);
        }

        for(int i = 0; i < estu.length; i++) {
            if((estu[i].getNota1() + estu[i].getNota2()) / 2 >= 6.0) {
                System.out.println("Estudante " + estu[i].getNome() + " Foi aprovado!!");
            }

        }

        sc.close();
    }
}
