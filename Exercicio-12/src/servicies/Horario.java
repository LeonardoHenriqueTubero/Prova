package servicies;

public class Horario {
    public static void calcularHorario(int inicio, int fim) {
        int duracao;
        if(fim > inicio) {
            duracao = fim - inicio;
        }
        else if(fim < inicio) {
            duracao = (24 - inicio) + fim;
        }
        else {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
