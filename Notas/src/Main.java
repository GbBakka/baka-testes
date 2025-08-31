import Model.Aluno;
import Services.Notas;

class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();

        //TESTE PADRÕES DE ENTRADA
        notas.adicionarNota("PEDRO","255DS9","MATEMATICA",7);
        notas.adicionarNota("CAIO","255DS3","CIENCIAS",10);
        notas.adicionarNota("ISABELA","255TR3","MEDICINA",9);

        //TESTANDO EXCEPTIONS EM ORDEM

        notas.adicionarNota("","255DS9","QUIMICA",7);
        notas.adicionarNota("SANDRO","2559","SOCIOLOGIA",2);
        notas.adicionarNota("ROBERTA","123ERT","",7);
        notas.adicionarNota("YANDRA","7D5E8C","HISTORIA",11);

        System.out.println("Notas cadastradas com sucesso:");
        for (Aluno a : notas.getNotasAluno()) {
            System.out.println(a);
        }
    }
}