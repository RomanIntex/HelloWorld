package ArraysExample;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        method4();
//        String name [] = {"Vladimir","Roman","Vladislav"};
//        for (String nameString:name) {
//            System.out.print(nameString + " ");
        }



    public static void method4() {
       int table [][] = new int [3][4];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                table [i][j] = (i*4) + j + 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void method1() {
        int array [] = new int[4];
        array[0] = 12;
        array[1] = 14;
        array[2] = 16;
        array[3] = 18;

        System.out.println(array.length);

        for (int j = 0; j < array.length; j++) {
            int i = array[j];
            System.out.println(i);
        }
        System.out.println();
        for (int i:array) {
            System.out.println(i);
        }
    }

    public static void method2() {
        //определяет наибольшее число в массиве
        Random rnd = new Random();
        int array [] = new int [1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        int min = array [0];
        int max = array [0];
        for(int i:array) {
            if(max < 1) max = i;
            if(min > i) min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void method3() {
        Random rnd = new Random();
        char array[] = new char [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(100);
        }
        for (int i:array) {
            System.out.println(i);
        }

    }
}
