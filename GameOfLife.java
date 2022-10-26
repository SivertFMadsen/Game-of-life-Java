/**
 * Hovedprogram
 */
public class GameOfLife {

    public static void main(String[] args) {
        System.out.println("Game of life");
        Spillbrett brett = new Spillbrett(10, 10);

        System.out.println(brett);

        Rute testRute = brett.hentBrett()[1][1];
        for (Rute r : testRute.hentNaboer()) {
            System.out.println(r.toString());
        }
    }
    
}