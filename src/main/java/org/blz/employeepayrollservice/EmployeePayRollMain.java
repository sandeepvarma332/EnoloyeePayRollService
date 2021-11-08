package org.blz.employeepayrollservice;

public class EmployeePayRollMain {
    public static void main(String[] args) {
        EmployeePayRollService employeePayrollService = new EmployeePayRollService();
        System.out.println("Welcolme to employee payRoll");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}
