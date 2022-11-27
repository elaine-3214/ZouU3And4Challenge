import java.util.Scanner;

public class PasswordClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");

        boolean random = true;

        while (random) {
            System.out.print("\nEnter your secure password: ");
            String password = scanner.nextLine();
            SecurePassword temp = new SecurePassword(password);
            System.out.println(temp.status());
            if (temp.isSecure()) {
                random = false;
            }
        }
        System.out.println("Password is secure");
    }
}

