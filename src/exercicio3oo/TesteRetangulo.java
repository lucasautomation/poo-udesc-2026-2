package exercicio3oo;

public class TesteRetangulo {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(20, 30);

        System.out.printf("A Medida da largura é: %.2f%n", retangulo.getLargura());
        System.out.printf("A Medida da altura é: %.2f%n", retangulo.getAltura());
        System.out.println(retangulo);
    }
}
