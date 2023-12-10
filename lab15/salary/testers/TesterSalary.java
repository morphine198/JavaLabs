package edu.lab15.salary.testers;

import edu.lab15.salary.*;

public class TesterSalary {
    public static void main(String[] args) {
        Employee model = new Employee("Greg", 1000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        System.out.println("\nUpdating...\n");
        controller.setEmployeeSalary(1500);
        controller.updateView();
    }
}