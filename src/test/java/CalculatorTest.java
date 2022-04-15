import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-10;
    Calculator calculator = new Calculator();

    @Test
    public void factorial1(){
        assertEquals("Factorial Positive", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void factorial2(){
        assertNotEquals("Factorial False Positive", 120, calculator.fact(6), DELTA);
    }

    @Test
    public void power1(){
        assertEquals("Finding power", 8, calculator.getPower(2, 3), DELTA);
    }

    @Test
    public void power2(){
        assertNotEquals("Finding power", 6, calculator.getPower(2, 2), DELTA);
    }

    @Test
    public void log1(){
        assertEquals("Finding natural log", 0, calculator.getNaturalLog(1), DELTA);
    }

    @Test
    public void log2(){
        assertNotEquals("Finding natural log false", 6, calculator.getNaturalLog(2.4), DELTA);
    }

    @Test
    public void sqroot1(){
        assertEquals("Finding square root true", 2, calculator.getSquareRoot(4), DELTA);
    }

    @Test
    public void sqroot2(){
        assertNotEquals("Finding square root false", 1, calculator.getSquareRoot(3), DELTA);

    }


}