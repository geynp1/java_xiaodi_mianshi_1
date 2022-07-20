package com.xiaodi.chapter2_6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //找出目录下的所有子目录以及子文件并打印到控制台上
        List<String> paths = new ArrayList<>();

        getAllFilePaths(new File("C:\\IdeaProjects\\java_xiaodi_mianshi_1"),paths);

        for(String path: paths){
            System.out.println(path);
        }
    }

    private static void getAllFilePaths(File filePath, List<String> paths) {
        File[] files = filePath.listFiles();
        if(files == null){
            return;
        }
        for(File f : files){
            if(f.isDirectory()){
                paths.add(f.getPath());
                getAllFilePaths(f,paths);
            }else{
                paths.add(f.getPath());
            }
        }
    }


}
