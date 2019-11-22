package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println(polindrome("aBBa"));
        int [] array  = randomArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(numberPosition(5,array));
        System.out.println(Arrays.toString(minMaxElement(array)));
        System.out.println(averageNumber(0,array));
        System.out.println(Arrays.toString(numberOfNegativeElements(array)));
        System.out.println(Arrays.toString(deleteElement(3,array)));
        System.out.println(Arrays.toString(reverseArrayOrder(array)));
        System.out.println(Arrays.toString(arrayCheck(array)));
        System.out.println(Arrays.toString(shuffleArrayElements(array)));
        System.out.println(Arrays.toString(sortingAnArrayInAscendingOrder(array)));
        System.out.println(randomTwoDimensionalArray(5, 5));


    }

    public static boolean polindrome (String name) {
        int numbers = name.length();
        for (int i = 0; i < (numbers / 2); i++) {
            if (name.charAt(i) != name.charAt(numbers - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static int[] randomArray (int x) {
        int array [] = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(21)-5 ;
        }
        return array;
    }


    public static int numberPosition (int x, int array []) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static int[] minMaxElement (int array []) {
        int max = array[0];
        int imax = 0;
        int min = array[0];
        int imin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        array[imin] = max;
        array[imax] = min;
        return array;
    }

    public static double averageNumber (double x,int array []) {
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            x = sum / array.length;
            System.out.print("среднее арифмитическое значение = ");
        }
        return x;

    }

    public static int[] numberOfNegativeElements ( int array []) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(21) - 10;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) count++;
        }
        System.out.println("в массиве " + count + "  отрицательных элемента (-ов) ");

        return array;
    }

    public static int[] deleteElement (int n ,int array []) {
            int[] arrayElement = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != n) {
                arrayElement[j] = array[i];
                j++;
            }
        }
        return arrayElement;
    }


    public static int[] reverseArrayOrder (int array []) {
        int[] reverseArray = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[j] = array[i];
            j--;
        }
        return reverseArray;
    }

    public static int[] arrayCheck (int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 );
        }
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
        return array;
    }


    public static int[] shuffleArrayElements (int [] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = RANDOM.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    public static int[] sortingAnArrayInAscendingOrder (int array[]) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[][] randomTwoDimensionalArray (int length, int width) {
        int[][] array2 = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                array2[i][j] = RANDOM.nextInt(100) ;
                System.out.print(array2[i][j] + " ");
                if (j == (width - 1)) {
                    System.out.println();
                }
            }
        }
        return array2;
    }

}
