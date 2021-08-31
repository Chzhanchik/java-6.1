package ru.netology.stats;

public class StatsService {

    public long sumSale(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long averageMonthlySales(long[] sales) {
        return sumSale(sales) / sales.length;
    }


    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long numberMonthsMinSales(long[] sales) {
        long months = 0;
        long average = averageMonthlySales(sales);
        for (long sale : sales) {
            if (sale < average) {
                months += 1;
            }
        }
        return months;
    }

    public long numberMonthsMaxSales(long[] sales) {
        long months = 0;
        long average = averageMonthlySales(sales);
        for (long sale : sales) {
            if (sale > average) {
                months += 1;
            }
        }
        return months;
    }


}