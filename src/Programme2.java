import java.io.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.Event;


public class Programme2 {
    static public void main(String[] args){

        boolean[][] tab = new boolean[7][8];

        tab[1][3]=true; //fontaine 8 / 8
        tab[1][4]=true;
        tab[2][6]=true;
        tab[2][5]=true;
        tab[2][2]=true;
        tab[2][1]=true;
        tab[3][1]=true;
        tab[3][6]=true;
        tab[4][5]=true;
        tab[4][2]=true;
        tab[5][2]=true;
        tab[5][5]=true;
        tab[5][7]=true;
        tab[5][0]=true;
        tab[6][0]=true;
        tab[6][1]=true;
        tab[6][6]=true;
        tab[6][7]=true;

        Jeu jeu = new JeuSimple(tab);

        System.out.print((char)Event.ESCAPE + "7");

        Timer t = new Timer(200, new ActionListener() {
            int i=0;
            public void actionPerformed(ActionEvent e) {
                System.out.print((char) Event.ESCAPE + "8");
                System.out.print("");
                System.out.println(jeu);
                jeu.succ();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                i++;
            }
        });
        t.start();

        try {
            System.in.read();
        }
        catch (IOException e){}

        t.stop();
    }
}
