package com.xiaodi.chapter2_3;

public class Main {

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
    }

    public static int test1(){
        int i = 5;
        return i++;
    }

    public static int test2(){
        int i = 5;
        return ++i;
    }
}
