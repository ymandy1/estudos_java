public abstract class Ladrao extends Vilao{
    public Ladrao(float posicao_x, float posicao_y, float posicao_z, boolean vivo, int cor) {
        super(posicao_x, posicao_y, posicao_z, vivo, cor);
    }

    public void saltar(){
        if (vivo) {
            System.out.println("Ladrão saltando");
        }else {
            System.out.println("O personagem não pode mais saltar");
        }
    }
}
