package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;



public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int year=scn.nextInt();
        Calendar now= Calendar.getInstance();
        int year= now.get(Calendar.YEAR);
        int month=now.get(Calendar.MONTH)+1;
        int day=now.get(Calendar.DAY_OF_MONTH);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader(System.in) 接收標準輸入。
        //BufferedReade包裝 InputStreamReader，提供更高效的讀取方法。
        try {
            System.out.println("please enter year");
            String yearString=bufferedReader.readLine();
            year=(yearString.length()>0)?(Integer.parseInt(yearString)):year;//三元運算式
//            if (yearString.length()>0)
//            {
//                year=Integer.parseInt(yearString);
//            }
            System.out.println(year);
            String monthString= bufferedReader.readLine();
            month=(monthString.length()>0)?Integer.parseInt(monthString):month;//三元運算式
//            if (monthString.length()>0)
//            {
//                month=Integer.parseInt(monthString);
//            }
            System.out.println(month);
            String dayString=bufferedReader.readLine();
            day=(dayString.length()>0)?Integer.parseInt(dayString):day;
//            if (dayString.length()>0)
//            {
//                day=Integer.parseInt(dayString);
//            }
            System.out.println(day);
        } catch (IOException ioException) {
            ioException.printStackTrace();

        }
    }
}
