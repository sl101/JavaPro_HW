package de.telran.module2.practice_2023_12_11;

public class Book {
    private String author;
    private String title;
    private int issueYear;
    private Condition condition;
    private boolean isEBOOK;

    public Book(String author, String title, int issueYear, Condition condition, boolean isEBOOK) {
        this.author = author;
        this.title = title;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBOOK = isEBOOK;
    }
}