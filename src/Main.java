import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHorario(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria de Java");
        mentoria.setData(LocalDate.now());




        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }
}