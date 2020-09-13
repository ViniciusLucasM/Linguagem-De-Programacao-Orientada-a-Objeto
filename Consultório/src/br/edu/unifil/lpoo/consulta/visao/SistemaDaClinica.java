package br.edu.unifil.lpoo.consulta.visao;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsulta;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDaClinica {
    public static void main(String[] args) {
        CadastroDeConsulta CDC = new CadastroDeConsulta();
        ArrayList <Consulta> list = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int P = 0;
        int O = 0;
        int D = 0;
        int F = 0;
        String nomePlano;
        String nomePaciente;
        String matricula;
        int dependente;
        int anoInclusao;
        double valorConsulta;


        while (opcao != 9){
            System.out.println("[ 1 ] Cadastrar uma consulta");
            System.out.println("[ 2 ] Listar Consulta por Plano");
            System.out.println("[ 3 ] Listar Total de Consulta por Plano");
            System.out.println("[ 4 ] Listar o Valor Total das Consulta por Plano");
            System.out.println("[ 9 ] Sair do Programa");
            System.out.print("Insira a opção desejada: ");
            opcao  = leia.nextInt();
            leia.nextLine();
            switch (opcao){
                case 1:
                    if (opcao2 != 9){
                        System.out.println("[ 1 ] Consulta Prata");
                        System.out.println("[ 2 ] Consulta Ouro");
                        System.out.println("[ 3 ] Consulta Diamante");
                        System.out.println("[ 4 ] Consulta Familia");
                        opcao2 = leia.nextInt();
                        leia.nextLine();
                        switch (opcao2){
                            case 1:
                                P++;
                                System.out.print("Insira o Nome do Paciente: ");
                                nomePaciente = leia.nextLine();
                                System.out.print("Insira a Mátricula do Paciente: ");
                                matricula = leia.nextLine();
                                System.out.print("Insira quantos Dependentes o Paciente tem: ");
                                dependente = leia.nextInt();
                                System.out.print("Insira o Ano de Inclusão do Plano: ");
                                anoInclusao = leia.nextInt();
                                System.out.print("Insira o Valor da Consulta: ");
                                valorConsulta = leia.nextDouble();
                                CDC.novaConsulta(opcao2, nomePaciente, matricula, dependente, anoInclusao, valorConsulta);
                                CDC.Totalconsulta(opcao2, P);
                                break;
                            case 2:
                                O++;
                                System.out.print("Insira o Nome do Paciente: ");
                                nomePaciente = leia.nextLine();
                                System.out.print("Insira a Mátricula do Paciente: ");
                                matricula = leia.nextLine();
                                System.out.print("Insira quantos Dependentes o Paciente tem: ");
                                dependente = leia.nextInt();
                                System.out.print("Insira o Ano de Inclusão do Plano: ");
                                anoInclusao = leia.nextInt();
                                System.out.print("Insira o Valor da Consulta: ");
                                valorConsulta = leia.nextDouble();
                                CDC.novaConsulta(opcao2, nomePaciente, matricula, dependente, anoInclusao, valorConsulta);
                                CDC.Totalconsulta(opcao2, O);
                                break;
                            case 3:
                                D++;
                                System.out.print("Insira o Nome do Paciente: ");
                                nomePaciente = leia.nextLine();
                                System.out.print("Insira a Mátricula do Paciente: ");
                                matricula = leia.nextLine();
                                System.out.print("Insira quantos Dependentes o Paciente tem: ");
                                dependente = leia.nextInt();
                                System.out.print("Insira o Ano de Inclusão do Plano: ");
                                anoInclusao = leia.nextInt();
                                System.out.print("Insira o Valor da Consulta: ");
                                valorConsulta = leia.nextDouble();
                                CDC.novaConsulta(opcao2, nomePaciente, matricula, dependente, anoInclusao, valorConsulta);
                                CDC.Totalconsulta(opcao2, D);
                                break;
                            case 4:
                                F++;
                                System.out.print("Insira o Nome do Paciente: ");
                                nomePaciente = leia.nextLine();
                                System.out.print("Insira a Mátricula do Paciente: ");
                                matricula = leia.nextLine();
                                System.out.print("Insira quantos Dependentes o Paciente tem: ");
                                dependente = leia.nextInt();
                                System.out.print("Insira o Ano de Inclusão do Plano: ");
                                anoInclusao = leia.nextInt();
                                System.out.print("Insira o Valor da Consulta: ");
                                valorConsulta = leia.nextDouble();
                                CDC.novaConsulta(opcao2, nomePaciente, matricula, dependente, anoInclusao, valorConsulta);
                                CDC.Totalconsulta(opcao2, F);
                                break;
                            default:
                                System.out.println("OPÇÃO INVALIDA");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Insira o Plano do Paciente: ");
                    nomePlano = leia.nextLine();
                    System.out.println(CDC.getNomeMatricula(nomePlano));
                    break;
                case 3:
                    System.out.print("Insira o Plano do Paciente: ");
                    nomePlano = leia.nextLine();
                    System.out.println(CDC.consultaTotal(nomePlano));
                    break;
                case 4:
                    System.out.print("Insira o Plano do Paciente: ");
                    nomePlano = leia.nextLine();
                    System.out.println(CDC.valorTotal(nomePlano));
                    break;
                default:

            }
        }
    }
}
