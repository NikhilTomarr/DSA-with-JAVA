//#Nested Loops: A nested loop in Java is a loop statement placed inside the body of another loop statement

// Example: Print the following pattern using nested loops
// * 
// * * 
// * * * 
// * * * * 

public class JavaBasics{
    public static void main(String[] args){
        for(int line = 1; line<=4; line++){
            for(int star =1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
