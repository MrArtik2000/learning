import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        ifelseFour();
    }
    public static void ifelseOne() {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num = in.nextInt();
        in.close();
        if (num > 0) {num++;}
        if (num < 0) {num-=2;}
        if (num == 0) {num=10;}
        System.out.println("result is:" + num);
    }
    public static void ifelseTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Print int number a:");
        int a = in.nextInt();
        System.out.println("Print int number b:");
        int b = in.nextInt();
        System.out.println("Print int number c:");
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
            if (b > c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        if (b > a && b > c) {
            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        if (c > a && c > b) {
            System.out.println(c);
            if (b > a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
    public static void ifelseThree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Print int number a:");
        int a = in.nextInt();
        System.out.println("Print int number b:");
        int b = in.nextInt();
        System.out.println("Print int number c:");
        int c = in.nextInt();

        if (a > b && a < c) System.out.println(a);
        if (a < b && a > c) System.out.println(a);


        if (b > a && b < c) System.out.println(b);
        if (b < a && b > c) System.out.println(b);


        if (c > b && c < a) System.out.println(c);
        if (c < b && c > a) System.out.println(c);
    }
    public static void ifelseFour() {
        Scanner in = new Scanner(System.in);
        System.out.println("Print int number a:");
        int a = in.nextInt();
        System.out.println("Print int number b:");
        int b = in.nextInt();
        System.out.println("Result is?:");
        int c = in.nextInt();
        if (a * b == c) {
            System.out.println("Result is correct!");
        } else {
            System.out.println("Result is wrong! Correct result is:"+ a * b);
        }
    }
}
