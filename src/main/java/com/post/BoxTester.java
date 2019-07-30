package com.post;

import java.util.ArrayList;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box box3 = new Box3(23, 14, 13);
        Box box5 = new Box5(39.5f, 27.5f, 23);

        ArrayList<Box> list = new ArrayList<>();
        list.add(box3);
        list.add(box5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length : ");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width : ");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height : ");
        float height = scanner.nextFloat();

        boolean isMatchBox = false;

        for (Box box : list) {
            if  (box.validate(length, width, height)) {
                isMatchBox = true;

                break;
            }
        }

        if (isMatchBox == false) System.out.println("No suitable mailbox for you");
    }
}
