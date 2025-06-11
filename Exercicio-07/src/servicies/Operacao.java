package servicies;

public class Operacao {
    public static double maior(double a, double b, double c) {
        double maior = a;
        if(maior < b) {
            maior = b;
        }
        else if(maior < c) {
            maior = c;
        }
        return maior;
    }
}
