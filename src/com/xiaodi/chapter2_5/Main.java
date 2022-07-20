package com.xiaodi.chapter2_5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try (
                FileInputStream fis = new FileInputStream("C:\\IdeaProjects\\java_xiaodi_mianshi_1\\src\\com\\xiaodi\\chapter2_5\\text.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("C:\\IdeaProjects\\java_xiaodi_mianshi_1\\src\\com\\xiaodi\\chapter2_5\\copy.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int size;
            byte[] buf = new byte[1024];
            while ((size = bis.read(buf))!=-1){
                bos.write(buf,0,size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            if (xx != null) {
//                xx.close
//            }
//        }
    }
}
