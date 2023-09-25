public abstract class Personagem {
    private float posicao_x;
    private float posicao_y;
    private float posicao_z;
    protected boolean vivo;
    private int cor;

    public Personagem(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.posicao_z = posicao_z;
        this.vivo = vivo;
        this.cor = cor;
    }

    public void correr() {
        if (vivo) {
            System.out.println("Correndo");
            posicao_x++;
            posicao_y++;
        } else {
            System.out.println("O personagem não pode mais executar ações.");
        }
    }

    public void saltar() {
        if ((vivo)) {
            System.out.println("Saltando");
            posicao_z++;
        } else {
            System.out.println("O personagem não pode mais executar ações.");
        }
    }

    public void atirar() {
        if (vivo) {
            System.out.println("Atirando");
        } else {
            System.out.println("O personagem não pode mais executar ações.");
        }
    }

    public void morrer() {
        vivo = false;
    }

    public void vivoMorto() {
        if (vivo) {
            System.out.println(getClass().getSimpleName() + " está vivo!");
        } else {
            System.out.println(getClass().getSimpleName() + " está morto.");
        }

    }
}
