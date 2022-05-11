package com.java.interfaces.staticinnerclass;

public class ArrayAlg {
    /**
     * Para liczb zmiennoprzecinkowych.
     */
    public static class Pair
    {
        private double first;
        private double second;

        /**
         * Tworzy parę dwóch liczb zmiennoprzecinkowych.
         * @param f pierwsza liczba
         * @param s druga liczba
         */
        public Pair(double f, double s)
        {
            first = f;
            second = s;
        }

        /**
         * Zwraca pierwszą liczbę z pary.
         * @return pierwsza liczba
         */
        public double getFirst()
        {
            return first;
        }

        /**
         * Zwraca drugą liczbę z pary.
         * @return druga liczba
         */
        public double getSecond()
        {
            return second;
        }
    }

    /**
     * Znajduje największą i najmniejszą wartość w tablicy.
     * @param values tablica liczb zmiennoprzecinkowych
     * @return para liczb, w której pierwsza liczba określa wartość najmniejszą, a druga
     * największą
     */
    public static Pair minmax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values)
        {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
