package SortOper;

import java.util.Random;

public class SortExample {
    public static void main(String[] args) {
        SortExample Ex1 = new SortExample();
        Ex1.method();
    }
    public void method() {
        Random rnd = new Random();
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100000);
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array [j+1]){
                    int temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;

                }

            }

        }
        for (int i:array) {
            System.out.println(i);
        }
    }
}
