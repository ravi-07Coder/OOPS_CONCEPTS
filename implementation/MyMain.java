package implementation;

import databean.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int n = scanner.nextInt();
        Employee[] mylist = new Employee[n];
        for (int i = 0; i < n; i++)
        {
            Employee employee = new Employee();
            System.out.println("enter the id");
            employee.setEmpid(scanner.nextInt());
            System.out.println("enter the salary");
            employee.setSalary(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("enter the name");
            employee.setName(scanner.nextLine());
            mylist[i] = employee;
        }
        System.out.println("list before any changes");
        System.out.println(Arrays.toString(mylist));
        System.out.println("enter the highest salary");
        Double higher = scanner.nextDouble();
        Employee[] emp = getEmployeeWithSalary(mylist, higher);
        System.out.println(Arrays.toString(emp));
    }//end of the main method

    public static Employee[] getEmployeeWithSalary(Employee[] list, Double higherSalary) {
        Scanner scanner = new Scanner(System.in);

        Employee[] result = list.clone();
        try {
            double error=higherSalary;
            double max = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i].getSalary() > max) {

                    max = list[i].getSalary();
                }
            }
            if (error>max)
            {
                throw new myexception("error");
            }
            System.out.println(max);
        } catch (myexception e) {
            System.out.println("error ->" + e.getMessage());
        }
        return result;
    }//end of the salary method
}//end of the class
