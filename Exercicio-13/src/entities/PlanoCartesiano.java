package entities;

public class PlanoCartesiano {
    private double x;
    private double y;

    public PlanoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void determinarPosicao() {
        if(x != 0 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("Q1");
            }
            else if(x < 0 && y > 0) {
                System.out.println("Q2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            else {
                System.out.println("Q4");
            }
        }
        else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else {
            if(x == 0) {
                System.out.println("Eixo Y");
            }
            else {
                System.out.println("Eixo X");
            }
        }
    }
}
