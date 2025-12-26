//#Break Statement (to exit a loop)

public class JavaBasics {
    public static void main(String[] args) {
        // Using break statement to exit a loop
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println(i);
        }
        System.out.println("Loop exited.");
    }
}
