package com.java;

import java.util.Arrays;

public class Array {
    public static void run() {
        int[] table = new int[5];
        System.out.println(table[0]);

        boolean[] booleansTable = new boolean[3];
        System.out.println(booleansTable[0]);

        String[] names = new String[10];
        System.out.println(names[0]);

        System.out.println(table.length);
        System.out.println(names.length);

        for (int element : table) System.out.println(element);
        System.out.println(java.util.Arrays.toString(table));

        int[] smallPrimes = { 4, 6, 2, 6, 7};
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[1] = 12;
        System.out.println(smallPrimes[1]);
        int[] copiedLuckyNumbers = java.util.Arrays.copyOf(luckyNumbers, luckyNumbers.length);

        Arrays.sort(smallPrimes);
        System.out.println(Arrays.toString(smallPrimes));

        randomNumberFromTableDontRepeat();

        Arrays.fill(smallPrimes, 4);
        System.out.println(Arrays.toString(smallPrimes));

        double[][] balances = new double[10][10];
        balances = fillArray(balances, 10, 10);
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        System.out.println(magicSquare[2][3]); // 2 - wiersz, 3 - kolumna
        System.out.println(Arrays.toString(balances));

        System.out.println(Arrays.deepToString(balances));
        for (double[] row : balances)
            for (double value : row)
                System.out.println(value);



    }

    private static double[][] fillArray(double[][] balances, int row, int column) {

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                balances[i][j] = (int) (Math.random()*100);
            }
        }
        return balances;
    }

    private static void randomNumberFromTableDontRepeat() {
        int n = 10;
        int k = 3;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // Losowanie k liczb i zapisanie ich w drugiej tablicy.
        int[] result = new int[k];


        //losowanie liczb bez powtarzania
        for (int i = 0; i < result.length; i++)
        {
            // Losowanie indeksu z zakresu 0 do n–1.
            int r = (int) (Math.random() * n);

            // Pobranie elementu z losowej lokalizacji.
            result[i] = numbers[r];

            // Przeniesienie ostatniego elementu do losowej lokalizacji.
            numbers[r] = numbers[n - 1];
            n--;
        }
    }
}
