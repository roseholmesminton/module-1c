import java.util.ArrayList;
import java.util.Arrays;

public class NumberArrayList {
    public static void main(String[] args) {

        //Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14, 5,
        // then: - determine whether each of the following values is an element in the list: 23, 77, 15 -
        // remove the following elements: 23, 922, 32, 6 -
        // again determine whether each of the following values is an element in the list: 23, 77, 15
        // (Stretch: create a method so that you don't need to duplicate this work.)

        ArrayList<Integer> myNumberList = new ArrayList<Integer>();
        myNumberList = new ArrayList<Integer>(Arrays.asList(1, 23, 9, 77, 922, 6, 32, 63, 14, 5));

        System.out.println("I just created an Integer ArrayList that contains the following numbers:");
        System.out.println(myNumberList);
        System.out.println();
        System.out.println("Checking to see if the numbers 23, 77 and 15 are in the list");

        if (myNumberList.contains(23)) {
            System.out.println("The number 23 is in the list");
        } else {
            System.out.println("The number 23 is not in the list");
        }
        if (myNumberList.contains(77)) {
            System.out.println("The number 77 is in the list");
        } else {
            System.out.println("The number 77 is not in the list");
        }
        if (myNumberList.contains(15)) {
            System.out.println("The number 15 is in the list");
        } else {
            System.out.println("The number 15 is not in the list");
        }

        myNumberList.remove(myNumberList.indexOf(23));
        myNumberList.remove(myNumberList.indexOf(922));
        myNumberList.remove(myNumberList.indexOf(32));
        myNumberList.remove(myNumberList.indexOf(6));

        System.out.println();
        System.out.println("I just removed the numbers 23, 922, 32 and 6 from the list");
        System.out.println(myNumberList);
        System.out.println();
        System.out.println("Checking again to see if 23, 77 and 15 are in the list");

        if (myNumberList.contains(23)) {
            System.out.println("The number 23 is in the list");
        } else {
            System.out.println("The number 23 is not in the list");
        }
        if (myNumberList.contains(77)) {
            System.out.println("The number 77 is in the list");
        } else {
            System.out.println("The number 77 is not in the list");
        }
        if (myNumberList.contains(15)) {
            System.out.println("The number 15 is in the list");
        } else {
            System.out.println("The number 15 is not in the list");
        }
    }
}

