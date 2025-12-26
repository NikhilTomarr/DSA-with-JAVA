// Check if a year is a leap year

import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
