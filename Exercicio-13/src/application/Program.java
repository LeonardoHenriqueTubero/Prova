package application;

import entities.PlanoCartesiano;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();

        PlanoCartesiano planoCartesiano = new PlanoCartesiano(x, y);

        planoCartesiano.determinarPosicao();

        sc.close();
    }
}
