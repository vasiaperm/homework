package lesson_1.homework;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a < 0){
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }
}
