package Pro_Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int num = sc.nextInt();
        boolean isPrime = true;

        if (num<=1){
            isPrime = false;
        }
        else {
      //      for (int i = 2; i <= Math.sqrt(num); i++) // normally try dividing it by all numbers from 2 to num - 1.
                for (int i = 2; i < num; i++) {
                   if (num % i == 0) {
                    isPrime = false;
                    break;
                   }
                }
        }
        if (isPrime){
            System.out.println( num + " Number is Prime");
        }
        else {
            System.out.println( num  + " Number is not Prime");
        }
    }
}
