import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.OffsetDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso2.setCargaHoraria(2);

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("Descrição da Mentoria Python");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1.toString());
        System.out.println(mentoria2.toString());
    }
}