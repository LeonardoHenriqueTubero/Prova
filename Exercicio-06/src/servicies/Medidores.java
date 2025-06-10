package servicies;

public class Medidores {
    public static void medirGliclose(double glicose) {
        if(glicose < 100) {
            System.out.println("Classificacao: normal");
        }
        else if(glicose > 100 && glicose <= 140) {
            System.out.println("Classificacao: elevado");
        }
        else if(glicose > 140) {
            System.out.println("Classificacao: diabetes");
        }
    }
}
