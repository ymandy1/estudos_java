public class JamesBond extends Heroi {
    public JamesBond(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void atirar() {
        if (vivo) {
            System.out.println("James Bond está atirando");

        } else {
            System.out.println("James Bond não pode mais atirar.");
        }
    }

    public void saltar() {
        if (vivo) {
            System.out.println("James Bond está saltando");
        } else {
            System.out.println("James não pode mais saltar.");
        }
    }
}