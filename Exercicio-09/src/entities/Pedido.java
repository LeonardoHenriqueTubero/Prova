package entities;

public class Pedido {
    private int cod;
    private double qnt;

    public Pedido(int cod, double qnt) {
        this.cod = cod;
        this.qnt = qnt;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getQnt() {
        return qnt;
    }

    public void setQnt(double qnt) {
        this.qnt = qnt;
    }

    public double calcularPagamento(){
        switch (cod) {
            case 1:
                return qnt * 5.00;
            case 2:
                return qnt * 3.50;
            case 3:
                return qnt * 4.80;
            case 4:
               return qnt * 8.90;
            case 5:
                return qnt * 7.32;
            default:
                System.out.println("Código invalido");
                return 0.0;
        }
    }
}
