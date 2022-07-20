package com.xiaodi.chapter2_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("test1():"+test1());
        System.out.println("test2():"+test2());
    }
    public static int test1() {
        int a = 1;
        try {
            System.out.println(a / 0);
            a = 2;
        } catch (ArithmeticException e) {
            a = 3;
            return a;  // 确定了返回值是3，再执行finally，虽然finally里面a=4,但是前面已经确定是3了，所以返回3
        } finally {
            a = 4;
        }
        return a;
    }
    public static int test2() {
        int a = 1;
        try {
            System.out.println(a / 0);
            a = 2;
        } catch (ArithmeticException e) {
            a = 3;
            return a;
        } finally {
            a = 4;  //catch确定了返回值是3，再执行finally，finally里面a=4.但是有新的return，重新确定了返回值，所以是4
            return a;
        }
    }
}
