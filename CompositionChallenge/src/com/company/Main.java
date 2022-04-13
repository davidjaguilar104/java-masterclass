package com.company;

public class Main {

    public static void main(String[] args) {

        Couch theCouch = new Couch("White");

        LivingRoom theLivingRoom = new LivingRoom("White", theCouch);

        House theHouse = new House(theLivingRoom, theCouch);
        theHouse.sit();
    }
}
