package com.finxflo;

import com.finxflo.visitor.Visitor;

public class Commission implements Employee {

    private final String name;
    private double sales;

    public double getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    Commission(String name, double sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
