package com.base.CloneTest;

import lombok.Data;

/**
 * if a class needs to support cloning it has to do following things:
 *
 * You must implement Cloneable interface.
 * You must override clone() method from Object class.
 */
public class Employee implements Cloneable {
    private int empoyeeId;
    private String employeeName;
    private Department department;

    public Employee(int empoyeeId, String employeeName, Department department) {
        this.empoyeeId = empoyeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
    //默认浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
