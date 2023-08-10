package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxOneIncomes() {
        StatisticsService service = new StatisticsService();

        long[] oneIncomes = {2};

        long expected = 2;
        long actual = service.findMax(oneIncomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeIncomes() {
        StatisticsService service = new StatisticsService();

        long[] negativeIncomes = {-2, -3, -11, -25, -13};

        long expected = -2;
        long actual = service.findMax(negativeIncomes);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxIncome() {
        StatisticsService service = new StatisticsService();

        long[] maxIncome = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(maxIncome);

        Assertions.assertEquals(expected, actual);
    }
}