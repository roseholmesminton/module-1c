import java.util.ArrayList;

public class NumberArrayListStretch {

    public static void printIntegerArrayList(ArrayList<Integer> givenList) {

        System.out.println("The Integer ArrayList contains the following numbers:");
        System.out.println(givenList);
    }

    public static void numberSearch(Integer numberOne, Integer numberTwo, Integer numberThree, ArrayList<Integer> searchList) {
        if (searchList.contains(numberOne)) {
            System.out.println("The number " + numberOne + " is in the list");
        } else {
            System.out.println("The number " + numberOne + " is not in the list");
        }
        if (searchList.contains(numberTwo)) {
            System.out.println("The number " + numberTwo + " is in the list");
        } else {
            System.out.println("The number " + numberTwo + " is not in the list");
        }
        if (searchList.contains(numberThree)) {
            System.out.println("The number " + numberThree + " is in the list");
        } else {
            System.out.println("The number " + numberThree + " is not in the list");
        }
    }
}
