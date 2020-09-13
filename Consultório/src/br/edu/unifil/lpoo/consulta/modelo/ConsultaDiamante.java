package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta {


    public double valorDiamante(){
        double desconto = (getValorconsulta() * (0.4) / 100);
        setValorconsulta(getValorconsulta() - desconto);
        return getValorconsulta();
    }
}
