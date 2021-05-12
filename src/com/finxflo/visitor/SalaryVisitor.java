package com.finxflo.visitor;

import com.finxflo.Commission;
import com.finxflo.Mixed;
import com.finxflo.Regular;

public class SalaryVisitor implements Visitor<Double> {

    public Double visit(Regular regular) {
        return regular.getFixedSalary();
    }

    public Double visit(Commission commission) {
        return commission.getSales() * .10;
    }

    @Override
    public Double visit(Mixed mixed) {
        return (mixed.getSales() * .10) + mixed.getFixedSalary();
    }
}
