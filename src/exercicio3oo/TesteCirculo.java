package exercicio3oo;

public class TesteCirculo {
    public static void main(String[] args){
        Circulo circulo = new Circulo(15.0);

        System.out.printf("A medida da circunferência é: %.2f", circulo.getRaio());
        System.out.println(circulo);
    }
}