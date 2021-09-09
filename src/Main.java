import java.util.LinkedList;

public class Main {

    public static void main (String[] args) throws InterruptedException {
        boolean[][] tab = new boolean[20][36];

        /*tab[1][4]=true; double cligno
        tab[1][6]=true;
        tab[1][5]=true;
        tab[5][2]=true;
        tab[5][1]=true;
        tab[5][3]=true;*/

        /*tab[1][3]=true; //fontaine 8 / 8
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
        tab[6][7]=true;*/

        tab[10][25]=true; //canon 9 / 36
        tab[11][25]=true;
        tab[11][23]=true;
        tab[12][22]=true;
        tab[12][21]=true;
        tab[12][35]=true;
        tab[12][34]=true;
        tab[12][13]=true;
        tab[13][15]=true;
        tab[12][12]=true;
        tab[13][11]=true;
        tab[13][16]=true;
        tab[13][22]=true;
        tab[13][21]=true;
        tab[13][35]=true;
        tab[13][34]=true;
        tab[14][21]=true;
        tab[14][22]=true;
        tab[14][17]=true;
        tab[14][13]=true;
        tab[14][0]=true;
        tab[14][1]=true;
        tab[15][1]=true;
        tab[15][0]=true;
        tab[15][11]=true;
        tab[15][14]=true;
        tab[15][15]=true;
        tab[15][23]=true;
        tab[15][25]=true;
        tab[16][25]=true;
        tab[16][14]=true;
        tab[16][10]=true;
        tab[17][11]=true;
        tab[17][15]=true;
        tab[18][13]=true;
        tab[18][12]=true;

       /* for(int i=0; i< tab.length;i++){
            for( int j=0; j<tab[i].length;j++){
                System.out.print(tab[i][j]);
            }
            System.out.println(' ');
        }*/

      //  LinkedList ll = new LinkedList();

        Jeu jeu = new JeuSimple(tab);

        Animation anim = new Animation(jeu);
        System.out.println(jeu);
       // anim.run(12);
    }


}
