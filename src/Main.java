import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println(shouldWakeUp(true , 1 ));
        System.out.println(shouldWakeUp(false , 2 ));
        System.out.println(shouldWakeUp(true , 8 ));
        System.out.println(shouldWakeUp(true , -1 ));

        //task2
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        //task3
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        //task4
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1));


    }


    // Havlayan Köpek
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        } else if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }
        return false;


    }


    //Yaş Tespiti
    public static boolean hasTeen(int a, int b, int c) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }

        return false;
    }

    //Oyuncu Kedi
    public static boolean isCatPlaying(boolean summer, int temperature) {

        int upperLimit = summer ? 45 : 35;

        if (temperature >= 25 && temperature <= upperLimit) {
            return true;
        }

        return false;
    }



    //Alan Hesaplama
    public static double area(double width, double height) {

        if (width < 0 || height < 0) {
            return -1;
        }

        return width * height;
    }


    public static double area(double radius) {

        if (radius < 0) {
            return -1;
        }

        return radius * radius * Math.PI;
    }




}
