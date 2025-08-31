package Services;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Aluno> notasAluno = new ArrayList<>();

    public void adicionarNota(String nome, String matricula, String curso, int nota) {
        try {
            Aluno aluno = new Aluno(nome, matricula, curso, nota);
            notasAluno.add(aluno); // adiciona o aluno na lista
            System.out.println("Aluno adicionado com sucesso: " + aluno.getNome());
        } catch (Exception e) {
            LoggerNotas.registrar("Erro ao adicionar aluno: " + e.getMessage());
        }

    }
    public List<Aluno> getNotasAluno() {
        return notasAluno;
    }
}
