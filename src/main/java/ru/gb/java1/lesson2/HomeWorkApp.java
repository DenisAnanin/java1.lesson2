package ru.gb.java1.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println (checkEntry (18,-9));
        checkPositive(-5);
        System.out.println(checkPositive1(0));
        printCycle(2,"Test");
        System.out.println(checkLeapYear(1144));
    }
    public static boolean checkEntry ( int a, int b){
//        if (a + b >= 10 & a + b <= 20)
//            return true;
//        else
//            return false;
//      Так предлогает заменить конструкцию if Среда разработки
        return a + b >= 10 & a + b <= 20;
    }
    public static void checkPositive (int a){
        if (a >= 0)
            System.out.println ("Вы передали в метод положительное число.");
        else
            System.out.println ("Вы передали в метод отрицательное число.");
    }
    public static boolean checkPositive1 (int a){
//    Соответственно и здесь тоже
        return a >= 0;
/*
		if (a >= 0)
			return true;
		else
			return false;
*/
    }
    public static void printCycle (int i, String prStr){
        if (i > 0){
            for (; i > 0; i--){
                System.out.println (prStr + " " + i);
            }
        }else{
            System.out.println ("Вы передали в метод отрицательное число или 0");
        }
    }
    public static boolean checkLeapYear (int y) {
//      Неочень красиво но вроде работает
        if (y < 100 & y % 4 == 0) {
            return true;
        } else if (y % 100 == 0 & y % 400 != 0){
            return false;
        }else if (y % 400 == 0){
            return true;
//      И сново Среда разработки
        }else return y % 4 == 0 & y % 100 != 0;

    }

}
