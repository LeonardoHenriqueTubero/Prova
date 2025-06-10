package entities;

public class Pedido {
    public double precoUnitario;
    public int quantidade;

    public Pedido(double precoUnitario, int quantidade) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void calcularTroco(double pagamento) {
        double total = precoUnitario * quantidade;
        double valor = pagamento - total;
        if(valor < 0) {
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", Math.abs(valor)) + " REAIS");
        }
        else {
            System.out.println("TROCO: " + valor);
        }
    }
}
