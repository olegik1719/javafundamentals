package se01.task04;

public class MainTask04 {
    public static void main(String[] args) {
        // Делим код на части:
        // 1. Получение исходных данных.
        // Чтобы не запариваться здесь -- вынес в отдельный класс.
        double[] series = SeriesWorker.staticGetSeries(9);
        //SeriesGetter.seriesOut(series);
        // 2. Работаем с данными. Обрабатываем их
        double max = (series[0] + series[series.length - 1]) / 2;

        for (int i = 1; i < series.length / 2 + 1; i++) {
            double imax = (series[i] + series[series.length - 1 - i]) / 2;
            if (imax > max) max = imax;
        }
        System.out.println(max);
    }
}
