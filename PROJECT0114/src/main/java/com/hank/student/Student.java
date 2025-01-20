package com.hank.student;

//    public  存取修飾字+類別or建構子or屬性 可見範圍最大
//    protected=private+子類別(沒有寫=預設)
//    private 可見範圍最小 僅在當前類別





public class Student {
    String name;
    int english;
    int math;
    static int pass=60;//類別層級屬性 static
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    //    public  int highest(){
//    int max=(english>math)?english:math;
//    return max;
//    }
public  int highest(){
    return (english>math)?english:math;
}
        // 使用 if-else 找 出最高分
    //    public int highest() {
//        int max;
//        if (english > math) {     //敘述式 statement(等號左邊)
//            max = english;         //運算式 EXPRESSION(等號右邊)
//        } else {
//            max = math;
//        }
//        return max;
//    }
    // 印出學生資訊和平均分數
        public void println() {
            int average= getaverage();// 調用 getaverage() 方法計算平均分數
            float avg = (english + math) / 2.0f;  // 計算平均分數（以 float 型別）
            System.out.println(name + "\t" + english + "\t" + math + "\t" +getaverage()+"\t"+((average>=pass)?"PASS":"FAILD"));
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
        //         巢狀結構
//        char grading='F';
//        if (average>=90&& average<=100)
//        { grading='A'; }
//        else if (average>=80&& average<=89)
//        { grading='B'; }
//        else if (average>=70&& average<=79)
//        { grading='C'; }
//        else if (average>=60&& average<=69)
//        { grading='D'; }
//        else if  (average<60)
//        { grading='E'; }
//         System.out.println(grading);

//        if (getaverage()>=60)
//        {System.out.println("\tPASS");}
//        else
//        { System.out.println("\tFaild");  }

    }
    public int getaverage()
    {
        return (math+english)/2;
    }




}









