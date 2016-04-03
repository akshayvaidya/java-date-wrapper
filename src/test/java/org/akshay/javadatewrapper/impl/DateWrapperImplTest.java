package org.akshay.javadatewrapper.impl;

import org.akshay.javadatewrapper.DateWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * Created by akshay on 02/04/16.
 */
public class DateWrapperImplTest {


    private DateWrapper date;

    @Before
    public void setUp() {
        date = new DateWrapperImpl();
    }

    @Test
    public void testGetDate() {
        Date testDate = date.getDate();

        Calendar.getInstance().setTime(testDate);
        assertTrue("Today is today", new Date().equals(testDate));

    }

    @Test
    public void testGetDateBefore() {
        Date testDate = date.getDateBefore(2);

        assertTrue("Two days before", new Date().after(testDate));
    }

    @Test
    public void testGetDateAfter() {
        Date testDate = date.getDateAfter(2);

        assertTrue("Two days after", new Date().before(testDate));
    }

}
