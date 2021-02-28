package br.edu.ifpb.report.controller;

public class Report
{
    public void generate() {
        createDatabaseConnection();
        executeDatabaseQuery();
        convertFile();
    }

    public abstract void createDatabaseConnection();
    public abstract void executeDatabaseQuery();
    public abstract void convertFile();
}