
import org.junit.Test;
import static org.junit.Assert.*;

public class trainClassTest {

    @Test
    public void timeBefore9o30Am() {
        trainClass t=new trainClass();
        String result = t.getTicketType("09:29 Am");
        assertEquals("Full", result);
    }

    @Test
    public void timeBefore9o30Am2() {
        trainClass t=new trainClass();
        String result = t.getTicketType("01:40 Am");
        assertEquals("Full", result);
    }

    @Test
    public void timeBet9o30AmAnd4o00Pm1() {
        trainClass t=new trainClass();
        String result = t.getTicketType("09:30 Am");
        assertEquals("Sever", result);
    }

    @Test
    public void timeBet9o30AmAnd4o00Pm2() {
        trainClass t=new trainClass();
        String result = t.getTicketType("01:20 Pm");
        assertEquals("Sever", result);
    }

    @Test
    public void timeBet9o30AmAnd4o00Pm3() {
        trainClass t=new trainClass();
        String result = t.getTicketType("04:00 Pm");
        assertEquals("Sever", result);
    }

    @Test
    public void timeAfter04o00AndBefor07o30Pm1() {
        trainClass t=new trainClass();
        String result = t.getTicketType("04:01 Pm");
        assertEquals("Full", result);
    }

    @Test
    public void timeAfter04o00AndBefor07o30Pm2() {
        trainClass t=new trainClass();
        String result = t.getTicketType("05:20 Pm");
        assertEquals("Full", result);
    }

    @Test
    public void timeAfter04o00AndBefor07o30Pm3() {
        trainClass t=new trainClass();
        String result = t.getTicketType("07:30 Pm");
        assertEquals("Full", result);
    }
    @Test
    public void timeAfter07o30Pm1() {
        trainClass t=new trainClass();
        String result = t.getTicketType("07:31 Pm");
        assertEquals("Sever", result);
    }

    @Test
    public void timeAfter07o30Pm2() {
        trainClass t=new trainClass();
        String result = t.getTicketType("11:40 Pm");
        assertEquals("Sever", result);
    }

}