package ru.otus.java.basic.lesson3;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num (1-5): ");
        int primer = scanner.nextInt();

        switch (primer) {
            case 1:
                greetings();
                break;
            case 2:
                checkSign(
                        random.nextInt(100 - 1) + 1,
                        random.nextInt(100 - 1) + 1,
                        random.nextInt(100 - 1) + 1);
                break;
            case 3:
                selectColor(random.nextInt(100 - 1) + 1);
                break;
            case 4:
                compareNumbers(
                        random.nextInt(100 - 1) + 1,
                        random.nextInt(100 - 1) + 1);
                break;
            case 5:
                addOrSubtractAndPrint(
                        random.nextInt(100 - 1) + 1,
                        random.nextInt(100 - 1) + 1,
                        random.nextBoolean());
                break;
            default:
                break;
        }

        System.out.println("end");

    }

    // (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
    // Hello, World, from, Java;
    public static void greetings() {

        System.out.println("Hello\nWorld\nfrom\nJava\n");
    }

    // (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int
    // переменные a, b и c. Метод должен посчитать их сумму, и если она больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае -
    // “Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {

        int res = a + b + c;
        if (res >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    // (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с
    // любым начальным значением. Если data меньше 10 включительно, то в консоль должно
    // быть выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”,
    // если больше 20 - “Зеленый”;
    public static void selectColor(int a) {

        if ( a <= 10 ){
            System.out.println("Красный (" + "a = " + a + ")");
        }
        else if ( a <= 20){
            System.out.println("Сумма отрицательная (" + "a = " + a + ")");
        }
        else {
            System.out.println("Зеленый (" + "a = " + a + ")");
        }
    }

    // (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b
    // с любыми начальными значениями. Если a больше или равно b, то необходимо вывести в консоль
    // сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers(int a,int b) {

        if ( a >= b ){
            System.out.println("a (" + a + ") >= b (" + b + ")");
        }
        else {
            System.out.println("a (" + a + ") < b (" + b + ")");
        }
    }

    // (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    // в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        if ( increment ){
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        }
    }
}
