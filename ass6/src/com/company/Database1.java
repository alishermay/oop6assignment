package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class Database1 {
    private static Database1 instance;
    Connection c = null;
    Statement stmt = null;


    public static Database1 getInstance(){
        if (Database1.instance == null){
            acquireThreadLock();
            if (Database1.instance == null) {
                Database1.instance = new Database1();
            }
        }
        return Database1.instance;
    }

    public void query(String sql){

        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/assignment 4",
                "postgres", "1724");
        c.setAutoCommit(false);

        stmt = c.createStatement();
        String sql1 = sql;

        stmt.executeUpdate(sql1);

        stmt.close();
        c.commit();
        c.close();
    }
}
