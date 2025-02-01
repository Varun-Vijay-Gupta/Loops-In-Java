import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100: ");
        int n = sc.nextInt();
        int sum = n;
        int count = 0;
        

        do{
            n = sc.nextInt();
            sum = sum + n;
            count++;
        }
        while(n > 0);
        
        int outoff = count * 100;
        float marks = sum / count;
        System.out.println("Total marks is: "+sum+ " out of "+outoff);
        System.out.println("Average of marks is: "+marks);
        if(marks >= 90){
            System.out.println("This is good marks.");
        }
        else if(marks <= 89 && marks >= 60){
            System.out.println("This is averge marks.");
        }
        else{
            System.out.println("This is bad marks.");
        }


    }
}
