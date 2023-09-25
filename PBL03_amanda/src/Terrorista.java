public abstract class Terrorista extends Vilao {
    public Terrorista(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void atirar() {
        if (vivo) {
            System.out.println("Terrorista atirando");
        } else {
            System.out.println("Terrorista não pode mais atirar.");
        }
    }
}