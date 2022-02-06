package com.base.ReferenceTest;


public class ReferenceTest {
    public static void main(String[] args) {
        //直接赋值给另一个对象
        ReferenceTestEntity test = new ReferenceTestEntity("red", 123);
        ReferenceTestEntity test2 = test;
        test2.setColor("pink");
        test2.setNumber(1);
        //地址引用，原对象被修改
        System.out.println("test: " + test);
        System.out.println("test2: " + test2);
    }
}
