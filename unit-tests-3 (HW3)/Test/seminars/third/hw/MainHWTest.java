package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainHWTest {
    private MainHW mainHW = new MainHW();
    // Простая проверка метода evenOddNumber
    @Test
    @DisplayName("Простая проверка метода evenOddNumber")
    public void evenOddNumberTest(){

        assertTrue(this.mainHW.evenOddNumber(2));
        assertFalse(this.mainHW.evenOddNumber(5));
    }
    // Расширеная проверка метода evenOddNumber
    @ParameterizedTest
    @DisplayName("Расширеная проверка метода evenOddNumber")
    @CsvSource({
            "2, true",
            "4, true",
            "6, true",
            "8, true",
            "10, true",
            "1, false",
            "3, false",
            "5, false",
            "7, false",
            "9, false"
    })
    public void testEvenOddNumber(int number, boolean expected) {
        assertEquals(expected, mainHW.evenOddNumber(number));
    }
    // простая проверка метода numberInInterval
    @Test
    @DisplayName("Простая проверка метода numberInInterval")
    public void numberInIntervalTest(){
        assertTrue(mainHW.numberInInterval(85));
        assertFalse(mainHW.numberInInterval(5));
    }
    // Расширеная проверка метода numberInInterval
    @ParameterizedTest
    @DisplayName("Расширеная проверка метода numberInInterval")
    @CsvSource({
            "10, false",
            "25, true",
            "50, true",
            "75, true",
            "99, true",
            "-1, false",
            "0, false",
            "26, true",
            "100, true",
            "101, false"
    })
    public void testNumberInInterval(int number, boolean expected) {
        assertEquals(expected, mainHW.numberInInterval(number));
    }
}
