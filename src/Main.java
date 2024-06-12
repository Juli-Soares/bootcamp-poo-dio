import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Logica de Programação com Java");
        curso1.setDescricao("Logica aplicada em java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Poo");
        curso2.setDescricao("Fundamentos de Poo");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria sobre Linkedin");
        mentoria.setDescricao("Analizando o linkedin dos devs.");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos -> Gabriela:" + devGabriela.getConteudosInscritos());
        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos -> Gabriela:" + devGabriela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos -> Gabriela:" + devGabriela.getConteudosConcluidos());
        System.out.println("XP:" + devGabriela.calcularTotalXp());

        System.out.println("-------");

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio");
        devAntonio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Antonio:" + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        devAntonio.progredir();
        devAntonio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Antonio:" + devAntonio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Antonio:" + devAntonio.getConteudosConcluidos());
        System.out.println("XP:" + devAntonio.calcularTotalXp());

    }

}