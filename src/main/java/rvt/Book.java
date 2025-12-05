package rvt;

public class Book {
    private String name;
    private int year;
    private int pages;

    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.pages + "pages , " + this.year;
    }
}
