import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class exception {

    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above."
            );
        }

        System.out.println("Eligible to register.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input!");

        } finally {
            System.out.println("Program Finished.");
        }

        sc.close();
    }
}