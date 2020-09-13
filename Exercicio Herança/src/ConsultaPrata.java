public class ConsultaPrata extends Consulta {

    public ConsultaPrata (int dependente, int anoinclusaoplano, double valorconsulta) {
        super(dependente, anoinclusaoplano, valorconsulta);
    }

    public double mostrarValor(double valor){
        setValorconsulta(valor * (0.2) - valor);
        return getValorconsulta();
    }
}
