package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta {


    public double valorOuro (){
        double desconto = (getValorconsulta() * (0.3) / 100);
        setValorconsulta(getValorconsulta() - desconto);
        return getValorconsulta();
    }
}
