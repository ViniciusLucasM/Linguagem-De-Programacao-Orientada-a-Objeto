public class Consulta {
    private String nomepaciente;
    private String matricula;
    private int dependente;
    private int anoinclusaoplano;
    private double valorconsulta;

    public Consulta (int dependente, int anoinclusaoplano, double valorconsulta){
        this.dependente = dependente;
        this.anoinclusaoplano = anoinclusaoplano;
        this.valorconsulta = valorconsulta;
    }

    public String getNomepaciente() {
        return nomepaciente;
    }

    public void setNomepaciente(String nomepaciente) {
        this.nomepaciente = nomepaciente;
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

    public int getAnoinclusaoplano() {
        return anoinclusaoplano;
    }

    public void setAnoinclusaoplano(int anoinclusaoplano) {
        this.anoinclusaoplano = anoinclusaoplano;
    }

    public double getValorconsulta() {
        return valorconsulta;
    }

    public void setValorconsulta(double valorconsulta) {
        this.valorconsulta = valorconsulta;
    }
}
