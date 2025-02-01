/*concept ->
 * intially a = 0 and b = 1
 * then, adding a and b i.e. c = a + b
 * switching the values, i.e. a = b and b = c
 */

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        

        System.out.println("Fibonnaci series: ");
        for(int i = 1; i <= n; i++){
            System.out.println(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }

        
        
    }
}
