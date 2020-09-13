public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Antonio");

        aluno.setNome("Antonio");
        aluno.setEndereco("Rua Goias, 1202");
        aluno.setMatricula(122);

        double n[] = new double[4];
        for (int i=0; i < n.length; i++){
            n[i] = 1 + (int)(Math.random() * 10);
            System.out.println(n[i]);
        }
        aluno.setNotas(n);

        double novo[] = aluno.getNotas();
        for(int i = 0; i < novo.length; i++){
            System.out.println("Notas:" + novo[i]);
        }

        Professor professor = new Professor("Edson");
        professor.setNome("Edson");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getMatricula());
    }
}
