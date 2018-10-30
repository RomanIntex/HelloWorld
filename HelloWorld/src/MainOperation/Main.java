package MainOperation;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        method5();
    }

    public static void method(){
        int i = 1;
        i++; // Постфиксная форма
        i = i + 1;
        i--; // Постфиксная форма
        i = i - 1;

        System.out.println(i);
        int i2 = 1;
        ++i2;
        --i2;
        System.out.println(i2);
        int x = 10;
        int y = x++;
        System.out.println(x + " " + y);

        int a = 12;
        int b = 3;
        int c = a /= b;
        b /= 3;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

    }

    public static void method1() {
        int mouse;
        int weight;
        mouse = 5;
        weight = 4500;
        if (mouse != 0 && weight / mouse < 1000) {
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Нельзя кормить");
        }
        if (false || true){
            System.out.println("Ок!");
        }
        int number = 10 == 5 ? 10:5;
        System.out.println(number);
        String numberofmouse = mouse > 5 ? "хорощий кот" : "плохой кот";
        System.out.println(numberofmouse);

    }
    public static void method2(){
        int a = 5;
        int b = 5;

        if (a<=b) {
            System.out.println("a меньше b");
            if (a != b) {
                System.out.println("a не равно b");
            } else {
                    System.out.println("a равно b");
                }
            }
        else System.out.println("a не меньше b");
    }
    public static void method3(){
        Random rnd = new Random();
        int i = 0;
        while (i<7){

        int a = 7;
        int b = rnd.nextInt(5) + 1;
        int c = rnd.nextInt(6) + 1;

//        if (a<b) System.out.println("a меньше b");
//        else if (a==b) System.out.println("a==b");
//        else if (a>b) System.out.println("a>b");
//        i++;
        if (c<b) System.out.println("c меньше b");
        else if (c==b) System.out.println("c==b");
        else if (c>b) System.out.println("c>b");
        else System.out.println("не один из вариантов не подходит");
            i++;

        System.out.println();
        }

    }
    public static void method4(){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("введите число");

        int a = rnd.nextInt(scan.nextInt()) + 1;
        int b = 4;
        int c = rnd.nextInt(6) + 1;
        if (a>b & a>c) System.out.println("a больше b,c");
        else if (b>a & b>c) System.out.println("b больше a,c");
        else if (c>a & c>b) System.out.println("c больше b,a");

    }

    public static void method5() {
        if (true) {
            System.out.println("Какой-то текст");
            System.out.println("Какой-то текст");
        }
    }

}
