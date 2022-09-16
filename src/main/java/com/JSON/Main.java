package com.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n = getvalues(s1);

        if(n==1){
            System.out.println("Valid date format");
        }else{
            System.out.println("Invalid date format");
        }

    }
    public static int getvalues(String s1) {
        if(s1.matches("[0-3][0-9][/][0-1][0-9][/][1-2][0-9][0-9][0-9]"))
        {
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                Date d1=sdf.parse(s1);
                return 1;
            } catch (ParseException e) {
                return -1;
            }
        }
        else
            return -1;
    }}




/*
import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class GeeksforGeeks {

    // Returns true if d is in format
    // /dd/mm/yyyy
    public static boolean isValidDate(String d)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)d);
        return matcher.matches();
    }

    public static void main(String args[])
    {
        System.out.println(isValidDate("10/12/2016"));
        System.out.println(isValidDate("10/02/18"));
    }
}*/
