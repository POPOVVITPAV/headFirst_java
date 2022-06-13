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

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNum = (int) (Math.random() * 100);
        System.out.println("Computer num is 0...100");
        System.out.println(targetNum);
        while (true) {
            pl1.guess();
            pl2.guess();
            pl3.guess();

            numPl1 = pl1.number;
            System.out.println("Первый игрок думает, что это " + numPl1);
            numPl2 = pl2.number;
            System.out.println("Второй игрок думает, что это " + numPl2);
            numPl3 = pl3.number;
            System.out.println("Третий игрок думает, что это " + numPl3);

            if (numPl1 == targetNum) {
                p1IsRight = true;
            }
            if (numPl2 == targetNum) {
                p2IsRight = true;
            }
            if (numPl3 == targetNum) {
                p3IsRight = true;
            }
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("У нас есть победитель:");
                System.out.println("Превый игрок угадал? " + p1IsRight);
                System.out.println("Второй игрок угадал? " + p2IsRight);
                System.out.println("Третий игрок угадал? " + p3IsRight);
                System.out.println("Конец");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            }
        }

    }
}
