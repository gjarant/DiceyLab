import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void diceRoll() {
        Dice dice = new Dice(2);
        // : Given


        // : When
        Boolean actual = (2 <= dice.diceRoll() && dice.diceRoll() <= 12);
        Boolean expected = (2 <= dice.diceRoll() && dice.diceRoll() <= 12);

        // : Then
        Assert.assertEquals(expected, actual);
    }
    }
