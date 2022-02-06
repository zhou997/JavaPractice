package com.base.CloneTest;

/**
 * Copy constructors are special constructors in a class which takes argument for its own class type. So, when you pass an instance of class to copy constructor, then constructor will return a new instance of class with values copied from argument instance. It helps you to clone object with Cloneable interface.
 */
public class CopyConstructorTest {
    public static void main(String[] args) {
        //if some class passed the instance of PointTwo in constructor of PointOne.
        //
        //In this case, you will get the instance of PointOne in return where you passed instance of PointTwo as argument.
        PointOne one = new PointOne(1,2);
        PointTwo two = new PointTwo(1,2,3);

        PointOne clone1 = new PointOne(one);
        PointOne clone2 = new PointOne(two);

        //Let check for class types
        System.out.println(clone1.getClass());
        System.out.println(clone2.getClass());
    }
}
