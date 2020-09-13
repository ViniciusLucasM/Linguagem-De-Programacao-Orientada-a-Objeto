public class Empregado extends Pessoa {
    protected double salario;  //permite que sub-classe acesse este atributo
    private int matricula;
    private static int proximaMatricula = 1;

    public Empregado(String nome, double salario){
        super(nome);
        this.salario = salario;
        this.matricula = proximaMatricula++;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }
}

