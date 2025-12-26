//Time Conversion from GMT to IST

import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        //GMT->IST
        hour += 5;
        minute += 30;
        if (minute >= 60) {
            minute -= 60;
            hour ++;
        }
        if (hour >= 24) {
            hour -= 24;
            day ++;
        }
        System.out.println(day + " " + hour + " " + minute);
        
    }
}
