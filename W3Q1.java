import java.util.Scanner;

class W3Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        input.close();
    }
}