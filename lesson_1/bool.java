package lesson_1.homework;

import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = a + b;
        boolean bool;
        if (result >= 10 && result <= 20) bool = true;
        else bool = false;
        System.out.println(bool);
    }
}
