package se01.task03;

public class MainTask03 {
    public static void main(String[] args){
        //double a = 1/0;
        double a = 0;
        double b = 1;
        double h = 0.1;
        for (double x = a; x<= b; x+=h){
            System.out.printf("%.2f | %f \n", x, getFunction(x));
        }

    }

    private static double getFunction(double x){
        return Math.tan(2*x) - 3;
    }
}
