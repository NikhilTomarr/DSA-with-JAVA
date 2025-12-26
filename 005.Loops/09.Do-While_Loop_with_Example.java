//#Do-While Loop: The Java do-while loop is a control structure that executes a block of code at least once before checking a given condition. It then continues to repeat the loop as long as the condition remains true. 

//Syntax:
//do {
// Code block to be executed
//} while (condition);

//Example:

public class JavaBasics{
    public static void main(String[] args){
        int counter = 1;
        do { 
         System.out.println("Hello, World! "); 
            counter++;  
        }while(counter <= 5);
    }
}
