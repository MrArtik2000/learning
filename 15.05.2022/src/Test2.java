public class Test2 {
    private double num0;
    private double num1;

    public Test2(double num0, double num1) {
        this.num0 = num0;
        this.num1 = num1;
    }
    public Test2() {
        this.num0 = 1.0;
        this.num1 = 0.1;
    }

    public double getNum0() {
        return num0;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum0(double num0) {
        this.num0 = num0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
}
