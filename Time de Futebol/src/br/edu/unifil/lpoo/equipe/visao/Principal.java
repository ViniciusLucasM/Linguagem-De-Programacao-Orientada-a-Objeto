package br.edu.unifil.lpoo.equipe.visao;

import br.edu.unifil.lpoo.equipe.controle.Controle;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner leia = new Scanner(System.in);
        String nomeJogador;
        String nomeEquipe;
        String posicao;
        int opcao = 0;

        while (opcao != 9){
            System.out.println("[ 1 ]Cadastrar Jogador");
            System.out.println("[ 2 ]Cadastrar Equipe");
            System.out.println("[ 3 ]Contratar Jogador");
            System.out.println("[ 4 ]Demitir Jogador");
            System.out.println("[ 5 ]Listar Jogador de um time");
            System.out.println("[ 6 ]Listar Jogadores por posição");
            System.out.println("[ 9 ]Sair do Programa");
            System.out.print("INSIRA A OPÇÃO DESEJADA: ");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do Jogador: ");
                    nomeJogador = leia.nextLine();
                    System.out.print("Digite a posição do Jogador: ");
                    posicao = leia.nextLine();
                    while (nomeJogador.equals("") || posicao.equals("")){
                        System.out.println();
                        System.out.println("POR FAVOR INSIRA O NOME DO JOGADOR E SUA POSIÇÃO");
                        System.out.print("Digite o nome do Jogador: ");
                        nomeJogador = leia.nextLine();
                        System.out.print("Digite a posição do Jogador: ");
                        posicao = leia.nextLine();
                    }
                    controle.cadastradJogador(nomeJogador, posicao);
                    System.out.println();
                    System.out.println("Jogador " + nomeJogador + " da Posição " + posicao + " Adicionado com sucesso!!");
                    break;
                case 2:
                    System.out.print("Digite o nome da Equipe: ");
                    nomeEquipe = leia.nextLine();
                    while (nomeEquipe.equals("")){
                        System.out.println();
                        System.out.println("POR FAVOR INSIRA O NOME DA EQUIPE");
                        System.out.print("Digite o nome da Equipe: ");
                        nomeEquipe = leia.nextLine();
                    }
                    controle.cadastrarEquipe(nomeEquipe);
                    System.out.println();
                    System.out.println("Equipe " + nomeEquipe + " Cadastrada com sucesso!!");
                    break;
                case 3:
                    System.out.print("Digite o nome da Equipe desejada: ");
                    nomeEquipe = leia.nextLine();
                    System.out.print("Digite o nome do Jogador: ");
                    nomeJogador = leia.nextLine();
                    while (!nomeEquipe.equals(controle.validarEquipe(nomeEquipe)) || !nomeJogador.equals(controle.validarJogador(nomeJogador)) || nomeJogador.equals("") || nomeEquipe.equals("")){
                        System.out.println();
                        System.out.println("A EQUIPE OU O JOGADOR INSERIDO, NÃO EXISTE NO BANCO DE DADOS OU ESTA FAZIO. POR FAVOR INSIRA NOVAMENTE");
                        System.out.print("Digite o nome da Equipe desejada: ");
                        nomeEquipe = leia.nextLine();
                        System.out.print("Digite o nome do Jogador: ");
                        nomeJogador = leia.nextLine();
                    }
                    controle.contratarJogador(nomeEquipe, nomeJogador);
                    System.out.println();
                    System.out.println("Jogador " + nomeJogador + " adicionado na Equipe " + nomeEquipe);
                    break;
                case 4:
                    System.out.print("Digite o nome da Equipe desejada: ");
                    nomeEquipe = leia.nextLine();
                    System.out.print("Digite o nome do Jogador: ");
                    nomeJogador = leia.nextLine();
                    while (!nomeEquipe.equals(controle.validarEquipe(nomeEquipe)) || !nomeJogador.equals(controle.validarJogador(nomeJogador)) || nomeJogador.equals("") || nomeEquipe.equals("")){
                        System.out.println();
                        System.out.println("A EQUIPE OU O JOGADOR INSERIDO, NÃO EXISTE NO BANCO DE DADOS OU ESTA FAZIO. POR FAVOR INSIRA NOVAMENTE");
                        System.out.print("Digite o nome da Equipe desejada: ");
                        nomeEquipe = leia.nextLine();
                        System.out.print("Digite o nome do Jogador: ");
                        nomeJogador = leia.nextLine();
                    }
                    controle.demitirJogador(nomeEquipe, nomeJogador);
                    System.out.println();
                    System.out.println("Jogador " + nomeJogador + " foi demitido da Equipe " + nomeEquipe);
                    break;
                case 5:
                    System.out.print("Digite o nome da Equipe: ");
                    nomeEquipe = leia.nextLine();
                    while (!nomeEquipe.equals(controle.validarEquipe(nomeEquipe)) || nomeEquipe.equals("")){
                        System.out.println();
                        System.out.println("A EQUIPE INSERIDA, NÃO EXISTE NO BANCO DE DADOS OU ESTA FAZIA. POR FAVOR INSIRA NOVAMENTE");
                        System.out.print("Digite o nome da Equipe: ");
                        nomeEquipe = leia.nextLine();
                    }
                    System.out.println();
                    System.out.println(controle.listarJogadoresEqui(nomeEquipe) + " está na Equipe " + nomeEquipe);
                    break;
                case 6:
                    System.out.print("Digite a posição desejada: ");
                    posicao = leia.nextLine();
                    while (posicao.equals("")){
                        System.out.println();
                        System.out.println("A POSIÇÃO INSERIDA, NÃO EXISTE NO BANCO DE DADOS OU ESTA FAZIA. POR FAVOR INSIRA NOVAMENTE");
                        System.out.print("Digite a posição desejada: ");
                        posicao = leia.nextLine();
                    }
                    System.out.println();
                    System.out.println(controle.listaJogadoresPosi(posicao) + " pertence a posição " + posicao);
                    break;
                case 9:
                    System.out.println();
                    System.out.println("Programa Finalizado, Obrigado Pela preferência :)");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("POR FAVOR INSIRA UMA OPÇÃO VÁLIADA");
                    System.out.println();
                    break;
            }
        }
    }
}