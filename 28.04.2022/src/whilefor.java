public class whilefor {
    public static void main(String[] args) {
      whileThree();
    }
    public static void whileOne() {
        int i = 1000;
        while(i<=9999) {
            System.out.println(i);
            i++;
        }
    }
    public static void whileTwo() {
        int k = 1;
        for (int i = 1; i<=55; i++) {
            System.out.println(k);
            k+=2;
        }
    }
    public static void whileThree() {
        int i = 90;
        while (i>=0) {
            System.out.println(i);
            i-=5;
        }
    }
    public static void whileFour() {
        float k = 100;
        for (int i = 1; i <= 10 ; i++ ) {
            System.out.println(k);
            k /= 2;
        }
    }
}
