import java.util.Scanner;

public class Javagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick up first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Pick up last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Pick up age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Pick up username: ");
        String username = scanner.nextLine().trim();


        System.out.println("First name:\t" + firstName);
        System.out.println("Last name:\t" + lastName);
        System.out.println("Age:\t" + age);
        System.out.println("Username:\t" + username);
    }
}
