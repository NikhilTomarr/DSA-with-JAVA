//#Switch Statement : The switch statement in Java is used to execute one block of code among multiple options

// switch (variable) {
//     case 1:
//         // Code block to execute if expression equals value1
//         break; // Exits the switch block
//     case value2:
//         // Code block to execute if expression equals value2
//         break;
//     // ... more cases ...
//     default:
//         // Code block to execute if none of the cases match
// }

// Example of switch statement in Java:
public class JavaBasics{
    public static void main(String[] args) {
        int day = 4; 
        String dayType;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is a " + dayType);
    }
}
