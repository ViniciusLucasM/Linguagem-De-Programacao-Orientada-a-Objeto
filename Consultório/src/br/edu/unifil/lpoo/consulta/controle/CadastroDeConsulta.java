package br.edu.unifil.lpoo.consulta.controle;

import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;

public class CadastroDeConsulta {
    ArrayList <Consulta> listConsulta;
    Consulta consulta = new Consulta();

    public CadastroDeConsulta() {
        listConsulta = new ArrayList<>();
    }
    int Prata;
    int Ouro;
    int Dima;
    int Fami;


    public void novaConsulta (int Plano, String nomePaciente, String matricula, int dependente, int anoinclusao, double valorconsulta){
        ConsultaPrata consultaPrata;
        ConsultaOuro consultaOuro;
        ConsultaDiamante consultaDiamante;
        ConsultaFamilia consultaFamilia;
        if (Plano == 1){
            consultaPrata = new ConsultaPrata();
            consultaPrata.setNome(nomePaciente);
            consultaPrata.setMatricula(matricula);
            consultaPrata.setDependente(dependente);
            consultaPrata.setAnoinclusao(anoinclusao);
            consultaPrata.setValorconsulta(valorconsulta);
            listConsulta.add(consultaPrata);
        } else if (Plano == 2){
            consultaOuro = new ConsultaOuro();
            consultaOuro.setNome(nomePaciente);
            consultaOuro.setMatricula(matricula);
            consultaOuro.setDependente(dependente);
            consultaOuro.setAnoinclusao(anoinclusao);
            consultaOuro.setValorconsulta(valorconsulta);
            listConsulta.add(consultaOuro);
        } else if (Plano == 3){
            consultaDiamante = new ConsultaDiamante();
            consultaDiamante.setNome(nomePaciente);
            consultaDiamante.setMatricula(matricula);
            consultaDiamante.setDependente(dependente);
            consultaDiamante.setAnoinclusao(anoinclusao);
            consultaDiamante.setValorconsulta(valorconsulta);
            listConsulta.add(consultaDiamante);
        } else if (Plano == 4){
            consultaFamilia = new ConsultaFamilia();
            consultaFamilia.setNome(nomePaciente);
            consultaFamilia.setMatricula(matricula);
            consultaFamilia.setDependente(dependente);
            consultaFamilia.setAnoinclusao(anoinclusao);
            consultaFamilia.setValorconsulta(valorconsulta);
            listConsulta.add(consultaFamilia);
        }
    }

    public String getNomeMatricula (String nomePlano){
        Consulta auxconsu;
        String saida = " ";
        for (int i = 0; i < listConsulta.size(); i++){
            auxconsu = listConsulta.get(i);
            if (nomePlano.equals("prata") || nomePlano.equals("Prata") || nomePlano.equals("PRATA")) {
            }
        }
        return saida;
    }

    public void Totalconsulta(int Plano, int qtd){
        if (Plano == 1){
            Prata = qtd;
        } else if (Plano == 2){
            Ouro = qtd;
        } else if (Plano == 3){
            Dima = qtd;
        } else if (Plano == 4){
            Fami = qtd;
        }
    }

    public int consultaTotal(String nomePlano) {
        if (nomePlano.equals("prata") || nomePlano.equals("Prata") || nomePlano.equals("PRATA")) {
            return Prata;
        } else if (nomePlano.equals("ouro") || nomePlano.equals("Ouro") || nomePlano.equals("OURO")) {
            return Ouro;
        } else if (nomePlano.equals("diamante") || nomePlano.equals("Diamante") || nomePlano.equals("DIAMANTE")) {
            return Dima;
        } else if (nomePlano.equals("familia") || nomePlano.equals("Familia") || nomePlano.equals("FAMILIA")) {
            return Fami;
        }
        return Prata + Ouro + Dima + Fami;
    }

    public double valorTotal(String nomePlano) {
        double P = 0;
        double O = 0;
        double D = 0;
        double F = 0;
        ConsultaPrata auxPrata = null;
        ConsultaOuro auxOuro = null;
        ConsultaDiamante auxDima = null;
        ConsultaFamilia auxFami = null;
        if (nomePlano.equals("prata") || nomePlano.equals("Prata") || nomePlano.equals("PRATA")) {
           P = P + auxPrata.valorPrata();
           return P;
        } else if (nomePlano.equals("ouro") || nomePlano.equals("Ouro") || nomePlano.equals("OURO")) {
            O = O + auxOuro.valorOuro();
            return O;
        } else if (nomePlano.equals("diamante") || nomePlano.equals("Diamante") || nomePlano.equals("DIAMANTE")) {
            D = D + auxDima.valorDiamante();
            return D;
        } else if (nomePlano.equals("familia") || nomePlano.equals("Familia") || nomePlano.equals("FAMILIA")) {
            F = F + auxFami.valorFamilia();
            return F;
        }
        return P + O + D + F;
    }
}
