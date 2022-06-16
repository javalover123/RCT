package org.nesc.ecbd.service;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class SlowlogCollectorScheduleTest {

    @Test
    public void formatTimestamp() {
        long timestamp = 1643137202000L;
        Date date = new Date(timestamp);
        System.out.println(timestamp + "," + date);
        Assert.assertEquals("日期错了," + timestamp, 26, date.getDate());
        Assert.assertEquals("小时错了," + timestamp, 3, date.getHours());
    }

}