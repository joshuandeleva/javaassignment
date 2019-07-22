import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner chukua;
        chukua = new Scanner(System.in);

        String[] names, emailaddress;
        names = new String[10];
        emailaddress = new String[10];

        int[] phonenumbers, time;
        phonenumbers = new int[10];
        time = new int[10];
        for (int x = 0; x < 10; x++) {
            System.out.println("Enter the name of the employee");
            names[x] = chukua.next();
            System.out.println("Enter the email-address");
            emailaddress[x] = chukua.next();
            System.out.println("Enter the phone-number");
            phonenumbers[x] = chukua.nextInt();
            System.out.println("Enter the time you have worked in the company");
            time[x] = chukua.nextInt();

        }
        for (int x = 0; x < 10; x++) {
            System.out.println(names[0]);
            System.out.println(emailaddress[0]);
            System.out.println(phonenumbers[0]);
            System.out.println(time[0]);
        }

    }
}


