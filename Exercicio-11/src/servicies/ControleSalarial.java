package servicies;

public class ControleSalarial {
    public static void aumentarSalario(double salario) {
        double novoSalario;
        double aumento;
        double porcentagem;
        if(salario <= 1000.00) {
            novoSalario = salario * 1.20;
            aumento = novoSalario - salario;
            porcentagem = 0.20;
        }
        else if(salario > 1000.00 && salario <= 3000.00) {
            novoSalario = salario * 1.15;
            aumento = novoSalario - salario;
            porcentagem = 0.15;
        }
        else if(salario > 3000.00 && salario < 8000.00) {
            novoSalario = salario * 1.10;
            aumento = novoSalario - salario;
            porcentagem = 0.10;
        }
        else {
            novoSalario = salario * 1.05;
            aumento = novoSalario - salario;
            porcentagem = 0.05;
        }
        System.out.println("Novo salario R$ " + String.format("%.2f", novoSalario));
        System.out.println("Aumento R$ " + String.format("%.2f", aumento));
        System.out.println("Porcentagem = " + String.format("%.2f", porcentagem) + "%");
    }
}
