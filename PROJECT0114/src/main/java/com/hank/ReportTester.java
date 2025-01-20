package com.hank;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] arge){
        Report Finance = new FinanceReport();// 創建 FinanceReport 物件
        Report Health=new HealthReport();// 創建 HealthReport 物件
        List<Report> reports=new ArrayList<>();// 創建 Report 清單
        reports.add(Finance); //將 FinanceReport 物件加入清單
        reports.add(Health);//將 HealthReport 物件加入清單
        for (Report report:reports)
        {
          report.load();//執行每個物件的 load 方法
          report.print();// 執行每個物件的 print 方法
            //Report 是一個介面。
            //FinanceReport 和 HealthReport 分別是實作 Report 介面的類別。
            //使用 List<Report> 存放不同的 Report 實例，並透過迴圈呼叫每個物件的方法
        }
    }

}
