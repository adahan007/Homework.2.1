package com.company;

public class Main {

    public static void main(String[] args) {
        creatObject("ronaldo");
        Printable[] players = {
                creatObject("ronaldo"), creatObject("messi"), creatObject("Mbappe")};
        for (int i = 0; i < players.length; i++) {
            players[i].print();

        }

    }




    public static Printable creatObject(String players) {
        Printable printable = null;
        switch (players){
            case "ronaldo":
                printable = new ronaldo("ronaldo","португалия");
                break;
            case "messi":
                printable = new messi("messi","аргентина");
                break;
            case "Mbappe":
                printable = new Mbappe("Mbappe","франция");
                break;
        }return printable;

    }

}

