package servicies;

public class Operacao {
    public static int menor(int a, int b, int c) {
        int menor = a;
        if(menor > b) {
            menor = b;
        }
        else if(menor > c) {
            menor = c;
        }
        return menor;
    }
}
