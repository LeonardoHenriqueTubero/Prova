package application;

import servicies.Plano;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", Plano.calcularPlano(minutos)));

        sc.close();
    }
}
