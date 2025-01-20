package com.hank.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
    File jkdir=new File("C:\\jk");
    jkdir.mkdir();
    FileWriter fw=new FileWriter("C:\\jk\\output.txt");
    fw.write("abc");
    fw.flush();
    fw.close();






    }



}
