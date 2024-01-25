public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog" + dog);
        System.out.println("cat" + cat);
        System.out.println("paper" + paper);
        //Задача 2
       dog = dog + 4;
       cat = cat + 4;
       paper = paper + 4;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);
        //задача 3
       dog = dog - 3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);
        //Задача 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println("friend="+friend);
        friend=friend/7;
        System.out.println("friend="+friend);
        //Задача 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println("frog="+frog);
        frog=frog/3.5;
        System.out.println("frog="+frog);
        frog=frog+4;
        System.out.println("frog="+frog);
        //Задача 5
        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var amountWeight=firstBoxer+secondBoxer;
        var differenceWeight=secondBoxer-firstBoxer;
        System.out.println("amountWeight="+amountWeight);
        System.out.println("differenceWeight="+differenceWeight);
        //Задача 7
        differenceWeight=secondBoxer-firstBoxer;
        var percentWeight=(secondBoxer%firstBoxer);
        System.out.println("differenceWeight="+differenceWeight);
        System.out.println("percentWeight="+percentWeight);
        //Задача 8
        var allTime=640;
        var workPeople=allTime/8;
        System.out.println("Всего работников в компании "+workPeople+" человек");
        var mainPeople=80;
        var plusPeople=94;
        var allPeople=mainPeople+plusPeople;
        var time=8;
        var anotherTime=time*allPeople;
        System.out.print("Если в компании работает "+allPeople+" человек,то всего ");
        System.out.print(anotherTime+" часов работы может быть поделено между сотрудниками");

    }
}