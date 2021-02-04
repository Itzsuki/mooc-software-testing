package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNumeral roman2;

    @BeforeEach
    public void initialize(){
        this.roman2 = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MMMMCDLVI");
        Assertions.assertEquals(4456, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    //Adding the @BeforeEach to not have to initialize roman for each test.
    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman2.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    ///My tests
    @Test
    public void noValidEntry() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman2.convert("MMXXC");
        Assertions.assertEquals(0, result);
    }
    @Test
    public void noValidEntry2() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman2.convert("CCVX");
        Assertions.assertEquals(0, result);
    }
}
