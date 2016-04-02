package org.akshay.javadatewrapper;

public interface DateWrapper {
    java.util.Date getDate();
    java.util.Date getDateBefore(int days);
    java.util.Date getDateAfter(int days);

}