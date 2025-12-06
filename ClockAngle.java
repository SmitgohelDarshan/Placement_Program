import java.util.Scanner;

public class ClockAngle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minute = sc.nextInt();

        double minuteAngle = minute * 6;                    // 1 minute = 6 degrees
        double hourAngle = (hour % 12) * 30 + minute * 0.5; // 1 hour = 30 degrees, 1 minute = 0.5 degree

        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180)
            angle = 360 - angle;

        System.out.println("Angle between clock hands = " + angle + " degrees");

        sc.close();
    }
}