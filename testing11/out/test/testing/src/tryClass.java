import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class tryClass {

    SimpleDateFormat format = new SimpleDateFormat("hh:mm a", Locale.US);
    String getTicketType(String time) {


        try {
            if (format.parse(time).before(format.parse("9:30 Am")))
                return "Full";

            else if (format.parse(time).after(format.parse("4:29 Am"))&& format.parse(time).before(format.parse("4:01 Pm")))
                return "Sever";

            else if (format.parse(time).after(format.parse("4:00 Am"))&& format.parse(time).before(format.parse("7:31 Pm")))
                return "Full";

            else if (format.parse(time).after(format.parse("7:30 Am")))
             return "Sever";

        } catch (ParseException e)
        {
            e.printStackTrace();
        }

                        return "  ";
    }


}
