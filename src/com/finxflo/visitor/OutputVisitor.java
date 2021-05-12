package com.finxflo.visitor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.finxflo.Commission;
import com.finxflo.Mixed;
import com.finxflo.Regular;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class OutputVisitor implements Visitor<String> {

    @Override
    public String visit(Regular regular) {
        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(regular);
            return json;
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String visit(Commission commission){
        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(commission);
            return json;
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String visit(Mixed mixed) {
        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(mixed);
            return json;
        } catch (Exception e) {
            return "";
        }
    }
}
