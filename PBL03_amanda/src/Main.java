public class Main {
    public static void main(String[] args) {

        Personagem batman = new Batman(2, 1,10,false,3);
        batman.vivoMorto();
        batman.atirar();
        ((Batman) batman).camuflar(2);
        Personagem coringa = new Coringa(120, 200, 5, false, 5);
        coringa.atirar();

        Personagem jamesBond = new JamesBond(60, 70, 6,true, 6);
        jamesBond.atirar();
        jamesBond.saltar();

        Personagem pinguim = new Pinguim(30, 120, 5,true, 8);
        pinguim.atirar();
        pinguim.correr();

        Personagem drNo = new DrNo(70, 50, 1,false, 7);
        drNo.vivoMorto();
        drNo.saltar();
        drNo.atirar();
        drNo.correr();

        Personagem goldfinger = new GoldFinger(30, 50, 4,true, 2);
        goldfinger.saltar();
        ((GoldFinger) goldfinger).camuflar(2);
        ((GoldFinger) goldfinger).personificar((Heroi) batman);
    }

}


