package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Miłosz Maciejewicz on 05/12/2016.
 */
public class SelectionsandDecisions {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url){
        return "http://" + url;

    }

    @Test
    public void catOrCats(){

        int numberOfCats = 1;

        assertEquals("1 == cat", "cat", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 0;
        assertEquals("0 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("2 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public void catOrCatsAsMethod(){

        assertEquals("1 == cat", "cat", catOrCats(1));
        assertEquals("0 == cats", "cats", catOrCats(0));
        assertEquals("2 == cats", "cats", catOrCats(2));
    }
    private String catOrCats (int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void truthyIf(){
        boolean truthy = true;

        if(truthy)
            assertTrue(truthy);

        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }
        else{
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void truthyIff(){
        boolean truthy = true;

        if(truthy)
            assertTrue(truthy);

        if(truthy)
            assertTrue(truthy);
            assertFalse(!truthy);
    }

    @Test
    public void truthyIfElse(){
        boolean truthy = true;

        if(truthy)
            assertTrue(truthy);

        else
            assertFalse(!truthy);
    }


    @Test
    public void truthyIfElseBraces(){
        boolean truthy = true;

        if(truthy){
            assertTrue(truthy);
        }
        else{
            assertFalse(!truthy);
        }
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }
        else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }


    @Test
    public void nestedOfNestedIfElse(){
        boolean truthy = true;
        boolean falsey = false;

        if(truthy){
            if(!falsey){
                if(truthy && !falsey){
                    if(falsey || truthy){
                        System.out.println("T | F");
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }
            else{
                System.out.println("F | T");
                assertTrue(truthy);
                assertFalse(falsey);
            }
        }else{
            if(!truthy){
                if(falsey){
                    System.out.println("F | F");
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("Sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch(title.toLowerCase()){
            case "sir": likelyGender ="M";
                break;
            case "mr": likelyGender = "M";
                break;
            case "master": likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;

        }
        return likelyGender;
    }

    @Test
    public void countrySwitch(){
        assertEquals("United Kingdom", countryOf("UK"));
        assertEquals("United States", countryOf("uS"));
        assertEquals("United States", countryOf("USA"));
        assertEquals("France", countryOf("FR"));
        assertEquals("Sweden", countryOf("SW"));
        assertEquals("Rest of World", countryOf("RW"));
        assertEquals("Rest of World", countryOf("TC"));
    }

    private String countryOf(String shortCode){

        String country;

        switch(shortCode.toUpperCase()){
            case "UK": country = "United Kingdom";
                break;
            case "US": country = "United States";
                break;
            case "USA": country = "United States";
                break;
            case "FR": country = "France";
                break;
            case "SW": country = "Sweden";
                break;
            default:
                country = "Rest of World";
                break;
        }
        return country;
    }

    @Test
    public void integerSwitch(){
        assertEquals("one", integerString(1));
        assertEquals("two", integerString(2));
        assertEquals("three", integerString(3));
        assertEquals("four", integerString(4));
        assertEquals("too big", integerString(5));
        assertEquals("too big", integerString(Integer.MAX_VALUE));
        assertEquals("too small", integerString(0));
        assertEquals("too small", integerString(Integer.MIN_VALUE));
    }

    private String integerString(int anInt){
        String valReturn = "";
        switch(anInt){
            case 1: valReturn = "one";
                break;
            case 2: valReturn = "two";
                break;
            case 3: valReturn = "three";
                break;
            case 4: valReturn = "four";
                break;
            default:
                if (anInt <1) {
                    valReturn = "too small";
                }
                if (anInt >4) {
                    valReturn = "too big";
                }
                break;
        }
    return valReturn;
    }





}