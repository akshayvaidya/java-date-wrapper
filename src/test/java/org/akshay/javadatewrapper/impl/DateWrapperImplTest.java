package org.akshay.javadatewrapper.impl;

import org.akshay.javadatewrapper.DateWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
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
        java.util.Date testDate = date.getDate();

        assertTrue("Today is today", testDate.equals(new Date()));

    }

}
