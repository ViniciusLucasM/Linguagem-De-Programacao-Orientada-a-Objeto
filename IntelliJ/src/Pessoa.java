public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Estou no construtor da Pessoa");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
