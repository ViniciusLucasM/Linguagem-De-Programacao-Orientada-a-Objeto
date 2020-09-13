public class ConsultaDiamante extends Consulta {

    public ConsultaDiamante (int dependente, int anoinclusaoplano, double valorconsulta) {
        super (dependente, anoinclusaoplano, valorconsulta);
    }

    public double mostrarValor(double valor) {
        setValorconsulta(valor * (0.4) - valor);
        return getValorconsulta();
    }
}
