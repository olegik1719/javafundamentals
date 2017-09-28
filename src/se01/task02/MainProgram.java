package se01.task02;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String... args){
        int minNumber = 0;
        double epsilon = 0.01;
        ArrayList<Double> sequence = new ArrayList<Double>();
        System.out.println("Enter epsilon:");
        for (double result=series(minNumber);result>=epsilon;minNumber++,result=series(minNumber)){
            sequence.add(result);
        }
        System.out.println(minNumber);
        for(double d:sequence){
            System.out.println(d);
        }
    }
    private static double series(int n){
        double result = Double.MAX_VALUE;
        if (n!=-1){
            result = (double) 1/((n+1)*(n+1));
        }
        return result;
    }
}
