/*
Program that display the current time in GMT(Greenwich Mean Time) in the hour:minute:second, such as 13:19:8.

The currentTimeMilli is method in the System class returns the current time in milliseconds
elapsed since midnight, January 1, 1970 GMT. This time is known as the UNIX epoch.
The epoch is the point when time starts, and 1970 was the year when the UNIX operating
system was formally introduced.

The System.currentTimeMillis() returns the number of milliseconds since the UNIX epoch.
 */
public class ShowCurrentTime {
    public static void main(String [] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970.
        long totalMilliseconds= System.currentTimeMillis();

        //Obtain the total seconds since midnight, Jan 1, 1970.
        long totalSeconds= totalMilliseconds/ 1000;

        //Compute the current second in the minute in the hour
        long currentSecond= totalSeconds/60;

        //Obtain the total minutes
        long totalMinutes= totalSeconds/60;

        //Compute the current minute in the hour
        long currentMinute= totalMinutes % 60;

        //Obtain the total hours
        long totalHours= totalMinutes/60;

        //Compute the current hour
        long currentHour= totalHours % 24;

        // Display results
        System.out.println("Current time is "+ currentHour +":" + currentMinute+":"+ currentSecond+" GMT");
    }
}
