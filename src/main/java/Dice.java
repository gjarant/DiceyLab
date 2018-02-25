import java.util.Random;

public class Dice {

    public int numberOfDice;

    public Dice(int numOfDice) {
        this.numberOfDice = numOfDice;
    }

    public Integer diceRoll() {

        int totalSumOfDice = 0;
        for (int i = 0; i < numberOfDice; i++) {
            totalSumOfDice += (int) Math.floor(Math.random() * 6) + 1;

        }
        return totalSumOfDice;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }
}