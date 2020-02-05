package lesson_1.homework;

import java.util.Scanner;

public class number_bool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean bool;
        if(a < 0) bool = true;
        else bool = false;
        System.out.println(bool);
    }
}
