package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta {


    public double valorPrata (){
        double desconto = (getValorconsulta() * (0.2) / 100);
        setValorconsulta(getValorconsulta() - desconto);
        return getValorconsulta();
    }
}
