import java.util.Scanner;

public class Testeliqui {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Inserir a velocidade maxima disponivel: ");
        int newvelomax = leia.nextInt();
        while (newvelomax <= 0) {
            System.out.println("Por Favor insirá um número correspondente");
            System.out.print("Insirá a nova velocidade maxima: ");
            newvelomax = leia.nextInt();
        }
        int opcao = 0;
        Liquidificador liquidificador = new Liquidificador(newvelomax);
        Liqui_Analogico liquiAnalogico = new Liqui_Analogico(newvelomax);
        Liqui_Digital liquiDigital = new Liqui_Digital(newvelomax);

        while (opcao != 9) {
            System.out.println("[  1  ] Atualizar velocidade maxima");
            System.out.println("[  2  ] Aumentar velocidade        ");
            System.out.println("[  3  ] Diminuir velocidade        ");
            System.out.println("[  4  ] Consultar informações      ");
            System.out.println("[  9  ] FINALIZAR PROGRAMA         ");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.print("Insirá a nova velocidade maxima: ");
                    newvelomax = leia.nextInt();
                    while (newvelomax <= 0) {
                        System.out.println("Por Favor insirá um número correspondente");
                        System.out.print("Insirá a nova velocidade maxima: ");
                        newvelomax = leia.nextInt();
                    }
                    if (newvelomax > 0) {
                        liquidificador.setVelocidademax(newvelomax);
                        System.out.println("Velocidade maxima atualizada para: " + liquidificador.getVelocidademax());
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < newvelomax; i++) {
                        if (i < newvelomax) {
                            liquiDigital.trocarvelocidade(i);
                            liquiAnalogico.aumentarvelocidade();
                            System.out.println();
                            System.out.println("A velocidade do liquidificador analógico é de: " + liquiAnalogico.getVelocidade());
                            System.out.println("A velocidade do liquidificador digital é de: "+ liquiDigital.getVelocidade());
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i < newvelomax; i++) {
                        if (i < newvelomax) {
                            liquiAnalogico.diminuirvelocidade();
                            System.out.println();
                            System.out.println("A velocidade do liquidificador analógico é de: " + liquiAnalogico.getVelocidade());
                            System.out.println("A velocidade do liquidificador digital é de: "+ liquiDigital.getVelocidade());
                        }
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("A velocidade do liquidificador analogico é de: " + liquiAnalogico.getVelocidade());
                    System.out.println("A velocidade do liquidificador digital é de: " + liquiDigital.getVelocidade());
                    System.out.println("A velocidade maxima definida é de: " + liquidificador.getVelocidademax());
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

