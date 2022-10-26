import java.util.ArrayList;

public class Rute {

    private int x;
    private int y;
    Spillbrett brett;
    private boolean lever = false;
    
    public Rute(int x, int y, Spillbrett spillbrett) {
        this.x = x;
        this.y = y;
        brett = spillbrett;
    }

    public boolean lever() {
        return lever;
    }

    public void bliLevende() {
        lever = true;
    }

    public void bliDoe() {
        lever = false;
    }

    public ArrayList<Rute> hentNaboer() {

        ArrayList<Rute> naboer = new ArrayList<>();
        Rute[][] verden = brett.hentBrett();

        for (int i = (x > 0 ? -1 : 0); i < (x < brett.hentHoeyde() - 1 ? 2 : 1); i++) {
            for (int j = (y > 0 ? -1 : 0); j < (y < brett.hentBredde() - 1 ? 2 : 1); j++) {

                if (!(i == 0 && j == 0)) {
                    naboer.add(verden[x + i][y + j]);
                }
            }
        }
        return naboer;
    }

    public boolean skalLeve() {
        int antLevende = 0;
        for (Rute nabo : this.hentNaboer()) {
            if (nabo.lever()) {
                antLevende++;
            }
        }

        if (lever && (antLevende < 2 || antLevende > 3)) {
            return false;
        } else if ((!lever) && antLevende == 3) {
            return true;
        }

        return lever;
    }

    public void start() {
        lever = true;
    }

    @Override
    public String toString() {
        return lever ? "|1|" : "|0|";

        // midlertidig:
        // return "|X: " + x + " Y: " + y + "|";
    }
}
