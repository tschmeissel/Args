package com.objectmentor.utilities.args;

import java.util.*;

public class Args {
    private Map<Character, ArgumentMarshaler> marshalers;
    private Set<Character> charsFound;
    private List<Iterator> currentArgument;

    public Args(String schema, String args[]) throws ArgsException {
        marshalers = new HashMap<Character, ArgumentMarshaler>();
        parseSchema(schema);

//        parseArgumentsList(Arrays.asList(args));
    }

    private void parseSchema(String schema) {
        for (String element : schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element);
            }
        }
    }

    private void parseSchemaElement(String element) {
        
    }
}
