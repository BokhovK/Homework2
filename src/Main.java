public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       //Задача 1
        int age=20;
        int oldAge=18;
        if (age >= oldAge) {
        System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
        System.out.println("Если возраст человека равен"+age+" он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2
        int temprature=2;
        int normal=5;
        if (temprature<normal) {
            System.out.println("На улице " + temprature + " градуса, нужно надеть шапку");
        } else if(temprature>normal){
            System.out.println("На улице " + temprature + " градуса можно идти без шапки");
        }
        //Задача 3
        int speed=80;
        int normSpeed=60;
        if (speed>normSpeed) {
            System.out.println("Если скорость равна " + speed + " км/ч придётся заплатить штраф");
        } else if(speed<normSpeed) {
            System.out.println("Если скорость равна "+speed+" км/ч можно есздить спокойно");
        }
        //Задача 4
        int agePeople=32;
        if (agePeople == 2 && agePeople < 6) {
            System.out.println("Если человеку "+agePeople+", то ему нужно ходить в детский сад");
        } else if(agePeople == 7 && agePeople < 17) {
            System.out.println("Если человеку " + agePeople + ", то ему нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople < 24) {
            System.out.println("Если человеку " + agePeople + ", то ему нужно ходить в университет");
        } else if (agePeople > 24) {
            System.out.println("Если человеку " + agePeople + ", то ему пора ходить на работу");
        }
        //задача 5
        int kid=17;
        if(kid<5) {
            System.out.println("Если возраст ребёнка равен "+kid+" нельзя кататься на атракционе");
        } else if(kid>5 && kid<14) {
            System.out.println("Если возраст ребёнка равен "+kid+", то можно кататься в сопровождении взрослого");
        } else if(kid>14){
            System.out.println("Если возраст ребёнка равен "+kid+", то можно кататься без сопровождения взрослого");
        }
         //Задача 6
        int peoples = 85;
        int train = 102;
        int seatTrain = 60;
        int stayTrain = train-seatTrain;
        if (peoples <= seatTrain) {
            System.out.println("Если в вагон хотят зайти "+peoples+" людей, то они могут занять сидячее место");
        } else if(peoples < stayTrain && peoples > seatTrain) {
            System.out.println("Если в вагон хотят зайти "+peoples+" людей, то они могут занять сидячие и стоячие места");
        } else if (peoples > train) {
            System.out.println("Если в вагон хотят зайти " + peoples + " людей, то не получится, так как вагон будет забит");
        }
        //Задача 7
        int one=4;
        int two=2;
        int three=1;
        if (one>two && one>three) {
            System.out.println("Самое большое число это "+one);
        } else if (two>three) {
            System.out.println("Самое большое число это "+two);
        } else if (three>two && three>one) {
            System.out.println("Самое большое число это "+three);
        }




    }
}