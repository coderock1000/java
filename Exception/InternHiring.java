import java.util.Scanner;

public class InternHiring {

    public static Candidate getCandidateDetails() throws InvalidTenthPercentageException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Candidate Name: ");
        String name = sc.next();

        System.out.print("Gender (M/F): ");
        String gender = sc.next();

        System.out.print("Enter percentage in tenth: ");
        int tenthPercentage = sc.nextInt();

        if (tenthPercentage < 50) {
            throw new InvalidTenthPercentageException("Tenth percentage must be at least 50%");
        }

        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setGender(gender);
        candidate.setTenthPercentage(tenthPercentage);

        sc.close();
        return candidate;
    }

    public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful for " + candidate.getName());
        } catch (InvalidTenthPercentageException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

 class Candidate {
    private String name;
    private String gender;
    private int tenthPercentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTenthPercentage() {
        return tenthPercentage;
    }

    public void setTenthPercentage(int tenthPercentage) {
        this.tenthPercentage = tenthPercentage;
    }
}

 class InvalidTenthPercentageException extends Exception {
    public InvalidTenthPercentageException(String message) {
        super(message);
    }
}
