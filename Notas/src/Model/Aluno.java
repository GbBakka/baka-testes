package Model;

import Exceptions.CursoException;
import Exceptions.MatriculaException;
import Exceptions.NomeException;
import Exceptions.NotaException;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    int nota;

    public Aluno (String nome, String matricula, String curso, int nota) throws NomeException, MatriculaException, CursoException, NotaException {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeException("Nome não pode ser nulo.");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws MatriculaException {
        if (matricula == null || matricula.length() !=6) {
            throw new MatriculaException("Matricula deve ser conter 6 caracteres");
        }
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) throws CursoException {
        if (curso == null || curso.trim().isEmpty()) {
            throw new MatriculaException("O Curso não pode ser nulo.");
        }
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws NotaException {
        if (nota < 0 || nota >10) {
            throw new NotaException("A Nota deve ser entre 0 e 10.");
        }
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
