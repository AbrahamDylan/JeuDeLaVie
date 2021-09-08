import java.util.Scanner;


public class JeuSimple {/*
    private boolean etat;
    private int posX;
    private int posY;*/
    private boolean[][] grille;

    public JeuSimple(boolean[][] tab) {
        this.grille = tab;
    }

    ;

    public void succ() {

        boolean[][] tabDoublon = new boolean[this.grille.length][this.grille[0].length];
        // System.out.println(tab);
        for (int i = 0; i < this.grille.length; i++) {
            for (int j = 0; j < this.grille[i].length; j++) {
                tabDoublon[i][j] = chercheMort(i, j);
            }
        }
        this.grille = tabDoublon;
    }

    public boolean chercheMort(int i, int j) {
        int mort = 8;
        for (int horizontale = -1; horizontale <= 1; horizontale++) {
            for (int verticale = -1; verticale <= 1; verticale++) {
                if (((horizontale == 0 && verticale == 0) || (i + horizontale) < 0 || i + horizontale >= this.grille.length) || ((j + verticale) < 0) || j + verticale >= this.grille[i].length) {
                } else {
                    if (this.grille[(i + horizontale)][(j + verticale)]) {
                        mort--;
                    }
                }
            }
        }
        return (mort == 6 && this.grille[i][j]) || mort == 5;
    }

    public String toString() {

        String tab = "";
        for (int i = 0; i < this.grille.length; i++) {
            for (int j = 0; j < this.grille[i].length; j++) {
                if (grille[i][j]) {
                    tab += "* ";
                } else {
                    tab += ". ";
                }
                if (j == grille.length - 1) {
                    //tab += "\n";
                }
            }tab += "\n";
        }
        tab += "\n";
        return tab;

    }
}
