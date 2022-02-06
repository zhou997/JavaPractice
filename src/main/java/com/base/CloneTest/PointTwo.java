package com.base.CloneTest;

public class PointTwo extends PointOne {
    private Integer z;
    //In child class, you need to copy child specific attributes and
    // pass the argument to the super class’s constructor.

    public PointTwo(Integer x, Integer y, Integer z) {
        super(x, y);
        this.z = z;
    }

    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }
}
