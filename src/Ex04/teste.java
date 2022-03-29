package Ex04;

public class teste {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo("Vermelho", "Preto", 8.2, 8.2, 8.2, 13);
        Figura retangulo =  new Retangulo("Azul", "Branco", 7, 13);

        System.out.println(triangulo);
        System.out.println();
        System.out.println(retangulo);
    }
}
