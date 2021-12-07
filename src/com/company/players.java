package com.company;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class players implements com.company.Printable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public players(String name) {
        this.name = name;
    }


    @Override
    public void print(){
    }
}
