import java.awt.Event;

public class Animation {
    JeuSimple jeu;

    public Animation(JeuSimple jeu) {
        this.jeu = jeu;
    }

    public void run(int d) throws InterruptedException {
        System.out.print((char) Event.ESCAPE + "7");
        jeu.reset();

        for (int i = 0; i < d; i++) {
            System.out.print((char) Event.ESCAPE + "[2J");
            System.out.print((char) Event.ESCAPE + "8");
            System.out.print("");
            System.out.print(jeu);
            System.out.print("t = " + i);
            jeu.succ();
            Thread.sleep(200);
        }
    }
}
