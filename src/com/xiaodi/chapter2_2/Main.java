package com.xiaodi.chapter2_2;

public class Main {

    public static void main(String[] args) {
//        swap(31,40);
        swap2(31,40);
    }

    public static void swap(int a, int b) {
        System.out.printf("a=%d,b=%d",a,b);
        a = a + b;
        b = a - b; // b = a+b-b 原来的a
        a = a - b; // a = a- 原来的a 剩下原来的b
        System.out.printf("\na=%d,b=%d",a,b);
    }
    //抑或运算
    public static void swap2(int a, int b) {
        System.out.printf("a=%d,b=%d",a,b);
        a = a^b; // a1 = a^b
        b = b^a; // b = b^a^b
        a = a^b; // a = a1^b = a^b^a
        System.out.printf("\na=%d,b=%d",a,b);
    }
}
