package Ex04;

public class Triangulo extends Figura {

    private double base, ladoB, ladoC;
    private double Altura;

    public Triangulo(String corPreenchimento, String corBorda, double base, double ladoB, double ladoC, double altura) {
        super(corPreenchimento, corBorda);
        this.base = base;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        Altura = altura;
    }

    @Override
    public double Area() {
        return (base * Altura) / 2;
    }

    @Override
    public double Perimetro() {
        return base + ladoB + ladoC;
    }

}
