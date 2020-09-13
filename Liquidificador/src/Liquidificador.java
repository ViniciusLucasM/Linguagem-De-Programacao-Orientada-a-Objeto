public class Liquidificador {
    private int velocidade;
    private int velocidademax;

    public Liquidificador(int velocidademax){
        if(velocidademax > 0){
            this.velocidademax = velocidademax;
        } else {
            System.out.println("Por favor insirá um valor superior a 0");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int newvelocidade) {
        if(newvelocidade < velocidademax){
            this.velocidade = newvelocidade;
        } else {
            System.out.println("A velocidade inserida é invalida");
        }
    }

    public int getVelocidademax() {
        return velocidademax;
    }

    public void setVelocidademax(int newvelocidademax) {
            this.velocidademax = newvelocidademax;
    }
}
