package application;

import servicies.Operacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("MAIOR DISTANCIA: " + String.format("%.2f", Operacao.maior(a, b, c)));

        sc.close();
    }
}
