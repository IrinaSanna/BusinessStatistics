package ru.netology.stats.BusinessStatistics.service;

public class StatsService {
    public int sumAllSales(long[] sales) {
        long sum = 0;

        for (long allSales : sales) {
            sum += allSales;
        }
        return (int) sum;
    }

    public int averageAmountSales(long[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int numberMonthMaxSales(long[] sales) {
        int numberMaxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[numberMaxMonth]) {
                numberMaxMonth = i;
            }
        }
        return numberMaxMonth + 1;
    }

    public int numberMonthMinSales(long[] sales) {
        int numberMinMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[numberMinMonth]) {
                numberMinMonth = i;
            }
        }
        return numberMinMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int averageAmountSales = sumAllSales(sales) / sales.length; // средние продажи
        int numberMonth = 0;  // количество месяцев

        for (long sale : sales) {
            if (sale < averageAmountSales) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int salesAboveAverage(long[] sales) {
        int averageAmountSales = sumAllSales(sales) / sales.length; // средние продажи
        int numberMonth = 0;  // количество месяцев

        for (long sale : sales) {
            if (sale > averageAmountSales) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}