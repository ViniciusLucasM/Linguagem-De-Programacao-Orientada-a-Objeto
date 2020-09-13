public class ConsultaOuro extends Consulta{

    public ConsultaOuro (int dependente, int anoinclusaoplano, double valorconsulta) {
        super(dependente, anoinclusaoplano, valorconsulta);
    }

    public double mostrarValor(double valor) {
        setValorconsulta(valor * (0.3) - valor);
        return getValorconsulta();
    }
}
