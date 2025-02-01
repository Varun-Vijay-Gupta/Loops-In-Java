/* concept -> 
 intially ans = 0
 if n divide by i gives remainder 0, then ans = ans + 1
 else ans = 0,
 if ans = 0, that means the n is not perfecty divided by the numbers, hence the n is a prime number..*/

import java.util.Scanner;
public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int ans = 0;

        
        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                ans++;
            }
        }
        if(ans == 0 && n != 1 && n != 0){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not Prime number.");
        }
        
    }
}
