import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        boolean set = true;
        boolean simple;
        boolean corr;
        int num = 0;
        int i;
        String bin;

        Scanner in = new Scanner(System.in);

        while (set) {
            simple = true;
            corr = true;
            System.out.print("Input a number: ");
            if (in.hasNextInt()) {
                num = in.nextInt();
            } else {
                System.out.println("Number is not integer!");
               corr = false;
               bin = in.nextLine();
            }

            if (corr) {
                if (num > 0) {
                    System.out.println("Number " + num + " is bigger than zero");
                } else if (num == 0) {
                    set = false;
                } else {
                    System.out.println("Number " + num + " is lesser than zero");
                }
                if (set) {

                    if (num > 0 ){
                        for (i = 2; i < num; i++) {
                            if (num % i  ==0) {
                                simple = false;
                                break;
                            }
                        }
                    }
                    if (num < 0){
                        for (i = -2; i > num; i--) {
                            if (num % i == 0) {
                                simple = false;
                            }
                        }
                    }

                    if (num % 2 == 0) {
                        System.out.println("Number " + num + " is even");
                    } else {
                        System.out.println("Number " + num + " is odd");
                    }

                    if (simple) {
                        System.out.println("Number " + num + " is Prime");
                    } else {
                        System.out.println("Number " + num + " is not Prime");
                    }
                }
            }

        }

        in.close();
        System.out.println("Exiting program");

    }

}