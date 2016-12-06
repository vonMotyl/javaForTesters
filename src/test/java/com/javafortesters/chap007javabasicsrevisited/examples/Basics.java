/**
 * Created by Miłosz Maciejewicz on 23/11/2016. SHITS REAL BRO
 */

package com.javafortesters.chap007javabasicsrevisited.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Basics {

    @Test
    public void aJavaDocComment(){
        assertTrue(addTwoNumbers(4,3)==7);
    }

    /**
     * Add two integers and return an int.
     *
     * There is a risk of overflow since two big integers would max out the return int.
     *
     * @param a is the first number to add
     * @param b is the second number to add
     * @return a+b as an int
     */

    private int addTwoNumbers(int a, int b) {
        return a+b;
    }




}
