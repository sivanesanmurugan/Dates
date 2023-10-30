package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String date1="29/10/2023";
        try {
            Date set = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            Calendar cal=Calendar.getInstance();
            cal.setTime(set);
            cal.add(Calendar.DATE,10);
            Date converted_Date=cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = sdf.format(converted_Date);
            System.out.println(formattedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        dateString();
        dateDifference();
        dateAnotherFormat();
        dateFormat();
        addMonth();
    }
    public static void dateString() {
        String str1 = "29/10/2023";
        String str2 = "29/10/2023";
        try {
            SimpleDateFormat set = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = set.parse(str1);
            Date date2 = set.parse(str2);
            if (date1.equals(date2)) {
                System.out.println("ture");
            } else {
                System.out.println("false");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dateDifference() {
        String str1 = "29/10/2023";
        String str2 = "10/8/2023";
        try {
            SimpleDateFormat set = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = set.parse(str1);
            Date date2 = set.parse(str2);

            long diffInMilliseconds = date1.getTime() - date2.getTime();
            long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);

            System.out.println("Difference in days: " + diffInDays);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dateAnotherFormat() {
        String str1 = "29/10/2023";
        try {
            SimpleDateFormat set = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat set1 = new SimpleDateFormat("yyyy.MM.dd");

            Date date1 = set.parse(str1);
            String formattedDate = set1.format(date1);

            System.out.println("Formatted date: " + formattedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dateFormat() {
        String str1 = "29/10/2023";
        String str2 = "2023.10.29";
        try {
            SimpleDateFormat set1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat set2 = new SimpleDateFormat("yyyy.MM.dd");
            Date date1 = set1.parse(str1);
            Date date2 = set2.parse(str2);
            if (date1.equals(date2)) {
                System.out.println("ture");
            } else {
                System.out.println("false");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addMonth() {
        String date1 = "29/10/2023";
        try {
            Date originalDate = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            Calendar cal = Calendar.getInstance();
            cal.setTime(originalDate);
            cal.add(Calendar.MONTH, 10);
            Date convertedDate = cal.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = sdf.format(convertedDate);

            System.out.println(formattedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}

