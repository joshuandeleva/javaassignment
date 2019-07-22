import java.util.Scanner;

public class Personal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.println("Enter your username");
        username = input.nextLine();

        System.out.println("Enter your password");
        password = input.nextLine();

        if (username.equals("NDELEVA") && (password.equals("MWANGI"))) {
            System.out.println("Welcome MWANGI,So Glad you could join us");
        } else {
            System.out.println("Please try again..network error");
        }
    }
}