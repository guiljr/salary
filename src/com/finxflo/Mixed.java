package com.finxflo;

import com.finxflo.visitor.Visitor;

public class Mixed implements Employee {

    private final String name;
    private final double fixedSalary;
    private final double sales;

    public double getFixedSalary() {
        return fixedSalary;
    }

    public double getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    Mixed(String name, double fixedSalary, double sales) {
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.sales = sales;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
