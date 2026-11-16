package estatico;

public class Aluno {
    String nome;
    int idade;
    //Atributo estático (de classe)
    static int qtdeAlunos = 0;

    public Aluno(){
        qtdeAlunos++;
        System.out.println("Criando o " + qtdeAlunos + "º");
    }
}
