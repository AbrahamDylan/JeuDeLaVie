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
       // System.out.println(tab);
        for (int i = 2; i<=3 ; i++){//< this.grille.length; i++) {
            for (int j = 0; j < this.grille[i].length; j++) {//System.out.print(this.grille.length+" ");
                //System.out.println(tab[i].length);
                mort = 8;
                for (int horizontale = -1; horizontale <= 1; horizontale++) {
                    for (int verticale = -1; verticale <= 1; verticale++) {
                        if (((i + verticale) < 0 || i + verticale >= this.grille.length) || ((j + horizontale) < 0) || j + horizontale >= this.grille[i].length) {
                        } else {
                            if ( this.grille[(i + verticale)][(j + horizontale)]) {
                                System.out.println((i + verticale)+" "+(j + horizontale));
                                mort--;
                            }
                        }
                    }
                }
                this.grille[i][j] =(mort == 6 && this.grille[i][j]) || mort == 5;
                System.out.print(mort+" ");
            }
            System.out.println("Suivant");
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
