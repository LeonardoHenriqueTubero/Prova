package application;

import servicies.Operacoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numero inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Operacoes.encontrarMultiplos(a, b);

        sc.close();
    }
}
