import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Disciplina newDisciplina = new Disciplina();
        Assunto newAssunto = new Assunto();
        Topico newTopico = new Topico();
        Exercicio newExercicio = new Exercicio();

        List<Assunto> arrayAssuntos = new ArrayList<>();
        arrayAssuntos.add(newAssunto);

        List<Topico> arrayTopicos = new ArrayList<>();
        arrayTopicos.add(newTopico);

        List<Exercicio> arrayExercicios = new ArrayList<>();
        arrayExercicios.add(newExercicio);

        newDisciplina.setNome("Cálculo");

        newAssunto.setTitulo("Derivadas");

        newTopico.setTitulo("Introdução às Derivadas");
        newTopico.setTeoria(
                "Fala gaalera, lembra daquele limite que vimos no capítulo introdutório como a definição de derivada...");

        newExercicio.setEnunciado("Use a definição para calcular as derivadas da função...");
        newExercicio.setResposta("Para fazer a definição de dericad, temos que...");

        newDisciplina.setAssuntos(arrayAssuntos);
        newAssunto.setTopicos(arrayTopicos);
        newTopico.setExercicios(arrayExercicios);

        System.out
                .println(newDisciplina.getAssuntos().get(0).getTopicos().get(0).getExercicios().get(0).getEnunciado());

    }
}
