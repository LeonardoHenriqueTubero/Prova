package servicies;

public class Plano {
    public static double calcularPlano(int minutos) {
        if(minutos > 100) {
            int minutosExcedentes = minutos - 100;
            double precoExtra = 50 + 2.00 * minutosExcedentes;
            return precoExtra;
        }
        return 50.00;
    }
}
