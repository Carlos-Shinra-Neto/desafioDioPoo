import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

 import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("Descrição do Curso Java POO");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devCarlos.getNome() + " :" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos inscritos " + devCarlos.getNome() + " :" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos concluidos " + devCarlos.getNome() + " :" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());





        System.out.println("-----");
        Dev devCielo = new Dev();
        devCielo.setNome("Cielo");
        devCielo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devCielo.getNome() + " :" + devCielo.getConteudosInscritos());
        System.out.println("--------");
        devCielo.progredir();
        System.out.println("Conteúdos inscritos " + devCielo.getNome() + " :" + devCielo.getConteudosInscritos());
        System.out.println("--------");
        devCielo.progredir();
        System.out.println("Conteúdos concluidos " + devCielo.getNome() + " :" + devCielo.getConteudosConcluidos());
        System.out.println("XP:" + devCielo.calcularTotalXp());
    }
}
