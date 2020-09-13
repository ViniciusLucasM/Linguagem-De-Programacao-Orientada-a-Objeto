public class Aluno extends Pessoa {
    private int matricula;
    private double notas[];

    public Aluno(String nome){
        super(nome); //chamando o cosntrutor da super classe (Pessoa)
        System.out.println("Estou no construtor do aluno");
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
