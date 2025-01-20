package com.hank;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class McDonalds {
    Map<String, Item> menu = new HashMap<>();
    public McDonalds(){
        File file = new File("mcdonalds.txt");

        try (BufferedReader in = new BufferedReader(new FileReader(file)))
        {
            String line = in.readLine(); // 讀取檔案的第一行，將結果存入變數 line
            while (line != null) {
                String[] tokens = line.split(",");// 使用逗號 (",") 分割當前行，將結果存入 tokens 陣列
                // 建立一個 Item 物件，並使用 tokens 中的值進行初始化
                Item item = new Item(
                        tokens[0],                    // 第 1 個欄位：物件名稱
                        tokens[1],                    // 第 2 個欄位：物件描述
                        Integer.parseInt(tokens[2]),  // 第 3 個欄位：轉換為整數
                        Integer.parseInt(tokens[3]));

                menu.put(item.id, item);// 將物件存入 menu，id 作為鍵，Item 作為值
                // 讀取下一行，進行下一次迴圈
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取menu失敗");
        }
    }
    public void printmenu()
    {
        for (Map.Entry<String, Item> ItemEntry : menu.entrySet())
        {
            System.out.println(ItemEntry.getValue());
        }
    }
    public static void main(String[] args) {
    McDonalds mcDonalds=new McDonalds();
    mcDonalds.printmenu();
        Scanner order=new Scanner(System.in);
        System.out.println("order");
        
    }
}
class Item {
    String id;       // 商品 ID
    String name;     // 商品名稱
    int calorie;     // 商品卡路里
    int price;       // 商品價格

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+calorie+"\t"+price;  }

    // 建構函數
    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCalorie() {
        return calorie;
    }
    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
