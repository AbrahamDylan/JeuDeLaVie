public class Main {

    public static void main (String[] args) throws InterruptedException {
        boolean[][] tab = new boolean[8][8];
        tab[2][1]=true;
        tab[3][1]=true;
        tab[2][2]=true;
       /* for(int i=0; i< tab.length;i++){
            for( int j=0; j<tab[i].length;j++){
                System.out.print(tab[i][j]);
            }
            System.out.println(' ');
        }*/
        JeuSimple jeu = new JeuSimple(tab);

        Animation anim = new Animation(jeu);
        //System.out.println(jeu);
        anim.run(10);
    }


}
