import java.util.Scanner;

public class RhPrincipal {
    public static void main(String args[]) {
        Controle ctr = new Controle();
        Scanner teclado = new Scanner(System.in);
        double salario;
        String nome;
        int opcao = 0;
        int matricula;
        while (opcao != 9) {
            System.out.println("1-cadastrar empregado");
            System.out.println("2-listar todos empregados");
            System.out.println("3-cadastrar departamento");
            System.out.println("4-Adicionar empregado no Departamento");
            System.out.println("5-Remover empregado do Departamento");   //implementação do aluno
            System.out.println("6-Listar Empregados por departamento");  //implementação do aluno
            System.out.println("7-Listar Departamento");                 //implementação do aluno
            System.out.println("9-fim");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome empregado: ");
                    nome = teclado.nextLine();
                    System.out.print("Salario: ");
                    salario = teclado.nextDouble();
                    teclado.nextLine();
                    ctr.cadastraEmpregado(nome, salario);
                    break;
                case 2:
                    System.out.println(ctr.listarEmpregado());
                    break;
                case 3:
                    System.out.print("Departamento: ");
                    nome = teclado.nextLine();
                    ctr.cadastraDepartamento(nome);
                    break;
                case 4:
                    System.out.print("Departamento: ");
                    nome = teclado.nextLine();
                    System.out.print("Matricula do Empregado: ");
                    matricula = teclado.nextInt();
                    teclado.nextLine();
                    ctr.adicionaEmpDep(nome, matricula);
                    break;
                case 5:
                    ////implementação do aluno
                    System.out.println("Departamento: ");
                    nome = teclado.nextLine();
                    System.out.println("Matricula do Empregado: ");
                    matricula = teclado.nextInt();
                    teclado.nextLine();
                    ctr.removeEmpDep(nome, matricula);
                    break;
                case 6:
                    ////implementação do aluno
                    System.out.println("Departamento: ");
                    nome = teclado.nextLine();
                    System.out.println(ctr.listarEmpregadoDep(nome));
                    break;
                case 7:
                    ////implementação do aluno
                    System.out.println(ctr.listarDepartamento());
                    break;
            }
        }
    }
}
