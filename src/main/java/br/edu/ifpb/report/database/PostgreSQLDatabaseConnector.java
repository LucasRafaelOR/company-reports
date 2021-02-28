package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements DatabaseConnector {

    public void createConnection() {
        System.out.println("Create postgres connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
