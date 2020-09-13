public class Gerente extends Empregado {
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome,salario);  //chamado do construtor da super classe
        this.bonus = bonus;
    }

    public double getSalario(){
        return salario + bonus;
        //return super.getSalario() + bonus;
        //chamando o getSalario() da super classe
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

