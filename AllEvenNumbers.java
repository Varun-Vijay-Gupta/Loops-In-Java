import java.util.Scanner;

public class AllEvenNumbers {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Print all even numbers till : ");
        int n = sc.nextInt();

        System.out.println("\nEven numbers from 1 to " + n + " are : ");

        for(int i = 1; i <= n; i++) {

            if((i % 2) == 0) {

                System.out.print(i + " ");

            }
        }
    }

}