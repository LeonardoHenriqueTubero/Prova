package application;

import servicies.Operacao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        System.out.println("MENOR: " + Operacao.menor(a, b, c));

        sc.close();
    }
}
