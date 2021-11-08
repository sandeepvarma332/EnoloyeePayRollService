package org.blz.employeepayrollservice;

public class EmployeePayRollMain {
    public static void main(String[] args) {
        EmployeePayRollService employeePayrollService = new EmployeePayRollService();
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}
