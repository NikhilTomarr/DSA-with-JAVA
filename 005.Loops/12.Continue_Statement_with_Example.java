//#Continue Statement(to skip an iteration)

//Syntax:
//for(int i=0; i<=5; i++){ 
// if(i==3){
//   continue;
// }
// System.out.println(i);}

//Output: 0 1 2 4 5


//Example: Display numbers except those which are multiple of 10
import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        do{
            System.out.print("Enter number:");
            int number = sc.nextInt();
            if (number%10==0) {
                continue;
            }
            
        System.out.println("Number is: " + number);
        }while(true);
    }
}
