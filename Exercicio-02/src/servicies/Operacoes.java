package servicies;

public class Operacoes {
    public static double calcularDelta(Double a, Double b, Double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static void equacaoSegundoGrau(Double a, Double b, Double c) {
        double delta = calcularDelta(a, b, c);

        if(delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1: " + String.format("%.4f", x1));
            System.out.println("X2: " + String.format("%.4f", x2));
        }
    }
}
