package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(Polindrome("aBBa"));
        System.out.println("Задача 2 ");
        RandomArrayNumber(new int[5]);
        System.out.println("Задача 3");
        System.out.println(NumberPosition(new int[5], 2));
        System.out.println("Задача 4");
        MinMaxElement(new int[]{1, 3, 8, -7, -3});
        System.out.println("Задача 5");
        System.out.println(AverageNumber(0));
        System.out.println("Задача 6");
        NumberOfNegativeElements(new Random());
        System.out.println("Задача 8");
        ReverseArrayOrder(0);
        System.out.println("Задача 9");
        System.out.println(ArrayCheck(new int[10]));
        System.out.println("Задача 10");
        System.out.println(Arrays.toString(ShuffleArrayElements(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println("Задача 11");
        SortingAnArrayInAscendingOrder(new int[]{5, 8, 6, -3, 1, -7, 0, -4});
        System.out.println("Задача 12");
        int[][] array = RandomTwoDimensionalArray(5, 5);


    }

    public static boolean Polindrome(String name) {
        int numbers = name.length();
        for (int i = 0; i < (numbers / 2); i++) {
            if (name.charAt(i) != name.charAt(numbers - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static int RandomArrayNumber(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.println(array[i]);
        }
        return 0;
    }

    public static int NumberPosition(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.println(array[i]);
            if (x == array[i]) {
                return i;
            }
        }
        return -1;

    }

    public static int MinMaxElement(int array[]) {
        int min, max;
        min = max = array[0];
        for (int i = 0; i < 5; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("min=" + min + " max=" + max);
        return min;
    }

    public static double AverageNumber(double average) {
        int[] numbers = {10, 20, 30, 40};
        if (numbers.length > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            average = sum / numbers.length;
            System.out.print("среднее арифмитическое значение = ");
        }
        return average;

    }

    public static int NumberOfNegativeElements(Random random) {
        int a = random.nextInt(10) + 1;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) numbers[i] = random.nextInt(21) - 10;
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) count++;
        }
        System.out.println("в массиве " + count + "  отрицательных элемента (-ов) ");
        return a;
    }


    public static int ReverseArrayOrder(int lengs) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i : array) {
            lengs++;
        }
        for (int i = lengs - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        return lengs;
    }

    public static int ArrayCheck (int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        boolean x = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован  по возрастанию");
        }
        return 0;
    }


    public static int[] ShuffleArrayElements(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    public static int SortingAnArrayInAscendingOrder(int array[]) {
        int a, b, t;
        int size;
        size = 8;

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        System.out.println("отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print("" + array[i]);
            System.out.println();
        }
        return a;
    }

    public static int[][] RandomTwoDimensionalArray(int length, int width) {
        int[][] array = new int[length][width];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
                if (j == (width - 1)) {
                    System.out.println();
                }
            }
        }
        return array;
    }

}
