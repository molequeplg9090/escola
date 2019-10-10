
package escola;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    private String nomeTurma;
    private List<Alunos> alunos = new ArrayList<Alunos>();
             
    public String getNomeTurma(){
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
       
    public void addAlunos(Alunos a) {
        alunos.add(a);
    }
    

        public void exibirAlunos(){
     for(Alunos a : this.alunos){
         System.out.println("Alunos da Turma: " +this.alunos);
   }
    
    }
    
    
    
}
