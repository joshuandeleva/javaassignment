import java.util.Scanner;

public class Employees extends Personal {
    public static void main(String[] args) {

        String[] Items;
        int[] price;
        int totalAmount;
        Items = new String[5];
        price = new int[5];

        Scanner weka;
        weka = new Scanner(System.in);

        System.out.println("Enter the 1st Item you would like to purchase");
        Items[0] = weka.nextLine();
        System.out.println("COST: ");
        price[0] = weka.nextInt();

        System.out.println("Enter the 2nd Item you would like to purchase");
        Items[1] = weka.nextLine();
        System.out.println("COST: ");
        price[2] = weka.nextInt();

        System.out.println("Enter the 3rd Item you would like to purchase");
        Items[2] = weka.nextLine();
        System.out.println("COST: ");
        price[2] = weka.nextInt();

        System.out.println("Enter the 4th Item you would like to purchase");
        Items[3] = weka.nextLine();
        System.out.println("COST: ");
        price[3] = weka.nextInt();

        System.out.println("Enter the 5th Item you would like to purchase");
        Items[4] = weka.nextLine();
        System.out.println("COST: ");
        price[4] = weka.nextInt();

//Calculate the totalamount
        totalAmount = price[1] + price[2] + price[3] + price[4] + price[5];
        System.out.println("The total cost is " + totalAmount);

//Calculating the discount
        if (totalAmount >= 0 && totalAmount <= 1000) {
            System.out.println("The discount is 100");
        } else if (totalAmount >= 1001 && totalAmount <= 2000) {
            System.out.println("The discount is 200");
        } else if (totalAmount >= 2001 && totalAmount <= 3000) {
            System.out.println("The discount is 300");
        } else if (totalAmount >= 3001 && totalAmount <= 4000) {
            System.out.println("The discount is 400");
        } else if (totalAmount >= 4001 && totalAmount <= 5000) {
            System.out.println("The discount is 500");
        } else {
            System.out.println("Such prices have not being allocated discouts");
        }


    }

    }
