package utils;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TimeUtilsTest {
    @Test
    public void shouldDateToStamp() throws Exception {
        String time= "2016/09/02 22:30:46";

        assertThat(TimeUtils.dateToStamp(time),is("1472826646000"));
    }

    @Test
    public void shouldStampToDate() throws Exception {
        String time= "1472826646000";

        assertThat(TimeUtils.stampToDate(time),is("2016/09/02 22:30:46"));

    }

}