public class work {
    public static void main(String[] args) {
        int[] arr = initArrTask3();
        int[] rand = randIntArr(100, 15, 20);
        printIntArr(rand);
        System.out.println(evenCounter(rand));
    }

    public static int[] randIntArr(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random()*(max-min+1)+min);
        }
        return (arr);
    }

    public static int[] initArrTask1() {
        int[] arr = new int[100];
        for (int i = arr.length-1; i >0; i--) {
            arr[i-1] = arr[i] + 1;
        }
        return arr;
    }

    public static int[] initArrTask2() {
        int[] arr = new int[51];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i] + 2;
        }
        return arr;
    }

    public static int[] initArrTask3() {
        int[] arr = new int[50];
        arr[0] = 1;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i] + 2;
        }
        return arr;
    }



    public static void printIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+": "+arr[i]);
        }

    }
    public static int evenCounter(int[] arr) {
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) o++;
        }
        return o;
    }
}
