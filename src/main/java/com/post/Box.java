package com.post;

public class Box {
    String name;
    float length;
    float width;
    float height;

    public Box(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }
}
