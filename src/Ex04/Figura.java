package Ex04;

public abstract class Figura {
    protected String corPreenchimento;
    protected String corBorda;
    
    public abstract double Area();
    public abstract double Perimetro();

    public String getCorPreenchimento() {
        return this.corPreenchimento;
    }
    
    public String getCorBorda() {
        return this.corBorda;
    }
    
    public Figura(String corPreenchimento, String corBorda) {
        this.corPreenchimento = corPreenchimento;
        this.corBorda = corBorda;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [corBorda=" + corBorda + 
        ", corPreenchimento=" + corPreenchimento + ", Area=" + this.Area() + ", Perimetro=" + this.Perimetro() + "]";
    }
    
   

}
