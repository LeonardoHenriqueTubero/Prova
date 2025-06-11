package application;

import servicies.ControleSalarial;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        ControleSalarial.aumentarSalario(salario);

        sc.close();
    }
}
