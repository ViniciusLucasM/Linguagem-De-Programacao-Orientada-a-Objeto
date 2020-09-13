public class Aviao {
    private String nomeVoo;
    private int quantidadePassageiros;
    private char estado;
    private int quantidadeMaxima;

    public Aviao(int newqtdMax){
        this.estado = 'P';
        this.quantidadeMaxima = newqtdMax;
    }

    public void decolar() {
        if (this.estado == 'P') {
            this.estado = 'V';
        }
    }

    public void pousar() {
        if (this.estado == 'V') {
            this.estado = 'P';
        }
    }

    public String getNomeVoo(){
        return this.nomeVoo;
    }

    public String getEstado(){
        if (this.estado == 'P') {
            return "Parado";
        } else {
            return "Voando";
        }
    }

    public int getQuantidadePassageiros(){
        return this.quantidadePassageiros;
    }

    public void setNomeVoo(String newnomeVoo) {
        if (!newnomeVoo.trim().equals("")) {
            this.nomeVoo = newnomeVoo;
        } else {
            System.out.println("Por favor insira um nome valido");
        }
    }

    public void setQuantidadeMaxima(int newqtdMax) {
        if (newqtdMax <= 0 || newqtdMax > this.quantidadeMaxima) {
            System.out.println("Quantidade maxima inserida é invalida");
        } else {
            this.quantidadeMaxima = newqtdMax;
        }
    }

    public int getQuantidadeMaxima() {
        return this.quantidadeMaxima;
    }

    public void embarcar() {
        if (this.estado == 'P' && this.quantidadeMaxima < this.quantidadePassageiros) {
            this.quantidadePassageiros++;
        } else {
            System.out.println("Quantidade maxima de passageiros atingida");
        }
    }

    public void desembarcar() {
        if (this.estado == 'P' && this.quantidadePassageiros > 0) {
            this.quantidadePassageiros--;
        } else {
            System.out.println("Todos os passageiros já foram desembarcados");
        }
    }
}
