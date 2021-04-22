import java.util.ArrayList;
import java.util.Arrays;

public class NumberArrayListStretchApp {
    public static void main(String[] args) {

        //Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14, 5,
        // then: - determine whether each of the following values is an element in the list: 23, 77, 15 -
        // remove the following elements: 23, 922, 32, 6 -
        // again determine whether each of the following values is an element in the list: 23, 77, 15
        // (Stretch: create a method so that you don't need to duplicate this work.)

        int comparisonNumber = 0;

        ArrayList<Integer> myNumberList = new ArrayList<Integer>(Arrays.asList(1,23,9,77,922,6,32,63,14,5));

        NumberArrayListStretch.printIntegerArrayList(myNumberList);

        System.out.println("Conducting a search on the ArrayList for the following numbers: 23, 77 and 15");

        NumberArrayListStretch.numberSearch(23, 77, 15, myNumberList);

        myNumberList.remove(myNumberList.indexOf(23));
        myNumberList.remove(myNumberList.indexOf(922));
        myNumberList.remove(myNumberList.indexOf(32));
        myNumberList.remove(myNumberList.indexOf(6));

        System.out.println();
        System.out.println("I just removed the numbers 23, 922, 32 and 6 from the list");
        System.out.println();
        System.out.println("Here's my new list:");
        System.out.println(myNumberList);
        System.out.println("Checking again to see if 23, 77 and 15 are in the list");
        NumberArrayListStretch.numberSearch(23, 77, 15, myNumberList);
    }

}
