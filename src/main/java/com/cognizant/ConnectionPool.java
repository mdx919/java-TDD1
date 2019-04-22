package com.cognizant;
import java.util.*;

public class ConnectionPool {

    List<Connection> pool = new ArrayList<>();

    public ConnectionPool(int poolSize){
        for(int i = 0; i < poolSize; i++){
            Connection c = new Connection(i);
            pool.add(c);
        }
    }

//    public Connection createConnection() {
//
////        for(Connection c : pool){
////            if(!c.isLeased()){
////                c.setLeased(true);
////                return c;
////            }
////        }
////        return null;
////
////        new ConnectionPool(5);
////        return pool;
//    }

    public int getLeasedCount() {
        int i = 0;
        for(Connection c : pool){
            if(c.isLeased()){
                i++;
            }
        }
        return i;
    }

    public Connection getConnection() {
        for(Connection c : pool){
            if(!c.leased){
                c.setLeased(true);
                pool.set(c.getId(), c);
                return c;
            }
        }
        return null;
    }

    public void release(Connection c) {
        c.close();
//        pool.add(c.getId(), c);
    }
}
