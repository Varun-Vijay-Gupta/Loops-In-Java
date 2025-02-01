/* concept ->
 * Armstrong number -> 153 = (1*1*1) + (5*5*5) + (3*3*3) (both should be equal)
 * initially sum = 0 and storing value given by user in temp (because it will change)
 * while loop -> n % 10 which will be last number i.e. 3
 *               cubing the value and storing it in sum
 *               n / 10 which will be 15 
 * repeat till n = 0 (condition for while loop)
 */

import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while(n != 0){
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n /= 10;
        }
        
        if(sum == n){
            System.out.println("Armstrong number.");
        }
        else{
            System.out.println("Not an Armstrong number.");
        }
    }
}
