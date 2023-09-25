public class Batman extends Heroi implements Camuflagem {

    public Batman(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void atirar() {
        if (vivo) {
            System.out.println("Batman está atirando");
        } else {
            System.out.println("Batman não pode mais atirar");
        }
    }


    public void camuflar(int cor) {
        if (vivo) {
            System.out.println("Batman está se camuflando da cor: " + cor);
        } else {
            System.out.println("Batman não pode mais se camuflar.");
        }
    }
}
