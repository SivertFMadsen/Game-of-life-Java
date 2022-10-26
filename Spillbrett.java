public class Spillbrett {

    private int bredde;
    private int hoeyde;
    private Rute[][] spillbrett;
    
    public Spillbrett(int bredde, int hoeyde) {
        this.bredde = bredde;
        this.hoeyde = hoeyde;
        spillbrett = new Rute[bredde][hoeyde];
        this.fyllBrett();
    }

    public void fyllBrett() {
        for (int i = 0; i < hoeyde; i++) {
            for (int j = 0; j < bredde; j++) {
                spillbrett[i][j] = new Rute(i, j, this);
            }
        }
    }

    public void update() {

    }

    public Rute[][] hentBrett(){
        return spillbrett;
    }

    public int hentBredde() {
        return bredde;
    }

    public int hentHoyde() {
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
