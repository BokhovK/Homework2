import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int money = 15_000;
        int allMoney = 2_459_000;
        double sum = 0;
        int month = 0;
        while (sum <= allMoney) {
            month++;
            sum += money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");

        }
        //Задача 2
        System.out.println("Задача 2");
        int a = 0;
        int b = 10;
        while (a < b) {
            a++;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(" " + c + " ");
        }
        //Задача 3
        System.out.println("Задача 3");
        int peoples = 12_000_000;
        int burn = 17;
        int die = 8;
        int year = 10;
        int yearNow = 2024;
        for (int years = yearNow + 1; years <= yearNow + year; years++) {
            peoples += (burn - die) * peoples / 1_000;
            System.out.println("Год " + years + ", численность населения составляет" + peoples);
        }
        //Задача 4
        System.out.println("Задача 4");
        double percent = 0.07;
        int deposit = 15000;
        long summa = 12000000;
        int months = 0;
        while (deposit <= summa) {
            months++;
            deposit += deposit * percent;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit + " рублей");

        }
        //Задача 5
        System.out.println("Задача 5");
        double percents = 0.07;
        int deposits = 15000;
        long summas = 12000000;
        int monthss = 0;
        while (deposits <= summas) {
            monthss++;
            deposits += deposits * percents;
            if (monthss % 6 == 0) {
                System.out.println("Месяц " + monthss + ", сумма накоплений равна " + deposits + " рублей");
            }
        }
        //Задача 6
        System.out.println("Задача 6");
        int mon = 12 * 9;
        while (monthss < mon) {
            monthss++;
            deposits += deposits * percent;
            if (monthss % 6 == 0) {
                System.out.println("Месяц " + monthss + ", сумма накоплений равна " + deposits + " рублей");
            }
        }
        //Задача 7
        System.out.println("Задача 7");
        int firstFriday = 7;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " +friday+ "-е число, нужно подготовить отчёт");
        }
        //Задача 8
        System.out.println("Задача 8");
        int mainYear=2024;
        int startYear=mainYear-200;
        int endYear=mainYear+100;
        int period=79;
        int startPeriod=0;
        for (int oneYear = startYear; oneYear<=endYear; oneYear++) {
            if (oneYear % period == startPeriod) {
                System.out.println(oneYear);
            }
    }
  }
}