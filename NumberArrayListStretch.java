import java.util.ArrayList;

public class NumberArrayListStretch {

    public static void printIntegerArrayList(ArrayList<Integer> givenList) {

        System.out.println("The Integer ArrayList contains the following numbers:");
        System.out.println(givenList);
    }

    public static void numberSearch(Integer numberOne, Integer numberTwo, Integer numberThree, ArrayList<Integer> searchList) {
        ArrayList<Integer> mySearchList = new ArrayList<Integer>();
        for (Integer number : searchList) {
            if (number == numberOne) {
                System.out.println("The number " + numberOne + " is in the list");
            }
            if (number == numberTwo) {
                System.out.println("The number " + numberTwo + " is in the list");
            }
            if (number == numberThree) {
                System.out.println("The number " + numberThree + " is in the list");
            }
        }
    }
}
