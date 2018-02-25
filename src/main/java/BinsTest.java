import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class BinsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createStorageBinTest(){
        Dice dice = new Dice(3);
        Bins bins = new Bins(dice);
        // : Given

        // : When
        bins.createStorageBin();
        Integer actual= bins.countTotals.lastKey();
        Integer expected = 18;

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void storeCountInBinTest(){
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        // : Given
        // : When
        bins.storeCountInBin(dice, 100);
        int actualSumOfValues=0;
        for(int i=2;i<=12;i++){
            actualSumOfValues+=bins.countTotals.get(i);
        }
        int expected=100;

        // : Then
        Assert.assertEquals(expected, actualSumOfValues);
    }

}