package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 2};
        int[] arr3 = {1, 1, 1, 1, 1};



        sum3Arrays(arr1, arr2, arr3);

        int[] arr4 = {1, 1, 1, 1, 1, 5};
        equalPointPartsArr(arr4);
        int[] arr5 = {5, 3, 4, -2};
        equalPointPartsArr(arr5);
        int[] arr6 = {7, 2, 2, 2};
        equalPointPartsArr(arr6);
        int[] arr7 = {9, 4};
        equalPointPartsArr(arr7);


        int[] arr8 = {9, 4};
        desOrAscendingArr(arr8,false);

        int[] arr9 = {9, 4, -6, 2, 8, -4};
        revertArr(arr9);

    }

    /*
        Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
        массив равный сумме входящих;
        Пример:   { 1, 2, 3 }
                + { 2, 2 }
                + { 1, 1, 1, 1, 1 }
                = { 4, 5, 4, 1, 1 }
    */
    private static void sum3Arrays(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int maxLengthArr = Math.max(arr1.length, Math.max(arr2.length, arr3.length));

        int[] arr = new int[maxLengthArr];

        for ( int i = 0; i < maxLengthArr; i++ ) {
            if(i < arr1.length) arr[i] = arr1[i];
            if(i < arr2.length) arr[i] = arr[i] + arr2[i];
            if(i < arr3.length) arr[i] = arr[i] + arr3[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
        Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
        равны. “Точка находится между элементами”;
        Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    */
    private static void equalPointPartsArr(int[] arr) {
        System.out.println(Arrays.toString(arr));

        if(arr.length < 2) System.out.println("Маленький массив");
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print("i = " + i);
                int sumLeft = 0;
                int sumRight = 0;

                for (int j = 0; j <= i; j++) {
                    sumLeft += arr[j];
                }

                for (int j = i + 1; j <= arr.length - 1; j++) {
                    sumRight += arr[j];
                }

                System.out.print("; sumLeft = " + sumLeft);
                System.out.println("; sumRight = " + sumRight);

                if (sumLeft == sumRight) {
                    System.out.println("Граница между " + i + " и " + (i+1));
                    break;
                }
                if ((i == arr.length - 2) && (sumLeft != sumRight)) {
                    System.out.println("Граница не найдена");
                }

            }
        }

    }

    /*
        Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
        возрастания (по выбору пользователя)
    */
    private static void desOrAscendingArr(int[] arr, boolean desOrAsc) {
        // desOrAsc - true по возрастанию
        // desOrAsc - false по убыванию
        boolean err = false;
        System.out.println(Arrays.toString(arr));

        for ( int i = 0; i < arr.length - 1; i++ ) {
            System.out.print("i = " + arr[i]);
            System.out.println("; i+1 = " + arr[i+1]);

            if(desOrAsc && ( arr[i] > arr[i + 1] )){
                err = true;
                System.out.println("Не по возрастанию");
                break;
            }
            if(!desOrAsc && ( arr[i] < arr[i + 1] )){
                err = true;
                System.out.println("Не по убыванию");
                break;
            }

            if (!err && desOrAsc) System.out.println("По возрастанию");
            if (!err && !desOrAsc) System.out.println("По убыванию");

        }

    }

    /*
        Реализуйте метод, “переворачивающий” входящий массив
        Пример: { 1 2 3 4 } => { 4 3 2 1 }
    */
    private static void revertArr(int[] arr) {
        int[] arrtmp = new int[arr.length];

        for (int i = arr.length-1; i > 0;) {

            for (int j = 0; j < arr.length; j++) {

                System.out.println("arrtmp[" + j + "] = arr[" + i + "]");
                arrtmp[j] = arr[i];
                i--;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrtmp));

    }
}


