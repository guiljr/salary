package com.finxflo;

import com.finxflo.visitor.SalaryVisitor;

public class Application {

    public static void main(String[] args) {

        Company company = new Company();

        Employee ben = new Regular("ben", 5000);
        Employee john = new Mixed("john", 5000, 20000);
        Employee jim = new Commission("jim", 30000);
        company.getEmployees().add(ben);
        company.getEmployees().add(john);
        company.getEmployees().add(jim);

        System.out.println("Total salaries: " + company.totalSalaries());
        company.displayAttributes();

    }
}
