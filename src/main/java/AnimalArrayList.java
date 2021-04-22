import java.util.ArrayList;

public class AnimalArrayList {
    public static void main(String[] args) {

//Create an ArrayList. Add five animals to your list. Print each animal in your list.

        ArrayList<String> myAnimals = new ArrayList<String>();
        myAnimals.add("Gazelle");
        myAnimals.add("Gecko");
        myAnimals.add("Giraffe");
        myAnimals.add("Goat");
        myAnimals.add("Gorilla");

        for(String animalList: myAnimals) {
        System.out.print(animalList + ", ");
    }
        System.out.println();
}
}
