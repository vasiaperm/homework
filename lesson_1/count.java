package lesson_1.homework;


import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int result = a * (b + (c / d));
            System.out.println(result);
    }
}
