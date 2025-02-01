/*
 * Concept ->
 * intially sum = 0
 * finding remainder, n % 10
 * adding it to sum with sum * 10 (for reversing the number)
 * dividing the number. n / 10 (for reducing the number)
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;

        }
        System.out.println("Palindrome: "+sum);
    }
}
