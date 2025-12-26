import java.util.Scanner;
public class JavaBasics{

    private static boolean isPrime;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println(n+" is prime");
        }else{
            boolean isPrime = true;

            // for(int i=2; i<=n-1; i++){ // brute force way
            //     if(n%i==0){
            //         isPrime = false;
            //         break;
            //     }
            // }

            for(int i=2; i<=Math.sqrt(n); i++){ // optimized way
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        if(isPrime == true){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }
}           
}
