
import org.junit.Test;
import static org.junit.Assert.*;


public class baseClassTest {

    @Test
    public void gradeA1() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(90);
        assertEquals("pass", result);
    }
    @Test
    public void gradeA2() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(95);
        assertEquals("pass", result);
    }

    @Test
    public void gradeA3() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(100);
        assertEquals("pass", result);
    }

    @Test
    public void gradeB1() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(80);
        assertEquals("exl", result);
    }

    @Test
    public void gradeB2() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(85);
        assertEquals("exl", result);
    }

    @Test
    public void gradeB3() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(89);
        assertEquals("exl", result);
    }

    @Test
    public void gradeC1() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(70);
        assertEquals("vvg", result);
    }

    @Test
    public void gradeC2() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(75);
        assertEquals("vvg", result);
    }

    @Test
    public void gradeC3() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(79);
        assertEquals("vvg", result);
    }
    @Test
    public void gradeD1() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(60);
        assertEquals("vg", result);
    }

    @Test
    public void gradeD2() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(65);
        assertEquals("vg", result);
    }

    @Test
    public void gradeD3() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(69);
        assertEquals("vg", result);
    }

    @Test
    public void gradeF1() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(0);
        assertEquals("good", result);
    }

    @Test
    public void gradeF2() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(45);
        assertEquals("good", result);
    }

    @Test
    public void gradeF3() {
        baseClass g=new baseClass();
        String result = g.determineLetterGrade(59);
        assertEquals("good", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void gradeError() {
        baseClass g=new baseClass();
        g.determineLetterGrade(-1);
    }

}