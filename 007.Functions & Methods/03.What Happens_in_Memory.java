//# What Happens in Memory?

// |                |
// |                |
// |----------------|
// | sum            |
// |           int  |
// |----------------|
// | main           |<- stack frame
// |       String   |
// |________________|
//           call stack

// In the code below, we have a simple Java program that defines a method to sum two integers and prints the result.
public class JavaBasics {
    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
    }
}
