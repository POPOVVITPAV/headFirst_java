package gameRandom;

public class GuessGame {
    Player pl1;
    Player pl2;
    Player pl3;

    public void startGame() {
        pl1 = new Player();
        pl2 = new Player();
        pl3 = new Player();

        int numPl1;
        int numPl2;
        int numPl3;

        int targetNum = (int) (Math.random() * 100);
        System.out.println("Computer num is 0...100");
        System.out.println(targetNum);

        pl1.guess();
        pl2.guess();
        pl3.guess();

        numPl1 = pl1.number;
        numPl2 = pl2.number;
        numPl3 = pl3.number;

    }
}
