public class ConsultaFamilia extends Consulta{

    public ConsultaFamilia (int dependente, int anoinclusaoplano, double valorconsulta) {
        super (dependente, anoinclusaoplano, valorconsulta);
    }

    public double mostrarValor(double valor) {
        setValorconsulta(valor * (0.5) - valor);
        return getValorconsulta();
    }
}
