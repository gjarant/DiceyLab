
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Bins {

    public TreeMap<Integer, Integer> countTotals = new TreeMap<Integer, Integer>();
    int numOfDice;
    int numOfKeys;

    public Bins(Dice dice){
        this.numOfDice=dice.getNumberOfDice();
        this.numOfKeys=dice.getNumberOfDice()*6;

    }

    public void createStorageBin(){
        //Integer numberOfKeysNeeded = (dice.getNumberOfDice() * 6);

        for(int i = 2; i <= getNumOfKeys(); i++) {
            countTotals.put(i, 0);
        }
    }

    public void storeCountInBin(Dice dice, Integer numberOfRolls){
        createStorageBin();
        for(int i = 0; i < numberOfRolls; i++){
            int key = dice.diceRoll();
            int value = countTotals.get(key);
            value += 1;
            countTotals.put(key, value);
        }
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
