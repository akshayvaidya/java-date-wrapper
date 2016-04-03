package org.akshay.javadatewrapper.impl;

import org.akshay.javadatewrapper.DateWrapper;

import java.time.LocalDate;
import java.time.ZoneId;

import static java.util.Date.from;

/**
 * Created by akshay on 27/03/16.
 */
public class DateWrapperImpl implements DateWrapper {


    private java.util.Date date;

    public static final DateWrapper DATE = new DateWrapperImpl();


    /**
     *  This method will just render a {@link java.util.Date} object
     *  similar to doing a " new Date() "
     * @return {@link java.util.Date} object
     */
    public java.util.Date getDate() {

        date = from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }

    /**
     *
     * @param days number of days before today
     * @return {@link java.util.Date} object with number of days before today
     */
    public java.util.Date getDateBefore(int days) {
        date = from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).minusDays(days).toInstant());
        return date;
    }

    /**
     *
     * @param days number of days after today
     * @return {@link java.util.Date} object with number of days after today
     */
    public java.util.Date getDateAfter(int days) {
        date = from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).plusDays(days).toInstant());
        return date;
    }

}
