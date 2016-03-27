package org.akshay.javadatewrapper.impl;

import org.akshay.javadatewrapper.Date;

import java.time.LocalDate;
import java.time.ZoneId;

import static java.util.Date.from;

/**
 * Created by akshay on 27/03/16.
 */
public class DateFactory {

    public static final Date DATE = new DateImpl();


    private static class DateImpl implements Date {

        private java.util.Date date;
        
        DateImpl() {
            date = new java.util.Date();
        }
        public void setDate(java.util.Date date) {
            this.date = date;
        }

        public java.util.Date getDate() {
            return date;
        }

        public java.util.Date getDateBefore(int days) {
            date = from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
            return date;
        }

        public java.util.Date getDateAfter(int days) {
            return null;
        }


        public static Date getDATE() {
            return DATE;
        }
    }
}
