
package com.hank.io;

import java.io.*;


public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br= new BufferedReader(new FileReader("data.txt"));
            String line=br.readLine();
            while (line!= null) // 檢查是否已讀到檔案結尾
            {
                System.out.println(line);// 輸出目前行的內容
                line= br.readLine();// 繼續讀取下一行
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //FileReader();
        //inputStream();
//        FileInputStream is = null; // 宣告 FileInputStream 物件，初始化為 null
//        try {
//            is = new FileInputStream(file); // 嘗試打開檔案，並將其指向 FileInputStream 物件
//            int n = is.read(); // 讀取檔案的第一個字元或位元組
//            System.out.println(n); // 印出讀取到的字元或位元組的 ASCII 值
//            System.out.println(is.read());
//            System.out.println(is.read());
//        } catch (FileNotFoundException e) { // 處理檔案未找到的例外
//            e.printStackTrace(); // 印出例外的堆疊追蹤資訊，方便除錯
//        } catch (IOException e) { // 處理其他輸入/輸出相關的例外
//            e.printStackTrace(); // 印出例外的堆疊追蹤資訊
      }


    }

//    private static void FileReader() {
//        try {
//            FileReader fr=new FileReader("data.txt");// 使用 FileReader 讀取檔案 "data.txt"
//            int n=fr.read();// 讀取檔案的第一個字元，回傳其 Unicode 值
//            while (n!=-1)//迴圈讀取檔案中的每一個字元，直到檔案結束 (n == -1)
//            {
//                System.out.print((char)n);
//                n=fr.read();
//
//            }
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        }
//        catch (IOException ioException)
//        {
//            ioException.printStackTrace();
//        }
//    }

//    private static void inputStream() {
//        File file = new File("data.txt"); // 創建 File 物件，指向檔案 "data.txt"
//        System.out.println(file.exists()); // 檢查檔案是否存在，回傳布林值
//        System.out.println(file.getAbsolutePath()); // 輸出檔案的絕對路徑，方便檢查檔案位置是否正確
//
//        try {
//            FileInputStream is = new FileInputStream(file);
//            int n= is.read();// 讀取檔案的第一個位元組
//            while (n!=-1)  // 使用 while 迴圈讀取檔案中的每一個字元，直到檔案結束 (n == -1)
//            {
//                System.out.print((char) n);  //char 轉型語法 (目標型態)資料
//                n= is.read();// 繼續讀取下一個位元組
//
//            }
//            System.out.println();
//            System.out.println("File open success");
//        }catch (FileNotFoundException exception)
//
//        {
//            exception.printStackTrace();
//        }
//        catch (IOException ioException)
//        {
//            ioException.printStackTrace();
//        }
//    }
//}


//        try {
//
//            System.out.println(n);
//        }
//         catch (FileNotFoundException exception)// 處理檔案操作時可能出現的例外，例如檔案不存在或無法讀取
//        {
//            exception.printStackTrace();// 打印例外的堆疊追蹤資訊，方便除錯
//            //exception.getMessage();//精簡化資訊：相比於 e.printStackTrace()，只會返回一條簡單的文字描述。可以記錄錯誤而不輸出完整的堆疊追蹤資訊。
//            System.out.println("file isn't exist");
//        }
//        catch
//        (IOException E)
//        {
//            E.getMessage();
//        }




//               input           output
//    byte     InputStream    OutputStream
//    char       Reader          Writer