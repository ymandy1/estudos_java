public abstract class Vilao extends Personagem {
    public Vilao(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void correr() {
        if (vivo) {
            System.out.println("Vilão correndo");
        } else {
            System.out.println("Vilão não pode mais correr.");
        }
    }
}
