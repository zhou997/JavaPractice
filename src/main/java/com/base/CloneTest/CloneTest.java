package com.base.CloneTest;

/**
 * <p>A clone is an exact copy of the original.
 * In java, it essentially means the ability to create an object with similar state as the original object.
 * The java clone() method provides this functionality.
 *
 * <p>By default, java cloning is ‘field by field copy’ i.e. as the Object class does not have idea about the structure of class on which clone() method will be invoked.
 * <p>
 * JVM when called for cloning, do following things:
 * <p>
 * If the class has only primitive data type members then a completely new copy of the object will be created and the reference to the new object copy will be returned.
 * <p>
 * If the class contains members of any class type then only the object references to those members are copied and hence the member references in both the original object as well as the cloned object refer to the same object.
 **/
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept = new Department(1, "Human Resource");
        Employee original = new Employee(1, "Admin", dept);
        //create a clone of original object
        Employee cloned = (Employee) original.clone();
        //Must be true and objects must have different memory addresses
        System.out.println(original != cloned);

        //getClass()必须相等
        System.out.println(original.getClass() == cloned.getClass());

        //Default equals method checks for references so it should be false. If we want to make it true,
        //then we need to override equals method in Employee class.
        System.out.println(original.equals(cloned));

        //we have two references to the same object.
        //默认浅克隆，不会克隆引用类型。通过深克隆和copy constructor解决
        //java克隆：基础类型克隆的是值，引用类型克隆的是引用。
        //string，integer是线程安全的不可变类，每一次赋值，指向的都是堆上的一个新的对象。
        //浅克隆是指拷贝对象时仅仅拷贝对象本身（包括对象中的基本变量），而不拷贝对象包含的引用指向的对象。
        //深克隆不仅拷贝对象本身，而且拷贝对象包含的引用指向的所有对象。
        cloned.getDepartment().setName("Finance");

        //cloned object changes are visible in original also.
        System.out.println(original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());
    }
}
