import java.util.ArrayList;

public class Spillbrett {

    private int bredde;
    private int hoeyde;
    private Rute[][] spillbrett;
    
    public Spillbrett(int bredde, int hoeyde) {
        this.bredde = bredde;
        this.hoeyde = hoeyde;
        spillbrett = new Rute[hoeyde][bredde];
        this.fyllBrett();
    }

    public void fyllBrett() {
        for (int i = 0; i < hoeyde; i++) {
            for (int j = 0; j < bredde; j++) {
                spillbrett[i][j] = new Rute(i, j, this);
            }
        }
    }

    public void oppdater() {
        ArrayList<Rute> skalLeve = new ArrayList<>();
        ArrayList<Rute> skalDoe = new ArrayList<>();

        for (Rute[] rad : spillbrett) {
            for (Rute rute : rad) {
                if (rute.skalLeve()) {
                    skalLeve.add(rute);
                } else {
                    skalDoe.add(rute);
                }
            }
        }

        for (Rute lever : skalLeve) {
            lever.bliLevende();
        }
        for (Rute doer : skalDoe) {
            doer.bliDoe();
        }

    }

    public Rute[][] hentBrett(){
        return spillbrett;
    }

    public int hentBredde() {
        return bredde;
    }

    public int hentHoeyde() {
        return hoeyde;
    }

    @Override
    public String toString() {
        String returneres = "";

        for (Rute[] rad : spillbrett) {
            for (Rute rute : rad) {
                returneres += (rute.toString() + " ");
            }
            returneres += "\n";
        }

        return returneres;
    }
}
