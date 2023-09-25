public class GoldFinger extends Terrorista implements Personificacao {
    public GoldFinger(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void saltar() {
        if (vivo) {
            System.out.println("GoldFinger está saltando");
        } else {
            System.out.println("GoldFinger não pode mais saltar.");
        }
    }

    public void camuflar(int cor) {
        if (vivo) {
            System.out.println("GoldFinger está se camuflando de: " + cor);
        } else {
            System.out.println("GoldFinger não pode mais se camuflar");
        }
}
    public void personificar(Heroi heroi){
        if (vivo){
        System.out.println("Goldfinger está se transformando em: " + heroi.getClass().getSimpleName());
    } else {
            System.out.println("GoldFinger não pode mais personificar.");
        }
    }
}
