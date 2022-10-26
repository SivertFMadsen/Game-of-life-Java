public class GameOfLife {

    public static void main(String[] args) {
        System.out.println("Game of life");
        Spillbrett brett = new Spillbrett(12, 10);

        brett.hentBrett()[0][1].start();
        brett.hentBrett()[1][2].start();
        brett.hentBrett()[2][0].start();
        brett.hentBrett()[2][1].start();
        brett.hentBrett()[2][2].start();

        for (int i = 0; i < 20; i++) {
            System.out.println(brett);
            brett.oppdater();
        }
    }
    
}