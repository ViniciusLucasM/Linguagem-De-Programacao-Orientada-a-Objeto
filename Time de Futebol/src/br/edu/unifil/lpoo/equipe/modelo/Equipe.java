package br.edu.unifil.lpoo.equipe.modelo;

import java.util.ArrayList;

public class Equipe {
    private String nomeEquipe;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        jogadores = new ArrayList<>();
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public void addjogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador){
        jogadores.remove(jogador);
    }

    public String listarjogadores(){
        String saida = "";
        Jogador auxJogador;
        for (int i = 0; i < jogadores.size(); i++){
            auxJogador = jogadores.get(i);
            saida = saida + auxJogador.getNome() + '\n';
        }
        return saida;
    }

    public Jogador getJogador(String nome){
        Jogador auxJogador;
        for (int i = 0; i < jogadores.size(); i++){
            auxJogador = jogadores.get(i);
            if (nome.equals(auxJogador.getNome())){
                return auxJogador;
            }
        }
        return null;
    }
}
