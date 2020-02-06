package lesson1;

public class HomeWork {
    // TODO: 14.01.2020
    public static void main(String[] args) {

    }

    public int task3(int a, int b, int c, int d) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int result = a * (b + (c / d));
        System.out.println(result);// TODO: 14.01.2020

    }

    public boolean task4(int a, int b) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = a + b;
        boolean bool;
        if (result >= 10 && result <= 20) bool = true;
        else bool = false;
        System.out.println(bool);

    }

    public void task5(int number) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a < 0){
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }// TODO: 14.01.2020
    }

    public boolean task6(int val) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean bool;
        if(a < 0) bool = true;
        else bool = false;
        System.out.println(bool);

    }

    public void task7(String name) {
        ing a ="John";
        System.out.println("Привет, " + a + "!");
    }

    public boolean isLeapYear(int year) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = in.nextInt();
        int b = 4;
        int c = 100;
        int d = 400;

        if(a % d == 0){
            System.out.println("Год високосный");
        }else if(a % c == 0) {
            System.out.println();
        }else if(a % b == 0){
            System.out.println("Год високосный");

        }
    }
}


}
