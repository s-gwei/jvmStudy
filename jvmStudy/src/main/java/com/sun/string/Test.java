package com.sun.string;

public class Test {
    public static void main(String[] args) {
//        test1();
        test2();
    }
    public static void test1(){    
        String a = "abc";//字面量,存储在常量池中
        String b = "abc";//
//        a = "hello";
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void test2(){
        String a = new String("abc");//字面量,存储在常量池中
        String b = new String("abc");//
//        a = "hello";
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }
}
