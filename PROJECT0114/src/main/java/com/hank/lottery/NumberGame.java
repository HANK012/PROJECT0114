    package com.hank.lottery;

    import java.util.HashSet;
    import java.util.Set;

    public abstract class NumberGame {// 定義抽象類別
        Set<Integer> numbers=new HashSet<>(); //使用 HashSet 存放隨機生成的數字，避免重複
        int numbercount=0; //   預設需要生成的數字個數為 0
        public abstract void generate();// 抽象方法，子類別需要實現具體的生成邏輯
        public boolean validate() // 驗證生成的數字集合是否符合需求
        {
        if (numbers.size()==numbercount) // 透過 numbers.size() 取得目前集合中的數字個數。
        {        return true;        }
        else
        {       return  false;        }
        }


}
