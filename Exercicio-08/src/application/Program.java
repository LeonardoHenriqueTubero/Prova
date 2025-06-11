package application;

import services.ConversorTemperatura;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temp;
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char op = sc.next().toUpperCase().charAt(0);
        switch (op) {
            case 'C':
                System.out.print("Digite a temperatura em Celsius: ");
                temp = sc.nextDouble();
                System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", ConversorTemperatura.celsiusFahrenheit(temp)));
                break;
            case 'F':
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temp = sc.nextDouble();
                System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", ConversorTemperatura.fahrenheitCelsius(temp)));
                break;
        }

        sc.close();
    }
}
