public class Main {

    public static void main (String[] args) throws InterruptedException {
        boolean[][] tab = new boolean[8][8];
        tab[2][1]=true;
        tab[3][1]=true;
        tab[2][2]=true;
        JeuSimple jeu = new JeuSimple(tab);

        Animation anim = new Animation(jeu);
        //System.out.println(jeu);
        anim.run(10);
    }


}
