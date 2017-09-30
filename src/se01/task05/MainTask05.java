package se01.task05;

public class MainTask05 {
    public static void main(String[] args) {
        int[][] matrixResult = create(6);
        for (int[] row: matrixResult){
            for(int col:row) System.out.print(col);
            System.out.println();
        }
    }

    private static int[][] create(int size){
        int[][] result = new int[size][size];
        for (int i=0; i<size;i++)
            result[i][i]=result[i][(size-1)-i]=1;
        return result;
    }
}
