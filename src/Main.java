import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGeane = new Dev();
        devGeane.setNome("Geane");
        devGeane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devGeane.getConteudosInscritos());
        devGeane.progredir();
        devGeane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devGeane.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devGeane.getConteudosConcluidos());
        System.out.println("XP: " + devGeane.calcularTotalXp());

        System.out.println("--------");

        Dev devIvan = new Dev();
        devIvan.setNome("Ivan");
        devIvan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devGeane.getConteudosInscritos());
        devIvan.progredir();
        devIvan.progredir();
        devIvan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devGeane.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devIvan.getConteudosConcluidos());
        System.out.println("XP: " + devIvan.calcularTotalXp());


    }

}
