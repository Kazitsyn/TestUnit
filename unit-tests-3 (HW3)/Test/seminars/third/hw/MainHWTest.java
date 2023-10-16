package seminars.third.hw;

import seminars.third.hw.MainHW;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainHWTest {
    @Test
    public void evenOddNumberTest(){
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(2));
        assertFalse(mainHW.evenOddNumber(5));
    }
    @Test
    public void numberInIntervalTest(){
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.numberInInterval(85));
        assertFalse(mainHW.numberInInterval(5));
    }

}
