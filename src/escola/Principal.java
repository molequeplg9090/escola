
package escola;

import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        
      Escola e = new Escola();
      e.setNome("Escola da Fámilia");
       
      Turma t1 = new Turma();
      t1.setNomeTurma("Informática");
      
      
      Turma t2 = new Turma();
      t2.setNomeTurma("Desenvolvimento de sistemas");
      
     
      
      Alunos a1 = new Alunos();
      a1.setCodAluno("01");
      a1.setNomeAluno("Julio");
      a1.setNota1(3);
      a1.setNota2(3);
      a1.setNota3(3);
      a1.setNota4(3);
      
      Alunos a2 = new Alunos();
      a2.setCodAluno("02");
      a2.setNomeAluno("Marcio");
      a2.setNota1(3);
      a2.setNota2(4);
      a2.setNota3(5);
      a2.setNota4(6);
      
      Alunos a3 = new Alunos();
      a3.setCodAluno("03");
      a3.setNomeAluno("Jefferson");
      a3.setNota1(3);
      a3.setNota2(4);
      a3.setNota3(5);
      a3.setNota4(6);
      
      Alunos a4 = new Alunos();
      a4.setCodAluno("04");
      a4.setNomeAluno("João");
      a4.setNota1(3);
      a4.setNota2(4);
      a4.setNota3(5);
      a4.setNota4(6);
      
      Alunos a5 = new Alunos();
      a5.setCodAluno("05");
      a5.setNomeAluno("Julia");
      a5.setNota1(3);
      a5.setNota2(4);
      a5.setNota3(5);
      a5.setNota4(6);
  
      //turma2
      
      Alunos a6 = new Alunos();
      a6.setCodAluno("06");
      a6.setNomeAluno("Felipe");
      a6.setNota1(3);
      a6.setNota2(4);
      a6.setNota3(5);
      a6.setNota4(6);
      
      
      Alunos a7 = new Alunos();
      a7.setCodAluno("07");
      a7.setNomeAluno("Cristian");
      a7.setNota1(2);
      a7.setNota2(6);
      a7.setNota3(4);
      a7.setNota4(8);
      
      Alunos a8 = new Alunos();
      a8.setCodAluno("08");
      a8.setNomeAluno("Fábio");
      a8.setNota1(7);
      a8.setNota2(7);
      a8.setNota3(7);
      a8.setNota4(7);
      
      Alunos a9 = new Alunos();
      a9.setCodAluno("09");
      a9.setNomeAluno("Wesley");
      a9.setNota1(6);
      a9.setNota2(6);
      a9.setNota3(6);
      a9.setNota4(6);
      
      Alunos a10 = new Alunos();
      a10.setCodAluno("10");
      a10.setNomeAluno("Bruna");
      a10.setNota1(10);
      a10.setNota2(10);
      a10.setNota3(10);
      a10.setNota4(10);
      
      e.addTurma(t1);
      e.addTurma(t2);
      
      t1.addAlunos(a1);
      t1.addAlunos(a2);
      t1.addAlunos(a3);
      t1.addAlunos(a4);
      t1.addAlunos(a5);
      t2.addAlunos(a6);
      t2.addAlunos(a7);
      t2.addAlunos(a8);
      t2.addAlunos(a9);
      t2.addAlunos(a10);

      
            System.out.println(e.getNome());
            e.exibirTurma();
            t1.exibirAlunos();
            t2.exibirAlunos();
            a1.exibirSituacao();
            a2.exibirSituacao();
            a3.exibirSituacao();
            a4.exibirSituacao();  
            a5.exibirSituacao();
            a6.exibirSituacao();
            a7.exibirSituacao();
            a8.exibirSituacao();
            a9.exibirSituacao();
            a10.exibirSituacao();
    }
    
}
