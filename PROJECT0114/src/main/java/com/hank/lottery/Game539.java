package com.hank.lottery;

import com.hank.Person;

import java.util.HashSet;
import java.util.Set;

public class Game539 extends NumberGame {// Game539 類別繼承自 NumberGame，表示 539 遊戲
        int numbercount=5;  //設定需要生成的數字個數為 5，覆蓋父類別的 numbercount

        @Override
        public void generate() {
                System.out.println(validate());

        }
}
