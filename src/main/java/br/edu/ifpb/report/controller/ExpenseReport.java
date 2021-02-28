package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport {

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();
    
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.executeQuery(query);
    }

    public void convertFile() {
        System.out.println("Converting To XLS...");
    }

}
