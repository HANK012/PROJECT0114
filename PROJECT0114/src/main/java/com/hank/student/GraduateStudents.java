package com.hank.student;

public class GraduateStudents extends Student{//GraduateStudents類別是Student類別的子類別
    static int pass;
    int thesis;
    public GraduateStudents(String name,int english,int math,int thesis){
        super(name,english,math);// 調用父類別建構子
        this.thesis=thesis;//初始化 thesis 屬性，從建構子的參數中賦值


    }

    @Override
    public void println() {
        int average= getaverage();// 調用 getaverage() 方法計算平均分數
        float avg = (english + math) / 2.0f;  // 計算平均分數（以 float 型別）
        System.out.println(name + "\t" + english + "\t" + math + "\t"+thesis+"\t" +getaverage()+"\t"+((average>=pass)?"PASS":"FAILD"));
        // 輸出學生資訊（姓名、英數成績、平均分數、及格狀態）
        char grading='F'; // 預設成績等級為 'F'

        switch (average/10){
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';
        }
        System.out.println("\t"+grading);
    }
}
