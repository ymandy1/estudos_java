public class Coringa extends Vilao {
    public Coringa(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    @Override

    public void atirar() {
        if (vivo) {
            System.out.println("Coringa está atirando");

        } else {
            System.out.println("Coringa não pode mais atirar.");
        }
    }
}
