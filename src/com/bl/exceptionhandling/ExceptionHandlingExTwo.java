package com.bl.exceptionhandling;


public class ExceptionHandlingExTwo {

    public void age(int a) {
        if (a < 15) {
            throw new NullPointerException("Exception thrown successfully :");

        } else {
            System.out.println("Exception not thrown");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ExceptionHandlingExTwo ex = new ExceptionHandlingExTwo();
        ex.age(19);


    }

}

