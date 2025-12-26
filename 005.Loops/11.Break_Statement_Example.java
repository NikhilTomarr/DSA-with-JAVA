//# keep entering numbers till user enters a multiple of 10

import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        do{
            System.out.println("Enter number:");
            int number = sc.nextInt();
            if (number%10==0) {
                break; 
            }
            
        System.out.println(number);
        }while(true);
    }
}
