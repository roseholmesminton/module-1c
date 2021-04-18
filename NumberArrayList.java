import java.util.ArrayList;

public class NumberArrayList {
    public static void main(String[] args) {
        int comparisonNumber = 0;


        //Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14, 5,
        // then: - determine whether each of the following values is an element in the list: 23, 77, 15 -
        // remove the following elements: 23, 922, 32, 6 -
        // again determine whether each of the following values is an element in the list: 23, 77, 15
        // (Stretch: create a method so that you don't need to duplicate this work.)

        ArrayList<Integer> myNumberList = new ArrayList<Integer>();
        myNumberList.add(1);
        myNumberList.add(23);
        myNumberList.add(9);
        myNumberList.add(77);
        myNumberList.add(922);
        myNumberList.add(6);
        myNumberList.add(32);
        myNumberList.add(63);
        myNumberList.add(14);
        myNumberList.add(5);

        System.out.println("I just created an Integer ArrayList that contains the following numbers:");
        for (Integer numberList : myNumberList) ;
        {
            System.out.print(myNumberList + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Checking to see if the numbers 23, 77 and 15 are in the list");

        for (Integer numberList : myNumberList) {
            if (numberList == 23) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 23) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 23 is not in the list");
        }
        for (Integer numberList : myNumberList) {
            if (numberList == 77) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 77) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 77 is not in the list");
        }
        for (Integer numberList : myNumberList) {
            if (numberList == 15) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 15) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 15 is not in the list");
        }

        myNumberList.remove(myNumberList.indexOf(23));
        myNumberList.remove(myNumberList.indexOf(922));
        myNumberList.remove(myNumberList.indexOf(32));
        myNumberList.remove(myNumberList.indexOf(6));

        System.out.println();
        System.out.println("I just removed the numbers 23, 922, 32 and 6 from the list");
        System.out.println();
        System.out.println("Checking again to see if 23, 77 and 15 are in the list");

        for (Integer numberList : myNumberList) {
            if (numberList == 23) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 23) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 23 is not in the list");
        }
        for (Integer numberList : myNumberList) {
            if (numberList == 77) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 77) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 77 is not in the list");
        }
        for (Integer numberList : myNumberList) {
            if (numberList == 15) {
                comparisonNumber = numberList;
            }
        }
        if (comparisonNumber == 15) {
            System.out.println("The number " + comparisonNumber + " is in the list");
        } else {
            System.out.println("The number 15 is not in the list");
        }
    }
}

