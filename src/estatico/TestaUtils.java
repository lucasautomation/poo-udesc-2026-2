package estatico;

import javax.swing.text.Utilities;

public class TestaUtils {
    public static void main(String[]args){
        System.out.println(Utils.PI);
        System.out.println(Utils.max(100, 50));
        System.out.println(Utils.max(-3, -5));

        System.out.println("Quantidade de alunos: " + Aluno.qtdeAlunos);

        Aluno ze = new Aluno();
        System.out.println("Quantidade de alunos: " + Aluno.qtdeAlunos);
        Aluno Maria = new Aluno();
        System.out.println("Quantidade de alunos: " + Aluno.qtdeAlunos);
    }
}
