package com.cognizant;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;;

public class ConnectionTest {

    ConnectionPool cp;

    @Before
    public void setup() {
        cp = new ConnectionPool(5);
    }

    @Test
    public void getLeaseCount(){
        int expected = 0;
        int actual = cp.getLeasedCount();

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void getLeaseCountWithOpenConnection(){
        int expected = 2;
        Connection c1 = cp.getConnection();
        Connection c2 = cp.getConnection();
        int actual = cp.getLeasedCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLeaseCountWithClose(){
        int expected = 3;
        Connection c1 = cp.getConnection();
        Connection c2 = cp.getConnection();
        Connection c3 = cp.getConnection();
        Connection c4 = cp.getConnection();
        cp.release(c4);
        int actual = cp.getLeasedCount();

        Assert.assertEquals(expected, actual);
    }
}
