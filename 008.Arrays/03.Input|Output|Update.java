import  java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //Input
        marks[1] = sc.nextInt(); //Input
        marks[2] = sc.nextInt(); //Input

        System.out.println("phy:"+marks[0]); //Output
        System.out.println("chem:"+marks[1]); //Output
        System.out.println("math:"+marks[2]); //Output

        marks[2] = marks[2]+1; //Update
        marks[2] = 100; //Update

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("length of array:"+marks.length); 
    }
}
