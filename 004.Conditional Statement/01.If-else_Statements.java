// # IF-Else Satements
// if(condtion){
// }
// else{
// }

//Example:
import java.util.Scanner;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.err.println("Allow To Vote");
        }
        else{
            System.err.println("Not Allowed");
        }
        
    }
}
