package com.bl.exceptionhandling;

import java.util.Scanner;


    interface Calcuate {
        public void calculate() throws ArithmeticException;

    }

    public class ExceotionHandlingExOne {

        public static void main(String[] args) {
            boolean flag = true;
            while (flag) {


                try {
                    Calcuate c = () -> {
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter a");
                            int a = sc.nextInt();
                            System.out.println("Enter b");
                            int b = sc.nextInt();
                            double division = a / b;
                            System.out.println(division);
                        }
                    };
                    c.calculate();
                } catch (Exception e) {
                    System.out.println(e);

                }

                char ch;
                System.out.println("If you wish to continue press y ");
                Scanner sc = new Scanner(System.in);
                ch = sc.next().charAt(0);

                if (ch == 'y' || ch == 'Y') {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
}
