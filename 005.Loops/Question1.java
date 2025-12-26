// Write a Java program to print "Weekday" or "Weekend". Use a switch statement.

import java.util.Scanner;
public class JavaBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1,2,3,4,5:{
                System.out.println("Weekday");
                break;
            }
            case 6,7:{
                System.out.println("Weekend");
                break;
            }
            default : {
                System.out.println("Invalid Input");
            }
        }

    }
}
