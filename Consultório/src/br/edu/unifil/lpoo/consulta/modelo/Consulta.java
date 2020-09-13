package br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nome;
    private String matricula;
    protected int dependente;
    protected int anoinclusao;
    protected double valorconsulta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDependente() {
        return dependente;
    }

    public void setDependente(int dependente) {
        this.dependente = dependente;
    }

    public int getAnoinclusao() {
        return anoinclusao;
    }

    public void setAnoinclusao(int anoinclusao) {
        this.anoinclusao = anoinclusao;
    }

    public double getValorconsulta() {
        return valorconsulta;
    }

    public void setValorconsulta(double valorconsulta) {
        this.valorconsulta = valorconsulta;
    }
}
