import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao");
        curso1.setCargaHoraria(123);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());


        System.out.println(mentoria1);
        System.out.println(curso1);
    }
}
