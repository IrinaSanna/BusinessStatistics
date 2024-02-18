package ru.netology.stats.BusinessStatistics.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmountSales(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void shouldNumberMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMaxMonth = 8;
        int actualNumMaxMonth = service.numberMonthMaxSales(sales);

        Assertions.assertEquals(expectedNumMaxMonth, actualNumMaxMonth);
    }

    @Test
    public void shouldNumberMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMinMonth = 9;
        int actualNumMinMonth = service.numberMonthMinSales(sales);

        Assertions.assertEquals(expectedNumMinMonth, actualNumMinMonth);
    }

    @Test
    public void shouldSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonthMin = 5;
        int actualNumMonthMin = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedNumMonthMin, actualNumMonthMin);
    }

    @Test
    public void shouldSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonthMax = 5;
        int actualNumMonthMax = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedNumMonthMax, actualNumMonthMax);
    }
}
