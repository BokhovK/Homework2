import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        //Задача 1
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i+2) {
            System.out.println(i);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i+4) {
            System.out.println(i + " год является високосным");
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i < 105; i = i+7) {
            System.out.println(i);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i < 1016; i = i*2) {
            System.out.println(i);
        }
        //Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total=total+salary;
            System.out.println("Месяц " +i+ ", сумма накоплений равна " +total+" рублей");
        }
        //Задача 9
        System.out.println("Задача 9");
        int oneSalary = 29000;
        int oneTotal = 0;
        for (int i = 0; i < 13; i++) {
            oneTotal = oneTotal + oneTotal / 100;
            oneTotal = oneTotal + oneSalary;
            System.out.println("Месяц " +i+ ", сумма накоплений равна " +oneTotal+" рублей");
        }
        //Задача 10
        System.out.println("Задача 10");
        int num=2;
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "*" +i+"=" + num*i);
        }

    }
}