import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      // Task 1
        System.out.println("Task 1");
        int [] num1 = new int[3];
        for (int i = 0; i < num1.length; i++) {
            num1[i]=i+1;
        }
        double [] num2 = {1.57, 7.654, 9.986};
        boolean num3 [] = new boolean[]{false, true} ;
        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
            if (i < num1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]);
            if (i < num2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i]);
            if (i < num3.length - 1) {
                System.out.print(", ");
            }
        }
        //Task 3
        System.out.println("Task 3");
        for (int i = num1.length - 1; i>=0; i--) {
            System.out.print(num1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = num2.length - 1; i>=0; i--) {
            System.out.print(num2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = num3.length - 1; i>=0; i--) {
            System.out.print(num3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        //Task 4
        System.out.println("Task 4");
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] % 2 == 1) {
                num1[i] = i++;
                System.out.println(Arrays.toString(num1));
            }
        }

    }
}