/**
 * Created by Miłosz Maciejewicz on 09/11/2016.
 */
package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.junit.Test;


import static com.javafortesters.domainobject.TestAppEnv.DOMAIN;
import static com.javafortesters.domainobject.TestAppEnv.PORT;
import static com.javafortesters.domainobject.TestAppEnv.getUrl;
import static org.junit.Assert.assertEquals;




public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", getUrl());

    }

    @Test
    public void canGetDomainAndPortStatically(){

        assertEquals("Just the Domain", "192.123.0.3", DOMAIN);

        assertEquals("Just the Port", "67", PORT);
    }

}
