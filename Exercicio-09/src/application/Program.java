package application;

import entities.Pedido;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int cod = sc.nextInt();
        System.out.print("Quantidade comprada: " );
        int qnt = sc.nextInt();

        Pedido pedido = new Pedido(cod, qnt);

        System.out.println("Valor a pagar: R$ " + String.format("%.2f", pedido.calcularPagamento()));

        sc.close();
    }
}
