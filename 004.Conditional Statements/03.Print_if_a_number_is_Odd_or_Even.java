import java.util.Scanner;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.err.println("Number is even");
        }
        else{
            System.err.println("Number is odd");
        }
        
    }
}
