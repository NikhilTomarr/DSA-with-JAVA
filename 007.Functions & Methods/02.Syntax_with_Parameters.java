//#Syntax with Parameters: 

// Syntax: 
// returnType name(type1 parameter1, type2 parameter2, ...) {
//    //body
//    return statement;
// }

// Example:
import java.util.Scanner;
public class JavaBasics {
    public static int calSum(int num1, int num2){ //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a,b); // Function Call with Arguments
        System.out.println("The sum is: " + sum);
    }
}
