import java.util.ArrayList;

public class Particularlist {
    public static void main(String[] args) {
        System.out.println("===============Lambdas Example===============");
        ArrayList<String> name = new ArrayList<>();
        name.add("Rahul");
        name.add("Ankit");
        name.add("Sonia");
        name.add("Nadish");
        name.forEach((x) -> {
            System.out.println(x);
        });
        name.forEach(n -> {
            if (n.equals("Sonia"))
                System.out.println("Found Sonia");
        });
    }
}
