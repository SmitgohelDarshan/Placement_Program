#include <stdio.h>
#include <math.h>

void main() {
    int hour, minute;
    double hourAngle, minuteAngle, angle;

    printf("Enter hour: ");
    scanf("%d", &hour);

    printf("Enter minutes: ");
    scanf("%d", &minute);

    minuteAngle = minute * 6;               // 1 minute = 6 degrees
    hourAngle = (hour % 12) * 30 + minute * 0.5; // 1 hour = 30 degrees, 1 min = 0.5 degree

    angle = fabs(hourAngle - minuteAngle);

    if (angle > 180)
        angle = 360 - angle;

    printf("Angle between clock hands = %.2f degrees", angle);
}