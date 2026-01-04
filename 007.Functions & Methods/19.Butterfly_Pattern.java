// #Butterfly Pattern

// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *

public class JavaBasics {
    public static void fly(int n) {
        int total_number_of_lines = 2*n-1;
        int spaces = 2*n-2;
        int stars = 1;
        int current_numbers_of_lines = 1;
        while(current_numbers_of_lines <= total_number_of_lines) {
            for(int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            if(current_numbers_of_lines < n) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
            current_numbers_of_lines++;
        }
    }
    public static void main(String[] args) {
        fly(4);
    }
}
