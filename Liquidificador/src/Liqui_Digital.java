public class Liqui_Digital extends Liquidificador{

    public Liqui_Digital(int velociodademax){
        super(velociodademax);
    }

    public void trocarvelocidade(int newvelocidade){
        if(newvelocidade < getVelocidademax() && newvelocidade > 0) {
            setVelocidade(newvelocidade);
        }
    }
}
