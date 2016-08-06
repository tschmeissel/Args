package com.objectmentor.utilities.args.tests;

import com.objectmentor.utilities.args.Args;
import com.objectmentor.utilities.args.ArgsException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by zaphod on 06.08.2016.
 */
public class ArgsTest extends TestCase {

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
    public void testOK() {
        ArgsException argsException = new ArgsException();
        assertEquals(argsException.getErrorCode(), ArgsException.ErrorCode.OK);
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

//        boolean logging = arg.getBoolean('l');
//        int port = arg.getInt('p');
//        String directory = arg.getString('d');
    }
}
