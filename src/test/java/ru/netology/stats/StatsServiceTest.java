package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void sumSale() {
        assertEquals(180, service.sumSale(monthSales));
    }

    @Test
    public void averageMonthlySales() {
        assertEquals(15, service.averageMonthlySales(monthSales));
    }

    @Test
    public void maxSales() {
        assertEquals(8, service.maxSales(monthSales));
    }

    @Test
    public void minSales() {
        assertEquals(9, service.minSales(monthSales));
    }

    @Test
    public void numberMonthsLowSales() {
        assertEquals(5, service.numberMonthsMinSales(monthSales));
    }

    @Test
    public void numberMonthsHidhSales() {
        assertEquals(5, service.numberMonthsMaxSales(monthSales));
    }
}

