public class Test {

    public static void main(String[] args) {

        int val1 = 32;
        int val2 = 24;
        int val3 = sum(val1, val2);
        int val4 = dif(val1, val2);
        int val5 = mul(val1, val2);
        double val6 = div(val1, val2);
        String str = "String containment";

        System.out.println("Method sum says:" + val3);
        System.out.println("Method dif says:" + val4);
        System.out.println("Method mul says:" + val5);
        System.out.println("Method div says:" + val6);

        System.out.println(str);
    }
         public static int sum ( int sum1, int sum2){
            int res = sum1 + sum2;
            return res;
        }
        public static int dif ( int dif1, int dif2){
            int res = dif1 - dif2;
            return res;
        }
        public static int mul ( int mul1, int mul2){
            int res = mul1 * mul2;
            return res;
        }
        public static double div (double dev1, double dev2){
            double res = dev1 / dev2;
            System.out.println(res);
            return res;
        }

}