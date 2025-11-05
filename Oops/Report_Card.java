import java.util.Scanner;

public class Report_Card {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { // ✅ Auto-closes scanner

            // Input section
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter semester: ");
            String semester = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            String[] subjects = new String[n];
            int[] marks = new int[n];
            int total = 0;

            sc.nextLine(); // clear buffer
            for (int i = 0; i < n; i++) {
                System.out.print("Enter subject " + (i + 1) + " name: ");
                subjects[i] = sc.nextLine();

                System.out.print("Enter marks for " + subjects[i] + ": ");
                marks[i] = sc.nextInt();
                sc.nextLine(); // clear buffer

                total += marks[i];
            }

            // Calculations
            double average = (double) total / n;
            char grade;

            if (average >= 90)
                grade = 'A';
            else if (average >= 80)
                grade = 'B';
            else if (average >= 70)
                grade = 'C';
            else if (average >= 60)
                grade = 'D';
            else
                grade = 'F';

            // Output section
            System.out.println("\n----- REPORT CARD -----");
            System.out.println("Name: " + name);
            System.out.println("Semester: " + semester);
            System.out.println("-----------------------");
            System.out.println("Subject\t\tMarks");
            for (int i = 0; i < n; i++) {
                System.out.println(subjects[i] + "\t\t" + marks[i]);
            }
            System.out.println("-----------------------");
            System.out.println("Total Marks: " + total);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
            System.out.println("-----------------------");
        }
    }
}
