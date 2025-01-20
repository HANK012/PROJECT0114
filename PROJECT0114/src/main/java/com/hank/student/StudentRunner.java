package com.hank.student;
import java.util.Scanner;
public class StudentRunner {
    public static void main(String[] args) {
        //void回傳值 main方法名稱  static獨立於StudentRunner 不須 new出物件即可使用的方法

        userinput();
        Student stu=new Student("HANK",60,77);
        Student stu2=new Student("JACK",30,20);
        Student stu3=new Student("ULTA",22,21);
        GraduateStudents gstu=new GraduateStudents("jack",60,60,40);
        Student.pass=15;
        gstu.println();
        stu.println();//物件 stu呼叫 println() 執行 println() 方法
        stu2.println();
        stu3.println();
        System.out.print("highest score is "+stu.highest()); }
    private static void userinput() {
//        Scanner scn=new Scanner(System.in);
//        System.out.println("please enter student's name:");
//        String name=scn.next();
//        System.out.println("please enter student's english score:");
//        int english  =scn.nextInt();
//        System.out.println("please enter student's math score:");
//        int math=scn.nextInt();
//        Student stu=new Student(name,english,math);
//        System.out.println("highest score is "+stu.highest());
    }


}
