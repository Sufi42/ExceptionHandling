package com.bl.exceptionhandling;


import java.util.Scanner;

class AgeIsLess extends Exception {
        public AgeIsLess(String str) {
            super(str);
        }
    }

    public class ExOne {

        public static void voting() throws AgeIsLess {
            int age;
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

            if (age < 18) {
                throw new AgeIsLess("Age is less");

            } else {
                System.out.println("Age is valid ");
            }

        }

        public static void main(String[] args) {
            try {
                voting();
            } catch (AgeIsLess e) {
                System.out.println(e);
            }

        }
    }
