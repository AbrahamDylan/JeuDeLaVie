import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JeuDeLaVie implements Jeu{
    public boolean[][] grille;

    public JeuDeLaVie(String nomFichier) {
        try {
            File file = new File(nomFichier);
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            int j = 0, i = 0;
            while ((line = br.readLine()) != null) {
                i++;
                j = line.length();
            }
            this.grille = new boolean[i][j];

            /*br.close();
            reader.close();

            FileReader reader2 = new FileReader(file);
            BufferedReader br2 = new BufferedReader(reader);*/

            i = 0;
            int count = 0;
            while ((line = br.readLine()) != null) {

                for (j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == '*'){
                        this.grille[i][j] = true;
                        System.out.println("la boucle passe");
                    }
                    if(line.charAt(i) != ' ')
                        count++;
                }
                i++;
            }
            reader.close();
            System.out.println("Nombre total de caractères est: " + count);
            System.out.println(grille[0][1]);
            System.out.println(grille[1][5]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void succ(){


    }

    public String toString(){
        String tab = "";

        return tab;
    }
/*
    public void triFusion(int deb, int fin)
    {
        if (deb < fin)
        {
            int milieu = (deb + fin) / 2;
            triFusion(deb, milieu);
            triFusion(milieu + 1, fin);
            fusionner ( deb, milieu, fin);
        }
    }
    public void fusionner(int deb, int mid, int fin){
         LinkedList copie = (LinkedList) this.cellulesAct.clone();

        int i1 = deb;      // indice dans la première moitié de copie
        int i2 = mid + 1; // indice dans la deuxième moitié de copie
        int i = deb;       // indice dans le tableau tab

        while (i1 <= mid && i2 <= fin)
        {
            //quelle est la plus petite tête de liste?
            if (copie.get(i1) <= copie.get(i2))
            {
                this.cellulesAct[i] = copie[i1];
                i1++;
            }
            else
            {
                this.cellulesAct[i] = copie[i2];
                i2++;
            }
            i++;
        }
        if (i <= fin)
        {
            while (i1 <= mid)  // le reste de la première moitié
            {
                this.cellulesAct[i] = copie[i1];
                i1++;
                i++;
            }
            while (i2 <= fin) // le reste de la deuxième moitié
            {
                this.cellulesAct[i] = copie[i2];
                i2++;
                i++;
            }
        }
    }*/
}