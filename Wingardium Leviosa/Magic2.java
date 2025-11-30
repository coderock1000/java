import java.util.ArrayList;

public class Magic2 {
    public static void main(String[] args) {
        System.out.println("===============Lambdas Example===============");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);    
        numbers.add(30);
        numbers.add(40);
        numbers.forEach((x) -> {System.out.println(x);});
        numbers.forEach(n -> {if (n == 49)
            System.out.println("Found 49");
        });
    }
}
