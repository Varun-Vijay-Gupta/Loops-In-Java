import java.util.Scanner;

public class Input_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int sum = n;
        for(int i = 0; n > 0; i++){
            n = sc.nextInt();
            sum = sum + n;
        }
        System.out.println("The sum of all numbers are: "+sum);
    }
}
