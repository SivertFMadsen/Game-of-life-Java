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

    public ArrayList<Rute> hentNaboer() {

        ArrayList<Rute> naboer = new ArrayList<>();
        Rute[][] verden = brett.hentBrett();

        if (x != 0) {
            naboer.add(verden[x - 1][y]);
        }

        if (x != brett.hentBredde() - 1) {
            naboer.add(verden[x + 1][y]);
        }

        if (y != 0) {
            naboer.add(verden[x][y - 1]);
        }

        if (y != brett.hentHoyde() - 1) {
            naboer.add(verden[x][y + 1]);
        }

        return naboer;
    }


    @Override
    public String toString() {
        // return lever ? "1" : "0";

        // midlertidig:
        return "X: " + x + " Y: " + y;
    }
}
