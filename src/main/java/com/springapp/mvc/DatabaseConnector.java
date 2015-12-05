package com.springapp.mvc;

/**
 * Created by Lily on 01/12/2015.
 *//*
        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

public class DatabaseConnector {

    private DatabaseConnector databaseConnector = null;
    private Connection conn;

    private DatabaseConnector() {

    }

    public DatabaseConnector GetInstace() {
        if (this.databaseConnector == null){
            this.databaseConnector = new DatabaseConnector();
        }
        return this.databaseConnector;
    }

    public void Connect(){
        //Connect with connection string to Port
    }

    public void ExecQuery(String Query){
        //Execute Query without expecting Return values like Update, Insert,
    }

    public ResultSet GetResults(String Query){
        //Returns Results from a SELECT QUERY
        ResultSet result = null;
        Statement statement = new conn.createStatement();
        try {

            result = statement.executeQuery(Query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
            //Catch this from server side and notufy User
        }
        return result;
    }
}*/