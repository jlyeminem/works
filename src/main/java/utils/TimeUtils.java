package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static String dateToStamp(String str) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = simpleDateFormat.parse(str);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    public static String stampToDate(String str) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long lt = new Long(str);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}
