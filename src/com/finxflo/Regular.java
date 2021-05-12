package com.finxflo;

import com.finxflo.visitor.Visitor;

public class Regular implements Employee {

    private final String name;
    private final double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    public String getName() {
        return name;
    }

    Regular(String name, double fixedSalary) {
        this.name = name;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
