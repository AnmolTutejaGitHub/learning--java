//In this challenge, we're going to create a method, that takes time, represented in seconds, as the parameter.
// We'll then want to transform the seconds into hours. 
// Next we'll display the time in hours, with the remaining minutes and seconds, in a String.
// We'll do this transformation in two steps, which allows us to use overloaded methods.
// We want to create two methods with the same name:  getDurationString
// The first method has one parameter of type int, named seconds.
// The second method has two parameters, named minutes and seconds, both ints.
// Both methods return a String in the format shown:‘XXh YYm ZZs’where XX represents the number of hours,
// YY the number of minutes, and ZZ the number of seconds.
// The first method should in turn call the second method to return its results.

// Make both methods public and static .
// Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.
// Start by creating a new project, and call it SecondsAndMinutesChallenge.

//Add validation to the methods as a bonus:
// For the first method, the seconds parameter should be  >= 0.
// For the second method, the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59.
// If either method is passed an invalid value, print out some type of meaningful message to the user.

public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945)); // 1h 5m 45s
        System.out.println(getDurationString(65, 45)); // 1h 5m 45s
    }

    public static String getDurationString(int seconds) {
        return "" + getDurationString(0, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        // int hours = (minutes) / 60 + (seconds / 3600);

        // return "" + hours + "h " + minutes % 60 + "m " + seconds % 3600 + "s";

        // 1) I converted say x min y sec
        // 2) y se kitne proper minutes baan sakte hai and added these extra minutes to
        // given minutes--> minutes += seconds / 60;

        // 3) new y kitna hua --> seconds = seconds % 60;
        // 4) new x (total minutes) to hours
        // 5) bachhe hue minutes that haven't converted to hours

        minutes += seconds / 60;
        seconds = seconds % 60;

        int hours = (minutes / 60);
        minutes = minutes % 60;
        // int minutes = minutes / 60;
        // seconds = seconds / 3600;
        return "" + hours + "h " + minutes + "m " + seconds + "s";
    }

}
