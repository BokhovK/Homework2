import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        int clientOS=1;
        switch(clientOS) {
            case 1:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 2:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой версии приложения не существует");
        }
//Задача 2
        int clientDeviceYear=2015;
        int clientOsOne=1;
        if (clientDeviceYear<=2015 && clientOsOne>=1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегчëнную версию приложения для Android по ссылке");
        }
         // Задача 3
        int year=1945;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance<=20)  {
            System.out.println("Для доставки карты потребуются сутки");
        } else if (deliveryDistance>=20 && deliveryDistance<=60) {
            System.out.println("Для доставки карты потребуется двое суток");
        } else if (deliveryDistance>=60 && deliveryDistance<=100) {
            System.out.println("Для доставки карты потребуется трое суток");
        } else {
            System.out.println("Доставки нет");
        }
        //задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц относится к сезону зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц относится к сезону весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц относится к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц относится к сезону осени");
                break;
            default:
            System.out.println("Такого месяца не существует");
        }
    }
}