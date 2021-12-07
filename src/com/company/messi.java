package com.company;

public class messi extends players{
    private String argentina;

    public String getArgentina() {
        return argentina;
    }

    public void setArgentina(String argentina) {
        this.argentina = argentina;
    }

    public messi(String name, String argentina) {
        super(name);
        this.argentina = argentina;
    }
    public void print() {
        System.out.println(getName() + " " + "страна:" + " " + getArgentina());
    }
}
