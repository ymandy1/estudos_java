public class Pinguim extends Vilao {
    public Pinguim(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void atirar() {
        if (vivo) {
            System.out.println("Pinguim está atirando");
        } else {
            System.out.println("Pinguim não pode mais executar ações.");
        }
    }

    public void correr() {
        if (vivo) {
            System.out.println("Pinguim está correndo");

        } else {
            System.out.println("Pinguim não pode mais correr.");
        }
    }
}