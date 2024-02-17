import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
public class date {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calender.DATE));

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
