package se01.task02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Решение задачи 02 из списка домашних заданий для группы JavaFundamentals 06
 * @author olegik1719
 */


public class MainTask02 {
    public static void main(String... args){
        int minNumber = 0;
        double epsilon = getEpsilon(args);//0.01;
        ArrayList<Double> sequence = new ArrayList<>();
        //
        double result;
        //for (sequence.add(result=series(minNumber));result>=epsilon;++minNumber,sequence.add(result=series(minNumber))){}
        do {
            minNumber++;
            result = series(minNumber);
            sequence.add(result);
        } while (result >= epsilon);
        System.out.println(minNumber);
        for(double d:sequence){
            System.out.println(d);
        }
    }

    /**
     * Функция возвращает n-ый член последовательности
     * @param n -- номер очередного, нужного нам члена последовательности
     * @return число, нужный член последовательности
     */
    private static double series(int n){
        double result = Double.MAX_VALUE;
        if (n!=-1){
            result = (double) 1/((n+1)*(n+1));
        }
        return result;
    }

    /**
     * Функция работает с пользователем и запрашивает у него epsilon
     * -- с какой точностью искать тот самый "минимакс"
     * @param args -- строка аргументов на входе;
     * @return epsilon -- необходимая точность.
     */

    private static double getEpsilon(String[] args){
        double eps = 0.01;
        // if user gave us parameters, then first try use as epsilon
        if (args.length > 0){
            try {
                eps = Double.parseDouble(args[0]);
            }catch(Exception e){
                System.out.println("Enter epsilon:");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextDouble()){
                    eps = sc.nextDouble();
                }
            }
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
