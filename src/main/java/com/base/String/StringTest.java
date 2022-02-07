package com.base.String;

public class StringTest {
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a==c);
        System.out.println(a.hashCode());
        System.out.println(d.hashCode());
    }
}
