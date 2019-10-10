
package escola;

import java.util.ArrayList;
import java.util.List;


public class Escola {
    
    private String nome;
    private List<Turma> turmas = new ArrayList<Turma>();

    public String getNome() {
        return nome;
    }

        public void addTurma(Turma t) {
        turmas.add(t);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
     public void exibirTurma(){
     for(Turma t : this.turmas){
         System.out.println("Turmas: "+ this.turmas);
   }
    
    }
    
}
