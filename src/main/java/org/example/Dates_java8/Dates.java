package org.example.Dates_java8;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) throws ParseException {
        String date1 = "29/10/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate localDate = LocalDate.parse(date1, formatter);
            LocalDate plusTenDays = localDate.plusDays(10);
            String formattedDate = plusTenDays.format(formatter);
            System.out.println(formattedDate);
        } catch (Exception e) {
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate date1 = LocalDate.parse(str1, formatter);
            LocalDate date2 = LocalDate.parse(str2, formatter);

            if (date1.isEqual(date2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void dateDifference() {
        String str1 = "29/10/2023";
        String str2 = "10/08/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate date1 = LocalDate.parse(str1, formatter);
            LocalDate date2 = LocalDate.parse(str2, formatter);

            Period period = Period.between(date2, date1);

            System.out.println("Difference in days: " + period.getDays());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void dateAnotherFormat() {
        String str1 = "29/10/2023";
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        try {
            LocalDate date1 = LocalDate.parse(str1, inputFormatter);
            String formattedDate = date1.format(outputFormatter);

            System.out.println("Formatted date: " + formattedDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void dateFormat() {
        String str1 = "29/10/2023";
        String str2 = "2023.10.29";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        try {
            LocalDate date1 = LocalDate.parse(str1, formatter1);
            LocalDate date2 = LocalDate.parse(str2, formatter2);

            if (date1.isEqual(date2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void addMonth() {
        String date1 = "29/10/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate originalDate = LocalDate.parse(date1, formatter);
            LocalDate convertedDate = originalDate.plusMonths(10);

            String formattedDate = convertedDate.format(formatter);

            System.out.println(formattedDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
