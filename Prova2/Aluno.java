public abstract class Aluno {
    private String nome;
    private double nota1, nota2;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota1(){
        return this.nota1;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return this.nota2;
    }
    public void setNota2(double nota2){
        this.nota2 =  nota2;
    }

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public abstract double calcularMediaGeral();
    public abstract String qualNome();

    public String toString(){
        return "\nNome: " + this.nome + "\n nota 1 e nota 2: " + this.nota1 + " " + this.nota2;
    }
}
