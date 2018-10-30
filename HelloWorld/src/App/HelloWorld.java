package App;

import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {
//        //System.out.println("Hello, World!");
//        byte b = (byte)216;
//        short s = 231;
//        int i = 5353;
//        long l = 313142342;
//        char c = 61;
//        char c1 = 62;
//        char c3 = (char) (c + c1);
//        float f = 101f;
//        double d = 25;
//        double d1 = Math.sqrt(d);
//
//        boolean b1 = 6 > 3;
//        boolean b2 = false;
//
//        String str = "Line" + " " + "Line";
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(c3);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(d1);
//        System.out.println(b1 + "_" + b2);
//        System.out.println(str + str + b1);
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10%3;
        dresult = 10.0/3.0;
        drem = 10.0%3.0;
        System.out.println("Результат и остаток от деления 10/3:" + iresult + " " + irem);
        System.out.println("Результат и остаток от деления 10.0/3.0:" + dresult + " " + drem);
    }
}
