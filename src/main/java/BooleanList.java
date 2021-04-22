import java.util.ArrayList;

public class BooleanList {
    public static void main(String[] args) {

        //Create a list that contains the following boolean values: true, false, false, true, false.
        // Loop through your list. Based on the value of each element,
        // print a message: - true: "Better bring an umbrella" - false: "No rain today, enjoy the sun!"

        ArrayList<Boolean> myRainForecast = new ArrayList<Boolean>();
        myRainForecast.add(true);
        myRainForecast.add(false);
        myRainForecast.add(false);
        myRainForecast.add(true);
        myRainForecast.add(false);

        for (Boolean rainYesNo : myRainForecast) {
            if (rainYesNo == false) {
                System.out.println("No rain today, enjoy the sun!");
            } else {
                System.out.println("Better bring an umbrella");
            }
        }
        System.out.println();
    }
}

