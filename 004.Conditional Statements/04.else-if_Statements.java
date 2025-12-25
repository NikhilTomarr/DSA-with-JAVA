// #Else-If Satements
// if(condtion1){
// }
// else if(condtion2){
// }
// else{
// }

// Example:
// income<5L     income btw 5-10L     income>10L
//  0% tax            20% tax           30% tax

import java.util.Scanner;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }else if(income>=500000&&income<1000000){
            tax=(int)(income*0.2);
        }else{
            tax=(int)(income*0.3);
        }
        System.err.println("your tax is :"+tax);
    }
}
