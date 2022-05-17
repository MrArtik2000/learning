public class RunMethod {
    public static void main(String[] args) {

//        Student maks = new Student(20, "Maks", "AQA");
//        maks.printInfo();

        Calculator myCalc = new Calculator();
//        double result = myCalc.sum(2,5,14.2,32.4);
//        System.out.println(result);
        System.out.println(myCalc.mul(2,2,2,2));
//        double div = myCalc.divFirstByAll(12, 2,3,4);
//        System.out.println(div);
//        System.out.println(myCalc.divFirstByAll(myCalc.fact(15), 18,24,4,2,51));
//        System.out.println(myCalc.up(64, 0.5));
        System.out.println(myCalc.geomaverage(1,100));
    }
}
