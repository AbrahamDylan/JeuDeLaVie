public class Main {

    public static void main (String[] args) throws InterruptedException {
        boolean[][] tab = new boolean[8][8];
        JeuSimple jeu = new JeuSimple(tab);

        Animation anim = new Animation(jeu);

        anim.run(1000);
    }


}
