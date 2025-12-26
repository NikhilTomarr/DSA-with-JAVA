//# Call by Value : In Java, when you pass primitive data types (like int, float, char, etc.) to a method, you are passing a copy of the value. This means that any changes made to the parameter inside the method do not affect the original value outside the method.

public class JavaBasics {
    public static void changeA(int a) {
        a = 10; // This change will not affect the original variable bcz 'a' is a copy of the value passed
    }
    public static void main(String[] args) {
        int a = 5;
        changeA(a);
        System.out.println(a);
    }
}
// Output: 5
