import java.io.*;


public class JeuDeLaVie implements Jeu {
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

    public String toString() {
        String tab = "";
        for (boolean[] booleans : this.grille) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    tab += "* ";
                } else {
                    tab += ". ";
                }
            }
            tab += "\n";
        }
        tab += "\n";
        return tab;
    }

}
