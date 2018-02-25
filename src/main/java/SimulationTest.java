import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void simulationTest(){

        Simulation simulation = new Simulation();
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);

        // : Given
        bins.storeCountInBin(dice, 1000000);
        // : When

        String returnedString= simulation.simulation(bins, 1000000);
        String actual= returnedString.substring(returnedString.length()-2, returnedString.length());
        String expected="**";
        System.out.println(simulation.simulation(bins, 1000000));

        //: Then
        Assert.assertEquals(expected, actual);
    }


}