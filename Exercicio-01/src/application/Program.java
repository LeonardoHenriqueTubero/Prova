package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2);

        System.out.println("NOTA FINAL: " + String.format("%.1f", aluno.notaFinal()));
        if(aluno.notaFinal() <60.00) {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
