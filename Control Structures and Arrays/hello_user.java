import java.util.*;

public class hello_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter your lucky number: ");
        int lucky = sc.nextInt();
        System.out.println("Hello " + name + ", your lucky number is " + lucky + " shows that you are a person of great fortune!");
    }
}
