package com.mycompany.app;

public class B {
    String title;
    String author;
    int numPages;
    public B() { } ; // default constructor
    
    public B(String t, String a, int p) {
    title = t;
    author = a;
    numPages = p;
    }
    public void inkq(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.numPages);
    }
}
