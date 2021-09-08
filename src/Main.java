public class Main {

    public static void main (String[] args) throws InterruptedException {
        boolean[][] tab = new boolean[7][8];

        /*tab[1][4]=true; double cligno
        tab[1][6]=true;
        tab[1][5]=true;
        tab[5][2]=true;
        tab[5][1]=true;
        tab[5][3]=true;*/

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
       /* for(int i=0; i< tab.length;i++){
            for( int j=0; j<tab[i].length;j++){
                System.out.print(tab[i][j]);
            }
            System.out.println(' ');
        }*/
        JeuSimple jeu = new JeuSimple(tab);

        Animation anim = new Animation(jeu);
        System.out.println(jeu);
        anim.run(12);
    }


}
