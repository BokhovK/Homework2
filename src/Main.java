import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      // Task 1
        System.out.println("Task 1 & Task 2");
        int [] num = new int [3];
        num [1] = 1;
        for ( int i = 1; i <= 3; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        double [] numb = {1.57, 7.654, 9.986};
        System.out.print(numb[0]+" ");
        System.out.print(numb[1]+" ");
        System.out.print(numb[2]+" ");
        System.out.println(" ");
        int [] number = new int [50];
        number [0] = 10;
        for ( int b = 10; b <=50; b++) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
        //Task 3
        System.out.println("Task 3");
        int [] numa = new int [3];
        numa [1] = 3;
        for ( int i = 3; i >= 1; i-- ) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        double [] numba = {1.57, 7.654, 9.986};
        System.out.print(numba[2]+" ");
        System.out.print(numba[1]+" ");
        System.out.print(numba[0]+" ");
        System.out.println(" ");
        int [] numbera = new int [50];
        numbera [0] = 10;
        for ( int b = 50; b >=10; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
        //Task 4
        System.out.println("Task 4");
        int [] arrNumc = {1,2,3};
       for( int c=0; c < arrNumc.length; c++) {
           if (arrNumc[c] % 2 != 0) {
               arrNumc[c] += 1;
           }
       }
        System.out.println(Arrays.toString(arrNumc));
    }
}