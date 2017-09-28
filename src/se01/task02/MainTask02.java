package se01.task02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTask02 {
    public static void main(String... args){
        int minNumber = 1;
        double epsilon = getEpsilon(args);//0.01;
        ArrayList<Double> sequence = new ArrayList<>();
        //
        double result;
        for (sequence.add(result=series(minNumber));result>=epsilon;++minNumber,sequence.add(result=series(minNumber))){}
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

    private static double getEpsilon(String[] args){
        double eps = 0.01;
        // if user gave us parameters, then first try use as epsilon
        if (args.length > 0){
            eps = Double.parseDouble(args[0]);
        }else{
            System.out.println("Enter epsilon:");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()){
                eps = sc.nextDouble();
            }
        }
        return eps;
    }
}
