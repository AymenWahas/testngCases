
import org.junit.Test;
import static org.junit.Assert.*;


public class graderClassTest {

    @Test
    public void gradeA1() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(90);
        assertEquals('A', result);
    }

    @Test
    public void gradeA2() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(95);
        assertEquals('A', result);
    }

    @Test
    public void gradeA3() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(100);
        assertEquals('A', result);
    }

    @Test
    public void gradeB1() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(80);
        assertEquals('B', result);
    }

    @Test
    public void gradeB2() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(85);
        assertEquals('B', result);
    }

    @Test
    public void gradeB3() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(89);
        assertEquals('B', result);
    }

    @Test
    public void gradeC1() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(70);
        assertEquals('C', result);
    }

    @Test
    public void gradeC2() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(75);
        assertEquals('C', result);
    }

    @Test
    public void gradeC3() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(79);
        assertEquals('C', result);
    }
    @Test
    public void gradeD1() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(60);
        assertEquals('D', result);
    }

    @Test
    public void gradeD2() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(65);
        assertEquals('D', result);
    }

    @Test
    public void gradeD3() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(69);
        assertEquals('D', result);
    }

    @Test
    public void gradeF1() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(0);
        assertEquals('F', result);
    }

    @Test
    public void gradeF2() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(45);
        assertEquals('F', result);
    }

    @Test
    public void gradeF3() {
        graderClass g=new graderClass();
        char result = g.determineLetterGrade(59);
        assertEquals('F', result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void gradeError() {
        graderClass g=new graderClass();
        g.determineLetterGrade(-1);
    }

}