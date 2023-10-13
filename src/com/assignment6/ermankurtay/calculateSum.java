package com.assignment6.ermankurtay;

import java.util.List;
import java.util.stream.Collectors;

public class calculateSum {

    public static int SumbyYear(List<Pojo> carSS, int year) {
        List<Pojo> carSSForYear = carSS.stream()
                .filter(carS -> carS.getDate().getYear() == year)
                .collect(Collectors.toList());

        int sumSales = carSSForYear.stream()
                .mapToInt(carS -> Integer.valueOf(carS.getSales()))
                .sum();

        return sumSales;
    }
}
