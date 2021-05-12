package com.finxflo;

import com.finxflo.visitor.OutputVisitor;
import com.finxflo.visitor.SalaryVisitor;
import com.finxflo.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList();
    private double currentMonthSales;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public double getCurrentMonthSales() {
        return currentMonthSales;
    }

    public void setCurrentMonthSales(double currentMonthSales) {
        this.currentMonthSales = currentMonthSales;
    }

    public double totalSalaries() {
        double total = 0;
        Visitor visitor = new SalaryVisitor();
        for (Employee emp: employees) {
            total+= (double)emp.accept(visitor);
        }

        return total;
    }

    public void displayAttributes() {
        Visitor visitor = new OutputVisitor();

        for (Employee emp: employees) {
            System.out.println((String)emp.accept(visitor));
        }
    }
}
