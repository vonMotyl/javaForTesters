package com.javafortesters.chap007basicsofjavarevisited.examples;


/**
 * Created by Miłosz Maciejewicz on 23/11/2016.
 */

/**

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class AnEmptyClass {

}

public class ClassExample {

    public static final String CONSTANT = "a constant string";
    public static String aClassField = "a class field";
    protected static String proField = "a class field";
    public String pubField = "a public field";
    private String privField = "a private field";
    private String name;

    public ClassExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ClassExample instance = new ClassExample("bob");

    @Test
    public void variableNaming() {
        String $aString = "bob";
        float Łowed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A0123456789bCd$f = "ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, Łowed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }

    public static final String CONSTANT = "a constant string";

    public static String aClassField = "a class field";

    assertEquals(ClassExample.aClassField, "a class field");

    instance.aClassField ="changed";

    public String pubField = "a public field";

    assertEquals(instance.pubField, "a public field");

    instance.pubField ="amended public field";

    assertEquals(instance.pubField, "amended public field");


    @org.junit.Test
    public void nonImportTest() {
        org.junit.Assert.assertEquals(3, 2 + 1);
    }

    import com.javafortesters.domainentities.User;
    import static com.javafortesters.chap003myfirsttest.examples.*;


    assertEquals(5,3,2)
}
//Data Types


//Boolean Type


    */






