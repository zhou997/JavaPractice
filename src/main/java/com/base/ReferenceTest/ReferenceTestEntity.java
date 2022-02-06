package com.base.ReferenceTest;

import lombok.Data;

@Data
public class ReferenceTestEntity {
    String color;
    int number;

    public ReferenceTestEntity(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "TestEntity{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}'+s;
    }
}
