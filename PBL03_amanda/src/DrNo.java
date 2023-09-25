public class DrNo extends Terrorista {
    public DrNo(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void saltar() {
        if (vivo) {
            System.out.println("DrNo está saltando");

        } else {
            System.out.println("DrNo não pode mais saltar.");
        }
    }

    public void atirar () {
        if (vivo) {
            System.out.println("DrNo está atirando");

        } else {
            System.out.println("DrNo não pode mais atirar");
        }
    }


    public void correr () {
        if (vivo) {
            System.out.println("DrNo está correndo");
        } else {
            System.out.println("DrNo não pode mais correr.");
        }
    }

}

