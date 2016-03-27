package org.akshay.javadatewrapper;

public interface Date {
    void setDate(java.util.Date date);
    java.util.Date getDate();
    java.util.Date getDateBefore(int days);
    java.util.Date getDateAfter(int days);

}