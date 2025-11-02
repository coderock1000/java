import java.util.Scanner;

public class DescendToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Numbers from " + number + " to 0:");
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
