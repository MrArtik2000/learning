public class Student {
    private String surnAndInit;
    private int groupNo;
    private int[] perf = new int[5];

    public void ifBest(int level){
        boolean best = true;
        for (int i = 0; i < perf.length; i++) {
            if (perf[i] < level) {
                best = false;
            }
        }
        if (best) {
            System.out.println(surnAndInit + " | " + groupNo);
        }
    }

    public void setSurnAndInit(String surnAndInit) {
        this.surnAndInit = surnAndInit;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public void setPerf(int[] perf) {
        this.perf = perf;
    }
}
