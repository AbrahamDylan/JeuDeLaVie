public class JeuSimple {
    private boolean etat;

    public boolean succ(boolean[][] tab, int positionX, int positionY) {
        int mort = 8;
        for (int horizontale = -1; horizontale <= 1; horizontale++) {
            for (int verticale = -1; verticale <= 1; verticale++) {
                if (tab[(positionX + verticale)][(positionY + horizontale)]) {
                    mort--;
                }
            }
        }

        return (mort == 6 && tab[positionX][positionY]) || mort == 5;
    }

    public String toString() {
        return etat ? "+" : "_";
    }
}
