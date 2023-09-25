public abstract class Heroi extends Personagem{
    public Heroi(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void correr(){
        System.out.println("Heroi correndo");

    }
    public void saltar(){
        System.out.println("Heroi saltando");

    }
}
