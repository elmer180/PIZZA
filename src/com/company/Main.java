package com.company;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float totalPrice =(0);
        try {
            System.out.println("welcome to Ronnie's pizza palace what size pizza would you like:small medium or large");
            String pSize = input.next();
            if (pSize.equalsIgnoreCase("small")) {
                totalPrice= (float) (totalPrice+7.99);
            }if (pSize.equalsIgnoreCase("medium")) {
                totalPrice= (float) (totalPrice+10.99);
            }if (pSize.equalsIgnoreCase("large")) {
                totalPrice= (float) (totalPrice+13.99);
            }ArrayList<Integer> topping = new ArrayList<>();
            boolean addToppings = true;
            System.out.println("what topping do you want? we offer peperroni");
            while (addToppings){

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
