import java.util.ArrayList;

public class Magic1 { 
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("elephant");
        System.out.println("====================Printing Animals====================");
        System.out.println(animals);
        animals.clear();
        System.out.println("====================After Clear Method====================");
        System.out.println("Empty Array : " + animals);
        if (animals.isEmpty()) {
            System.out.println("The animals list is now empty.");
        } else {
            System.out.println("The animals list is not empty.");
        }   
        animals.add("cheetah");
        animals.add("tiger");
        System.out.println("The size of array : "+animals.size());
        System.out.println("Adding New Animals: " + animals.add("kangaroo"));
        System.out.println("Updated Animals List: " + animals);
        animals.remove(2);
        System.out.println("After Removing Index 2: " + animals);
        System.out.println("Accessing Element at Index 1: " + animals.get(1));
        

    }
}
