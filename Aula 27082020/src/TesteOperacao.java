public class TesteOperacao {
    public static void main(String[] args) {
        Operacao ope = new Operacao();
        System.out.println(ope.soma(5, 7));
        System.out.println(ope.soma(3.5, 2.7, 6.1));
        int[] vetor = {3, 4, 5, 6};
        System.out.println(ope.soma(vetor));

        int[] vetorNum = {20, 3, 40, 5, 67, 2};
        System.out.println(ope.soma(vetorNum));

        System.out.println("Maior entre 5 e 9: ");
        ope.maiorNumero(5,9);

        System.out.println("Maior entre 7, 9 e 2: ");
        ope.maiorNumero(7,9,2);
    }
}
