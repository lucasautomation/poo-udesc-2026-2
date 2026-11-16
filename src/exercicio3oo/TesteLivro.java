package exercicio3oo;

public class TesteLivro {
    public static void main(String[] args){
        Livro livro = new Livro("Tiro pra todo lado", "Barbosa Ferraz", "Policial", false);

        System.out.printf("O Autor é: %s%n ", livro.getAutor());
        System.out.printf("O gênero é: %s%n ", livro.getGenero());
        System.out.printf("O título é: %s%n", livro.getTitulo());
        System.out.printf("Empréstimo: %b%n", livro.getEmprestado());
        System.out.println(livro);
    }
}
