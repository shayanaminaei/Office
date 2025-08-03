import person.employee.*;
import person.client.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Add New Person ---");
            System.out.println("1. Employee");
            System.out.println("2. Client");
            System.out.print("Choose type: ");
            int type = Integer.parseInt(scan.nextLine());

            Person person = null;

            if (type == 1) {
                System.out.println("1. Office");
                System.out.println("2. Finance");
                System.out.println("3. Finance & Cashier");
                System.out.print("Choose employee type: ");
                int empType = Integer.parseInt(scan.nextLine());

                switch (empType) {
                    case 1 -> person = new Office();
                    case 2 -> person = new Finance();
                    case 3 -> person = new FinanceAndCashier();
                    default -> System.out.println("Invalid option!");
                }

            } else if (type == 2) {
                System.out.println("1. Retail");
                System.out.println("2. Wholesale");
                System.out.print("Choose client type: ");
                int cliType = Integer.parseInt(scan.nextLine());

                switch (cliType) {
                    case 1 -> person = new Retail();
                    case 2 -> person = new Wholesale();
                    default -> System.out.println("Invalid option!");
                }
            } else {
                System.out.println("Invalid type!");
            }

            if (person != null) {
                person.save();
                people.add(person);
            }

            System.out.print("Do you want to add another person? (yes/no): ");
            String answer = scan.nextLine().trim().toLowerCase();
            if (!answer.equals("yes")) break;
        }

        System.out.println("\n--- All People ---");
        for (Person p : people) {
            p.showInfo();
            System.out.println("-------------------");
        }
    }
}
