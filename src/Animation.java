import java.awt.Event;

public class Animation {
    JeuSimple jeu;
    boolean[][] tab= new boolean[5][5];

    public Animation(JeuSimple jeu) {
        this.jeu = jeu;
    }

    public void run(int d) throws InterruptedException {
        /*tab[2][1]=true;
        tab[3][1]=true;
        tab[2][2]=true;*/
        System.out.print((char) Event.ESCAPE + "7");
        //jeu.reset();

        for (int i = 0; i < d; i++) {
            System.out.print((char) Event.ESCAPE + "[2J");
            System.out.print((char) Event.ESCAPE + "8");
            System.out.print("");
            System.out.print(jeu);
            System.out.print("t = " + i);
            jeu.succ(tab);
            Thread.sleep(200);
        }
    }
}
