package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.controller.Report;

public class TaxReport extends Report{

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    public void convertFile() {
        System.out.println("Converting To PDF...");
    }
}
