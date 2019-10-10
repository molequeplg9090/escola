
package escola;


public class Alunos {
    
    private String codAluno;
    private String nomeAluno;
    private int media;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public String getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
    
        public String exibirSituacao(){
            media = nota1 + nota2 + nota3 + nota4 /4  ;
                    
                   if(media >= 7 ){
                           System.out.println("Aprovado");
                   }
                           
                   else{
                         System.out.println("reprovado");
                   }           
                            
                                   
            
       // System.out.println("Nome do Aluno: "+this.nomeAluno);
        return this.nomeAluno;
    }
    
    
}
