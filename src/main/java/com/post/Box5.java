package com.post;

public class Box5 implements Box {
    float length;
    float width;
    float height;

    public Box5(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean validate(float length, float width, float height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            System.out.println("Box5");

            return true;
        } else {
            return false;
        }
    }
}
