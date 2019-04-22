package com.cognizant;

public class Connection implements AutoCloseable{

    private int id;
    boolean leased = false;

    public Connection(int i){
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLeased() {
        return leased;
    }

    public void setLeased(boolean leased) {
        this.leased = leased;
    }

//    public int runQuery(String x) {
//        return 0;
//    }

    @Override
    public void close() {
        leased = false;
    }

}
