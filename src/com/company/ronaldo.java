package com.company;

public class ronaldo extends players{
    private String portugalia;

    public String getPortugalia() {
        return portugalia;
    }

    public void setPortugalia(String portugalia) {
        this.portugalia = portugalia;
    }

    public ronaldo(String name, String portugalia) {
        super(name);
        this.portugalia = portugalia;
    }
    public void print() {
        System.out.println(getName() + " " + "страна:" + " " + getPortugalia());
    }
}

