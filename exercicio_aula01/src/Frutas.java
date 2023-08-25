import javax.swing.text.StyledEditorKit;

public class Frutas {
    String cor;
    String nome;
    double peso;

    Boolean comer;
    Boolean cortar;

    void comer() {
        if (comer == true) {
            System.out.println("você está comendo a fruta: " + this.nome);
        } else {
            System.out.println("você não está comendo nenhuma fruta");
        }
    }

    void status() {
        System.out.println("A cor da fruta é: " + this.cor);
        System.out.println("O peso da fruta é: " + this.peso);
    }

    void cortar() {
        if (cortar == false && comer == true) {
            System.out.println("você não cortou a fruta: " + this.nome);
        }
        if (cortar == true && comer == true) {
            System.out.println("você está cortando a fruta: " + this.nome);
        }
        if (comer == false && cortar == true){
            System.out.println("você não tem frutas para cortar");
        }
    }
}

