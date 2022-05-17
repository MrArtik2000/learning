import javax.imageio.ImageTranscoder;

public class Calculator {
    public double sum(double... numbers){
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
    public double mul(double... numbers){
        double result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }
    public double divFirstByAll(double divident, double... divisors){
        double result = divident;
        for (int i = 0; i < divisors.length; i++) {
            result /= divisors[i];
        }
        return result;
    }
    public double fact(int fact){
        double result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }
        return result;
    }
    public double up(double num, double lev) {
        return Math.pow(num, lev);
    }
    public double average(double... numbers){
        return sum(numbers)/numbers.length;
    }
    public double geomaverage(double... numbers){
        return Math.pow(mul(numbers), (1/numbers.length));
    }
}
