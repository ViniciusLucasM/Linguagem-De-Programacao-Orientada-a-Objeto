package br.edu.unifil.lpoo.equipe.controle;

import br.edu.unifil.lpoo.equipe.modelo.Equipe;
import br.edu.unifil.lpoo.equipe.modelo.Jogador;


import java.util.ArrayList;

public class Controle {
    private ArrayList< Jogador > listaJogadores;
    private ArrayList<Equipe > listaEquipe;

    public Controle(){
        listaEquipe = new ArrayList<>();
        listaJogadores = new ArrayList<>();
    }

    public void cadastradJogador(String nome, String posicao){
        Jogador auxJogador = new Jogador(nome, posicao);
        listaJogadores.add(auxJogador);
    }

    public void cadastrarEquipe(String nome){
        Equipe auxEquipe = new Equipe(nome);
        listaEquipe.add(auxEquipe);
    }

    public void contratarJogador(String nomeEquipe, String nomeJogador){
        Equipe auxEquipe;
        Jogador auxJogador;
        for (int i = 0; i < listaEquipe.size(); i++){
            auxEquipe = listaEquipe.get(i);
            if (nomeEquipe.equals(auxEquipe.getNomeEquipe())){
                for (int j = 0; j < listaJogadores.size(); j++){
                    auxJogador = listaJogadores.get(j);
                    if (nomeJogador.equals(auxJogador.getNome())){
                        auxEquipe.addjogador(auxJogador);
                        break;
                    }
                }
                break;
            }
        }
    }

    public void demitirJogador(String nomeEquipe, String nomeJogador){
        Equipe auxEquipe;
        Jogador auxJogador;
        for (int i = 0; i < listaEquipe.size(); i++){
            auxEquipe = listaEquipe.get(i);
            if (nomeEquipe.equals(auxEquipe.getNomeEquipe())){
                for (int j = 0; j < listaJogadores.size(); j++){
                    auxJogador = listaJogadores.get(j);
                    if (nomeJogador.equals(auxJogador.getNome())){
                        auxEquipe.removeJogador(auxJogador);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String listarJogadoresEqui(String nomeEquipe){
        String saida = "";
        Equipe auxEquipe;
        for (int i = 0; i < listaEquipe.size(); i++){
            auxEquipe = listaEquipe.get(i);
            if (nomeEquipe.equals(auxEquipe.getNomeEquipe())){
                saida = saida + auxEquipe.listarjogadores();
            }
        }
        return saida;
    }

    public String listaJogadoresPosi(String posicao){
        String saida = "";
        Jogador auxJogador;
        for (int i = 0; i < listaJogadores.size(); i++){
            auxJogador = listaJogadores.get(i);
            if (posicao.equals(auxJogador.getPosicao())){
                saida = saida + auxJogador.getNome() + " " + auxJogador.getPosicao() + '\n';
            }
        }
        return saida;
    }

    public String validarEquipe(String nomeEquipe){
        Equipe auxEquipe;
        String saida = "";
        for (int i = 0; i < listaEquipe.size(); i++){
            auxEquipe = listaEquipe.get(i);
            if (nomeEquipe.equals(auxEquipe.getNomeEquipe())){
                saida = saida + auxEquipe.getNomeEquipe();
            }
        }
        return saida;
    }

    public String validarJogador(String nomeJogador){
        Jogador auxJogador;
        String saida = "";
        for (int i = 0; i < listaJogadores.size(); i++){
            auxJogador = listaJogadores.get(i);
            if (nomeJogador.equals(auxJogador.getNome())){
                saida = saida + auxJogador.getNome();
            }
        }
        return saida;
    }
}
