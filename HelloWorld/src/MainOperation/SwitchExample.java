package MainOperation;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        //method3();
        method4();
    }
//    public static void method1 () {
//        Random rnd = new Random();
//        int j = 0;
//        int i = rnd.nextInt(10);
//        System.out.println("сгенерировано число: " + i);
//        while (j < i)
//        switch (i) {
//            case 0:
//                System.out.println("i=0");
//                break;
//            case 1:
//                System.out.println("i=1");
//                break;
//            case 2:
//                System.out.println("i=2");
//                break;
//            default:
//            break;
//        }
//        j++;
//    }
//
//    public static void method2 () {
//        Random rn = new Random();
//        int i = rn.nextInt(12) + 1;
//        System.out.println(i);
//        switch (i){
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//                default:
//                System.out.println("Такого месяца не существует");
//                break;
//        }
//    }

    public static void method3() {
        int counter = 1;
//        while (counter > 0) {
//            System.out.print("Осталось" + counter + "сек.");
//            counter--;
//        }

        do {
            System.out.println("i<10");
            counter++;
        } while (counter < 10);
    }

    public static void method4() {
        for(int i=0; i<10;i++){
            System.out.println("Осталось" + i + "сек.");
        }

    }
}
