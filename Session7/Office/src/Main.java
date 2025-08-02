import Employee.Employee;

import Employee.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            Employee emp = new Employee();
            emp.save(); // گرفتن اطلاعات
            employees.add(emp); // ذخیره در لیست

            System.out.print("Do you want to add another employee? (yes/no): ");
            String answer = scan.nextLine().trim().toLowerCase();

            if (!answer.equals("yes")) {
                break;
            }
        }

        System.out.println("\n--- All Employees ---");
        for (Employee e : employees) {
            e.showInfo();
            System.out.println("---------------------");
        }
    }
}
