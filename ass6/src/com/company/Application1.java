package com.company;

public class Application1 {
    public static void main(String[] args) {
        Database1 foo = Database1.getInstance();
        foo.query("SELECT from ...");

        Database1 bar = Database1.getInstance();
        bar.query("SELECT");
    }
}
