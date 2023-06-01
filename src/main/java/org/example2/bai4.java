package org.example2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class bai4 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        LocalDate str2 = LocalDate.now();
        double year2 = str2.getYear();
        Date date = null;
        try {
            date = day.parse(str);
        } catch (Exception e) {
        };
        String year1 = year.format(date);


    }
}

