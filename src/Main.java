public class Main {

    public static void main (String[] args) throws InterruptedException {
        JeuSimple jeu = new JeuSimple();

        Animation anim = new Animation(jeu);

        anim.run(10);
    }


}
