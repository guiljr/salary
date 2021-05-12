package com.finxflo;

import com.finxflo.visitor.Visitor;

public interface Employee {

    Object accept(Visitor visitor);
}
