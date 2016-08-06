package com.objectmentor.utilities.args.tests;

import com.objectmentor.utilities.args.Args;
import com.objectmentor.utilities.args.ArgsException;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zaphod on 06.08.2016.
 */
public class ArgsTest {

//    public static void main(String[] args) {
//        try {
//            Args arg = new Args("l , p#, d*", args);
////            boolean logging = arg.getBoolean('l');
////            int port = arg.getInt('p');
////            String directory = arg.getString('d');
////            executeApplication(logging, port, directory);
//        } catch (ArgsException e) {
//            System.out.printf("Argument error: %s\n", e.errorMessage());
//        }
//    }

    @Test
    public void testArgsExceptionOk() {
        ArgsException argsException = new ArgsException();
        assertEquals(argsException.getErrorCode(), ArgsException.ErrorCode.OK);
    }

    @Test
    public void testInvalidArgumentFormat() {
        String[] args = {"true", "12", "Hello World"};
        try {
            Args arg = new Args("l& , p#, d*", args);
        } catch (ArgsException e) {
            assertTrue(e.getErrorCode() == ArgsException.ErrorCode.INVALID_ARGUMENT_FORMAT);
        }
    }

    @Test
    public void useCase() {
        String[] args = {"true", "12", "Hello World"};
        Args arg = null;
        try {
            arg = new Args("l , p#, d*", args);
        } catch (ArgsException e) {
            fail();
        }

        boolean logging = arg.getBoolean('l');
        int port = arg.getInt('p');
        String directory = arg.getString('d');
    }
}
