import java.util.Scanner;

public class Fact {
    // Attribute
    private int n;

    // Constructor
    public Fact(int n) {
        this.n = n;
    }

    // Method to calculate factorial
    public long factorial() {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Create an instance of Fact
        Fact fact = new Fact(number);

        // Calculate and display the factorial
        System.out.println("Factorial of " + number + " is: " + fact.factorial());
    }
}

