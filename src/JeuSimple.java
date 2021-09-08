import java.util.Scanner;

public class JeuSimple {/*
    private boolean etat;
    private int posX;
    private int posY;*/
    private boolean[][] grille;

    public JeuSimple(boolean[][] tab) {
        this.grille=tab;
    }

    ;

    public void succ(boolean[][] tab) {
        int mort = -1;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                mort = 8;
                for (int horizontale = -1; horizontale <= 1; horizontale++) {
                    for (int verticale = -1; verticale <= 1; verticale++) {
                        if (((i + verticale) < 0 || i + verticale >= tab.length) || ((j + horizontale) < 0) || j + horizontale >= tab[i].length) {
                            mort--;
                        } else {
                            if (tab[(i + verticale)][(j + horizontale)]) {
                                mort--;
                            }
                        }
                    }
                }
                tab[i][j] = (mort == 6 && tab[i][j]) || mort == 5;
            }
        }
        // return (mort == 6 && tab[this.posX][this.posX]) || mort == 5;
    }

    public String toString() {

        String tab = "";
        for(int i = 0; i<this.grille.length; i++){
            for (int j = 0 ; j<this.grille[i].length; j++){
                if (grille[i][j]){
                    tab += "* ";
                } else{
                    tab += ". ";
                }
                if (j == grille.length-1){
                    tab += "\n";
                }
            }
        }
        tab += "\n";
        return tab;
    }
}
