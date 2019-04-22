package com.cognizant.basic;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class BasicClassTests {
    BasicClass bc;
    @Before
    public void setup(){
        bc = new BasicClass();
    }

    @Test
    public void multiplyBy2_positiveNumber(){
        int expected = 16;
        int actual = bc.multiplyBy2(8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void capEachWord() {
        String paramS = "smith is A computer engineer";
        String expected = "Smith Is A Computer Engineer";

        String actual = bc.capitalizeEachWord(paramS);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sayHelloTest() {
        String paramName = "Smith";
        String expected = "Hello, " + paramName;

        String actual = bc.sayHello(paramName);

        Assert.assertEquals(expected, actual);
    }

        @Test
        public void sayHelloTestNull() {
            String paramName = null;
        String expected = "Hello, World!";

        String actual = bc.sayHello(paramName);

        Assert.assertEquals(expected, actual);


    }
}
