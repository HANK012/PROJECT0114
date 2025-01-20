package com.hank.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://data.fda.gov.tw/opendata/exportDataList.do?method=ExportData&InfoId=19&logType=5");
            //創建一個 URL 物件，指向指定的 API 網址
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
            //開啟一個到該 URL 的連線，並轉型為 HttpURLConnection。
            InputStream is= urlConnection.getInputStream();//呼叫 getInputStream() 獲取從服務器返回的數據流。
            BufferedReader in= new BufferedReader(new InputStreamReader(is));
            //將 InputStream 包裝成 InputStreamReader，再包裝成 BufferedReader，以逐行讀取資料。
            String line= in.readLine();//使用 readLine() 方法按行讀取內容。
            StringBuffer json=new StringBuffer();//json 是用來拼接所有讀取到的數據，形成完整的 JSON 字串。
            while(line!=null)
            {
                System.out.println(line);
                json.append(line);//使用 json.append(line) 拼接到 StringBuffer 尾部。
                line=in.readLine();//透過 json.toString() 將 StringBuffer 中拼接的完整數據轉為字串，並打印到控制台。
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
