package se01.task04;

public class SeriesGetter {
    private double[] series;

    public SeriesGetter(int n){
        series = new double[n];
        for (int i = 0; i < n ; i++) {
            series[i] = Math.random()*1000;
        }
    }

    public SeriesGetter(){
        this(10);
    }

    public double[] getSeries(){
        double[] copySeries = new double[series.length];
        for (int i = 0; i < series.length; i++)
            copySeries[i] = series[i];
        return copySeries;
    }

    public static double[] staticGetSeries(int length){
        SeriesGetter seriesGetter = new SeriesGetter(length);
        return seriesGetter.getSeries();
    }

    public static void seriesOut(double[] series) {
        for(double d:series) System.out.printf("%.5f\n",d);
    }
}
