public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = (year % 400 == 0) ? "Leap Year" 
                       : (year % 100 == 0) ? "Not a Leap Year" 
                       : (year % 4 == 0) ? "Leap Year" 
                       : "Not a Leap Year";

        System.out.println(result);
    }
}
