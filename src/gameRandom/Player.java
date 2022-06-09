package gameRandom;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 100);
        System.out.printf("I think, num is %d\n", number);
    }
}
