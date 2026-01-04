// #How to Solve Any Pattern Problem

// -> Count the number of lines
// -> Count the number of Stars and Spaces in first line
// -> Find how stars and spaces are changing

//Example Pattern:

//     *
//    **
//   ***
//  ****
// *****

public class JavaBasics {
    public static void pattern(int n) {
        int total_number_of_lines = n;
        int spaces = n - 1;
        int stars = 1;
        int current_numbers_of_lines = 1;
        while(current_numbers_of_lines <= total_number_of_lines) {
            //Spaces
            for(int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            current_numbers_of_lines++;
            spaces--;
            stars++;
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
