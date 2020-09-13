public class Liqui_Analogico extends Liquidificador{

    public Liqui_Analogico(int velocidademax){
        super(velocidademax);
    }

    public void aumentarvelocidade(){
        if((getVelocidade() + 1) < getVelocidademax()){
            setVelocidade(getVelocidade() + 1);
        } else {
            System.out.println("A velocidade inserida ultrapassa a velocidade maxima");
        }
    }

    public void diminuirvelocidade(){
        if((getVelocidade() - 1) > 0){
            setVelocidade(getVelocidade() - 1);
        } else {
            System.out.println("A velocidade já voi diminuida ao maximo");
        }
    }
}
