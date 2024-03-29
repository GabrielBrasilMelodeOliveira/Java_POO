public class AlunoPos extends Aluno {
    private String nomeOrientador;

    public String getNomeOrientador(){
        return this.nomeOrientador;
    }
    public void setNomeOrientador(String nomeOrientador){
        this.nomeOrientador = nomeOrientador; 
    }

    public AlunoPos(String nome,double nota1, double nota2, String nomeOrientador){
        super(nome,nota1,nota2);
        this.nomeOrientador = nomeOrientador;
    }
    @Override
    public double calcularMediaGeral(){
        double mediaGeral;
        mediaGeral = (((super.getNota1()*4)+(super.getNota2()*6))/10);
        return mediaGeral;
    }

    public String toString(){
        return super.toString() + "\nAluno da Pós " + "\nNome do orientador: " + this.nomeOrientador;
    }

    @Override
    public String qualNome(){
        String[] partesNome = super.getNome().split(" ");
        String segundoNome = partesNome[1] + ", " + super.getNome().substring(0,1) + ".";
        return segundoNome;
    }
}
