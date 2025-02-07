package Model;

import java.util.Date;
import java.text.*;

public class TimeHandler {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static Date date = new Date();

    public static String getStartDate() {
        return dateFormat.format(date);
    }

}