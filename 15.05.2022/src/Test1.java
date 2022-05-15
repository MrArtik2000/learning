public class Test1 {
    private double num0;
    private double num1;
    public Test1(double num0, double num1){
        this.num0 = num0;
        this.num1 = num1;
    }
    public void sentNum0(){
           System.out.println("Num0 is: " + num0);
    }
    public void sentNum1(){
        System.out.println("Num1 is: " + num1);
    }

    public void setNum0(double num0) {
        this.num0 = num0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getSum(){
        return (num0+num1);
    }
    public double getBigger(){
        if (num0 > num1) {
            return num0;
        } else {
            return num1;
        }
    }
}
