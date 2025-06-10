package application;

import servicies.Operacoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double coeficienteA = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        double coeficienteB = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        double coeficienteC = sc.nextDouble();
        Operacoes.equacaoSegundoGrau(coeficienteA, coeficienteB, coeficienteC);

        sc.close();
    }
}
