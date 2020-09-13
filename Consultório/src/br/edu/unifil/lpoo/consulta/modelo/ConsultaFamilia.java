package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {


    public double valorFamilia (){
        double desconto = (getValorconsulta() * (0.5) / 100);
        setValorconsulta(getValorconsulta() - desconto);
        return getValorconsulta();
    }
}
