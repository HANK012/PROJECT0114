package com.hank.Many;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        list();
//        set();
//        map(); 鍵集、值集和鍵值集 不重複資料
        HashMap<String,String> stock=new HashMap<>();
        stock.put("2330","TSMC");
        stock.put("0050","etf");
        System.out.println(stock);
        for (String k :stock.keySet())  // keyset呼叫stock得到所有鍵值(key的集合)
        {
            System.out.println(stock.get(k));  //使用get方法得到value值

        }
    }

    private static void set() {
        //set:沒有重複資料集合
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        set.add(3);
        set.add(5);
        set.add(9);
        System.out.println(set);
        for (int n:set)
        {
            System.out.println(n);
        }
    }
    private static void list() {
        ArrayList list=new ArrayList();//集合:liST,Set,Map,<> diamond symbol=Generics=> <Integer,String>
//        List特性:順序,可重複,索引值
        list.add(5);
        list.add(2);
        list.add(6);
        list.add("Heterogeniety");//異質資料
        String s=(String)list.get(3);
        System.out.println(s);
        int n1=(int)list.get(2);
        System.out.println(n1);
        System.out.println(list.size());//元素個數
        List<Integer> scores=Arrays.asList(10,20,30,40);
        for (int score:scores)//scores 中逐一提取每個元素並賦值給變數 score
        {
            System.out.println(score);
        }
        int [] numbers=new int[5];//儲存5個int值
        numbers[0]=5;//索引值
        numbers[1]=4;
        numbers[2]=3;
        numbers[3]=1;
        System.out.println(numbers[2]);
        int[] score={10,20,30,40,50};//陣列的初始值
        for (int i=0;i<5;i++)
        {
            System.out.println(score[i]);
        }
        for(int n:score)
        {System.out.println(n);}
    }
}
