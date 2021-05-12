package com.finxflo.visitor;

import com.finxflo.Commission;
import com.finxflo.Mixed;
import com.finxflo.Regular;

public interface Visitor<T> {

    T visit(Regular regular);
    T visit(Commission commission);
    T visit(Mixed mixed);
}
