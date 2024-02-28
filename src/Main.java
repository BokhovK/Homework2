import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printInfoAboutYear(2024);
        printInfoAboutVersion(1, 2024);
        int diliveryDays = calculateDiliveryCard(95);
        if (diliveryDays != -1) {
            System.out.println("Кол-во дней доставки " + diliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void printInfoAboutYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "- високосный год");
        } else {
            System.out.println(year + "- не високосный год");
        }
    }

    //Task 2

    static void printInfoAboutVersion(int os, int productionYear) {
        int current = LocalDate.now().getYear();
        if (os == 0 && productionYear == current) {
            System.out.println("Установите версию для iOS");
        } else if (os == 0 && productionYear < current) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (os == 1 && productionYear == current) {
            System.out.println("Установите версию для Android");
        } else if (os == 1 && productionYear < current) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Некорректная ОС!");
        }
    }

    //Task 3
    static int calculateDiliveryCard(int distance) {
        if (distance < 0 || distance > 100) {
            return -1;
        }
        int diliveryDays = 1;
        if (distance >= 20) {
            diliveryDays++;
        }
        if (distance >= 60) {
            diliveryDays++;
        }
        return diliveryDays;
    }
}








