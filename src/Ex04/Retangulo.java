package Ex04;

public class Retangulo extends Figura{
    private double base;
    private double altura;
    

    public Retangulo(String corPreenchimento, String corBorda, double base, double altura) {
        super(corPreenchimento, corBorda);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Area() {
        return base * altura;
    }

    @Override
    public double Perimetro() {
        return (base + altura) * 2;
    }

    
}
