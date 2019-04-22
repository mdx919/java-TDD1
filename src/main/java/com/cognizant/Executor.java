package com.cognizant;

public class Executor {

    public static void main(String[] args){

        ConnectionPool pool = new ConnectionPool(5);
        try(Connection connection = pool.getConnection()) {
//            throw new RuntimeException("Kaboom!");
        }

        System.out.println(pool.getLeasedCount());
        Connection c1 = pool.getConnection();
        Connection c2 = pool.getConnection();
        Connection c3 = pool.getConnection();
        System.out.println(pool.getLeasedCount());
    }
}
