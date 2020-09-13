import java.util.Scanner;

public class Use_Aviao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a quantidade maxima disponivel: ");
        int newqtdMax = leia.nextInt();
        int leitor = 0;
        int leitor2 = 0;
        int leitor3 = 0;
        int leitor4 = 0;
        String newnomeVoo;
        Aviao Use_Aviao = new Aviao(newqtdMax);


        while (leitor != 9) {
            System.out.println("========================================");
            System.out.println("===========GERENCIADOR DE VOO===========");
            System.out.println("========================================");
            System.out.println("[ 1 ] Atualizar informações sobre o voo");
            System.out.println("[ 2 ] Comandos do avião");
            System.out.println("[ 3 ] Consulta de Informações");
            System.out.println("[ 9 ] SAIR DO GERENCIADOR DE VOO");
            leitor = leia.nextInt();
            if (leitor == 1){
                while (leitor2 != 9){
                    System.out.println("========================================");
                    System.out.println("=======ATUALIZADOR DE INFORMAÇÕES=======");
                    System.out.println("========================================");
                    System.out.println("[ 1 ] Atualizar nome do voo");
                    System.out.println("[ 2 ] Atualizar quantidade maxima de passageiros disponível");
                    System.out.println("[ 9 ] SAIR DO ATUALIZADOR DE INFORMAÇÕES");
                    leitor2 = leia.nextInt();
                    leia.nextLine();
                    switch (leitor2) {
                        case (1):
                            System.out.println();
                            System.out.print("Insira o novo nome do voo: ");
                            newnomeVoo = leia.nextLine();
                            while (newnomeVoo.isEmpty() | newnomeVoo.equals(" ")) {
                                System.out.println("Por favor insira um nome de voo");
                                System.out.println("Insira o novo nome do voo");
                                newnomeVoo = leia.nextLine();
                            }
                            Use_Aviao.setNomeVoo(newnomeVoo);
                            System.out.println("Nome do voo atualizado com sucesso para " + Use_Aviao.getNomeVoo());
                            System.out.println();
                            break;
                        case (2):
                            System.out.println();
                            System.out.println("Insira a quantidade maxima de passageiros disponivel: ");
                            newqtdMax = leia.nextInt();
                            while (newqtdMax == 0) {
                                System.out.println("Quantidade maxima inserida é invalida, por favor insira uma quantidade valida");
                                System.out.println("Insira a quantidade maxima de passageiros disponivel: ");
                                newqtdMax = leia.nextInt();
                            }
                            Use_Aviao.setQuantidadeMaxima(newqtdMax);
                            System.out.println("Quantidade maxima de passageiros atualizada para " + Use_Aviao.getQuantidadeMaxima());
                            System.out.println();
                            break;
                        case (9):
                            System.out.println();
                            System.out.println("Saindo do Atualizador de informações");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Por Favor Insirá uma opção existente");
                    }
                }
            } else if (leitor == 2) {
                while (leitor3 != 9) {
                    System.out.println("========================================");
                    System.out.println("==========GERENCIADOR DO AVIÃO==========");
                    System.out.println("========================================");
                    System.out.println("[ 1 ] Decolar");
                    System.out.println("[ 2 ] Pousar");
                    System.out.println("[ 3 ] Embarcar");
                    System.out.println("[ 4 ] Desembarcar");
                    System.out.println("[ 9 ] SAIR DO GERENCIADOR DO AVIÃO");
                    leitor3 = leia.nextInt();
                    leia.nextLine();
                    switch (leitor3) {
                        case (1):
                            Use_Aviao.decolar();
                            break;
                        case (2):
                            Use_Aviao.pousar();
                            break;
                        case (3):
                            Use_Aviao.embarcar();
                            break;
                        case (4):
                            Use_Aviao.desembarcar();
                            break;
                        case (9):
                            System.out.println();
                            System.out.println("Saindo do Gerenciador do avião");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Por Favor Insirá uma opção existente");
                    }
                }
            } else if (leitor == 3) {
                while (leitor != 9) {
                    System.out.println();
                    System.out.println("Nome do voo disponivel é: " + Use_Aviao.getNomeVoo());
                    System.out.println("O estado do voo é: " + Use_Aviao.getEstado());
                    System.out.println("A quantidade de passageiros é de: " + Use_Aviao.getQuantidadePassageiros());
                    System.out.println("A capacidade maxima de passageiros é de: " + Use_Aviao.getQuantidadeMaxima());
                    System.out.println();
                }
            }
        }
    }
}
