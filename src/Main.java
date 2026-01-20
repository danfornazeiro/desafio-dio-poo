import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        System.out.printf("Curso: %s ", curso1.CalcularXP());
        System.out.printf("Mentoria: %s ", mentoria1.CalcularXP());

        System.out.println("=================================================");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setDescricao("Descricao do bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev 1 -> conteudos inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Dev 1 -> conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("Dev 1 -> XP " + dev1.calcularTotalXP());
        System.out.println("Dev 1 -> conteudos inscritos " + dev1.getConteudosInscritos());
        System.out.println("=================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev 2 -> conteudos inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Dev 2 -> conteudos concluidos " + dev2.getConteudosConcluidos());
        System.out.println("Dev 2 -> XP " + dev2.calcularTotalXP());
        System.out.println("Dev 2 -> conteudos concluidos " + dev2.getConteudosInscritos());
        System.out.println("=================================================");
    }
}