package com.loop.test;

import java.util.Scanner;

public class ForWhile {

    private Scanner scanner = new Scanner(System.in);


    public void printStar1() {

        System.out.print("���� �ϳ� �Է� : ");
        int a = scanner.nextInt();
        if (a < 1) {
            System.out.println("����� �ƴմϴ�.");
        }else {
            for (int i = 1; i < a+1; i++) {
                for (int j = i - 1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println(i);
            }
        }
    }

    public void printStar2() {
        System.out.print("���� �ϳ� �Է� : ");
        int a = scanner.nextInt();
        if (a < 0) {
            for (int i = 1; i < -a+1; i++) {
                for (int j = i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j < -a+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if (a > 0){
            for (int i = 1; i < a+1; i++) {
                for (int j = i - 1; j > -1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else System.out.println("��� ����� �����ϴ�.");

    }



}
