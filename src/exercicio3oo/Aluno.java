package exercicio3oo;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;


public Aluno (String matricula, String nome, int idade, int nota1, int nota2, int nota3, int nota4){
    System.out.println("...");
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nota4 = nota4;

    }
    //Getters públicos
    public String getMatricula(){return this.matricula;}
    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}
    public int getNota1(){return nota1;}
    public int getNota2(){return nota2;}
    public int getNota3(){return nota3;}
    public int getNota4(){return nota4;}

    //Setters públicos
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade){this.idade = idade;}

    public void setNota1(int nota1) {
        if (nota1 >= 0 && nota1 <= 10) {this.nota1 = nota1;}
        else {System.out.println("Nota 1 inválida! Deve estar entre 0 e 10.");}
    }
    public void setNota2(int nota2) {
        if (nota2 >= 0 && nota2 <= 10) {this.nota2 = nota2;}
        else {System.out.println("Nota 2 inválida! Deve estar entre 0 e 10.");}
    }
    public void setNota3(int nota3) {
        if (nota3 >= 0 && nota3 <= 10) {this.nota3 = nota3;}
        else {System.out.println("Nota 3 inválida! Deve estar entre 0 e 10.");}
    }
    public void setNota4(int nota4) {
        if (nota4 >= 0 && nota4 <= 10) {this.nota4 = nota4;}
        else {System.out.println("Nota 4 inválida! Deve estar entre 0 e 10.");}
    }

    //Metodo toString
    @Override
    public String toString(){
        return "Nome do aluno: " + this.nome +
                ", [Matricula: " + this.matricula +
                ", Idade do aluno: " + this.idade +
                ", Nota 1: " + this.nota1 +
                ", Nota 2: " + this.nota2 +
                ", Nota 4: " + this.nota3 +
                ", Nota 3: " + this.nota4 + "]";
    }
}