package com.company;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Mbappe extends players{
    private String france;

    public String getFrance() {
        return france;
    }

    public void setFrance(String france) {
        this.france = france;
    }

    public Mbappe(String name, String france) {
        super(name);
        this.france = france;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getName() + " " + "страна" + " " + getFrance());
    }
}
