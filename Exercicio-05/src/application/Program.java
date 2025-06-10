package application;

import entities.Pedido;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        Pedido pedido = new Pedido(precoUnitario, quantidade);

        System.out.print("Dinheiro recebido: ");
        double pagamento = sc.nextDouble();

        pedido.calcularTroco(pagamento);

        sc.close();
    }
}
