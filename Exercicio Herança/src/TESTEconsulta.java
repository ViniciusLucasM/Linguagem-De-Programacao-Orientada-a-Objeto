import java.util.Scanner;

public class TESTEconsulta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String plano;
        int opcao = 0;
        int dependente = 0;
        int anoinclusao = 0;
        double valor = 0.0;

        Consulta consulta = new Consulta(dependente, anoinclusao, valor);
        ConsultaPrata consultaPrata = new ConsultaPrata(dependente, anoinclusao, valor);
        ConsultaOuro consultaOuro = new ConsultaOuro(dependente, anoinclusao, valor);
        ConsultaDiamante consultaDiamante = new ConsultaDiamante(dependente, anoinclusao, valor);
        ConsultaFamilia consultaFamilia = new ConsultaFamilia(dependente, anoinclusao, valor);

        System.out.print("Insira o nome do paciente: ");
        String nome = leia.nextLine();
        while (nome == null){
            System.out.println("O nome do paciente não pode ser branco");
            System.out.print("Insira o nome do paciente: ");
            nome = leia.nextLine();
        }
        if (nome != null){
            consulta.setNomepaciente(nome);
        }

        System.out.print("Insira a matrícula do paciente: ");
        String matricula = leia.nextLine();
        while (matricula == null){
            System.out.println("A matrícula do paciente não pode estar em branco");
            System.out.print("Insira a matrícula do paciente: ");
            matricula = leia.nextLine();
        }
        if (matricula != null) {
            consulta.setMatricula(matricula);
        }

        System.out.print("Insira o valor da consulta: ");
        valor = leia.nextDouble();
        while (valor <= 0) {
            System.out.println("O valor da consulta não pode ser 0 e nem negativo");
            System.out.print("Insira o valor da consulta: ");
            valor = leia.nextDouble();
        }
        if (valor != 0){
            consulta.setValorconsulta(valor);
        }

        System.out.print("Insira a quantidade de dependente: ");
        dependente = leia.nextInt();
        consulta.setDependente(dependente);

        System.out.print("Insira o ano de inclusão do plano: ");
        anoinclusao = leia.nextInt();
        while (anoinclusao <= 0) {
            System.out.println("O ano de inclusão não pode ser 0 e nem negativo");
            System.out.print("Insira o ano de inclusão do plano: ");
            anoinclusao = leia.nextInt();
        }
        if (anoinclusao != 0){
            consulta.setAnoinclusaoplano(anoinclusao);
        }

        while (opcao != 9) {
            System.out.println("[ 1 ] Plano Prata");
            System.out.println("[ 2 ] Plano Ouro");
            System.out.println("[ 3 ] Plano Diamante");
            System.out.println("[ 4 ] Plano Familia");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    consultaPrata.mostrarValor(valor);
                    System.out.println("O paciente vai ter um desconto de: " + consultaPrata.mostrarValor(valor));
                    break;
                case 2:
                    if (anoinclusao <= 2000) {
                        System.out.println("O paciente está insento do pagamento");
                    } else {
                        consultaOuro.mostrarValor(valor);
                        System.out.println("O paciente vai ter um desconto de: " + consultaOuro.mostrarValor(valor));
                    }
                    break;
                case 3:
                    consultaDiamante.mostrarValor(valor);
                    System.out.println("O paciente vai ter um desconto de: " + consultaDiamante.mostrarValor(valor));
                    break;
                case 4:
                    if (dependente > 2) {
                        consultaFamilia.mostrarValor(valor);
                        System.out.println("O paciente vai ter um desconto de: " + consultaFamilia.mostrarValor(valor));
                    } else {
                        System.out.println("O paciente está insento do pagamento");
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("O nome do paciente é: " + consulta.getNomepaciente());
                    System.out.println("A matrícula do paciente é: " + consulta.getMatricula());
                    System.out.println("A quantidade de dependente é: " + consulta.getDependente());
                    System.out.println("O ano de inclusão do plano é: " + consulta.getAnoinclusaoplano());
                    System.out.println();
                    break;
                case 9:
                    System.out.println();
                    System.out.println("PROGRAMA FINALIZADO COM SUCESSO");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("POR FAVOR INSIRA UMA OPÇÃO VALIDA");
                    System.out.println();
                    break;
            }
        }
    }
}
