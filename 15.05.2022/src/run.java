public class run {
    public static void main(String[] args) {

//        Array init
    Student[] list = new Student[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
        }

//        Names fill
    list[0].setSurnAndInit("Potts, P.");
    list[1].setSurnAndInit("Pierce, A.");
    list[2].setSurnAndInit("Fury, N.");
    list[3].setSurnAndInit("Rogers, S.");
    list[4].setSurnAndInit("Romanova, N.");
    list[5].setSurnAndInit("Barton, C.");
    list[6].setSurnAndInit("Wilson, S.");
    list[7].setSurnAndInit("Rhodes, J.");
    list[8].setSurnAndInit("Hill, M.");
    list[9].setSurnAndInit("Carter, S.");

//        Example academical performance and group No fill
        int[] bestExample = new int[] {10, 10, 10, 10, 10};
        list[0].setPerf(bestExample);
        list[0].setGroupNo(10606118);

//        Random academical performance and group No fill
        int[] perf = new int[5];
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < perf.length; j++) {
                perf[j] = (int) ((Math.random()*9)+1);
            }
            list[i].setPerf(perf);
            list[i].setGroupNo((int)(Math.random()*100000000));
        }

        for (int i = 0; i < list.length; i++) {
            list[i].ifBest(9);
        }


    }
}
