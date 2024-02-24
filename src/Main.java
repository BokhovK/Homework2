import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
      String firstName = "Ivanov";
      String middleName = "Ivan";
      String lastName = "Ivanovich";
      String word = " ";
      String fullName = firstName + word + middleName + word + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        //Task 2
        System.out.println("Task 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName1);
        //Task 3
        System.out.println("Task 3");
        String surname = "Иванов";
        String name1 = "Семён";
        String fathName = "Семёнович";
        String fullName2 = surname + word + name1 + word + fathName;
        fullName2 = fullName2.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника — "+ fullName2);
    }
}
