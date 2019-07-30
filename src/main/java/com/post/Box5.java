package com.post;

public class Box5 extends Box {
    public Box5(float length, float width, float height) {
        super(length, width, height);
    }

    @Override
    public boolean validate(float length, float width, float height) {
        boolean isValidate = super.validate(length, width, height);

        if (isValidate) {
            System.out.println("Box5");
        }

        return isValidate;
    }
}
