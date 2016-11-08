/**
 * Created by Miłosz Maciejewicz on 08/11/2016.
 */

package com.javafortesters.chap004testswithotherclassess.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration () {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void canConvertIntToHex () {
        assertEquals("hex 11 is b", "b", Integer.toHexString(11));
        assertEquals("hex 10 is a", "a", Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3", Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15", Integer.toHexString(21));

    }

    @Test
    public void confirmMaxAndMinIntSizes (){

        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("min value equals -2147483648", minimumInt, Integer.MIN_VALUE );
        assertEquals("max value equals 2147483647", maximumInt, Integer.MAX_VALUE);

    }


}
