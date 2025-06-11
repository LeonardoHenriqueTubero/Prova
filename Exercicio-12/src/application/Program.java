package application;

import servicies.Horario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Hora final: ");
        int fim = sc.nextInt();

        Horario.calcularHorario(inicio, fim);

        sc.close();
    }
}
