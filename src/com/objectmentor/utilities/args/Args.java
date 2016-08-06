package com.objectmentor.utilities.args;

import java.util.*;

import static com.objectmentor.utilities.args.ArgsException.ErrorCode.*;

public class Args {
    private Map<Character, ArgumentMarshaler> marshalers;
    private Set<Character> charsFound;
    private List<Iterator> currentArgument;

    public Args(String schema, String args[]) throws ArgsException {
        marshalers = new HashMap<Character, ArgumentMarshaler>();
        parseSchema(schema);

//        parseArgumentsList(Arrays.asList(args));
    }

    private void parseSchema(String schema) throws ArgsException {
        for (String element : schema.split(",")) {
            if (element.length() > 0) {
                parseSchemaElement(element);
            }
        }
    }

    private void parseSchemaElement(String element) throws ArgsException {
        char elementId = element.charAt(0);
        String elementTail = element.substring(1);
        validateSchemaElementId(elementId);
    }

    private void validateSchemaElementId(char elementId) throws ArgsException {
        if (!Character.isLetter(elementId)) {
            throw new ArgsException(INVALID_ARGUMENT_NAME, elementId, null);
        }
    }
}
