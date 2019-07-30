package com.post;

public class Box3 extends Box {
    public Box3(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate(float length, float width, float height) {
        boolean isValidate = super.validate(length, width, height);

        if (isValidate) {
            System.out.println("Box3");
        }

        return isValidate;
    }
}
