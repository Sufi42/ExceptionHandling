package com.bl.exceptionhandling;


import java.util.Scanner;

class NoIsLess extends Exception {
        public NoIsLess(String str) {
            super(str);
        }

    }

    class NoIsBig extends Exception {
        public NoIsBig(String str) {
            super(str);
        }
    }

    public class CustomExceptions {
        public static void main(String[] args) throws NoIsLess, NoIsBig {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first integer");
            int a = sc.nextInt();
            System.out.println("Enter second integer");
            int b = sc.nextInt();

            if (a < b) {
                throw new NoIsLess("A is less than B");
            } else {
                throw new NoIsBig("A is greater than B");
            }

        }

    }