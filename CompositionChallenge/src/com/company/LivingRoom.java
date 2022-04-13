package com.company;

public class LivingRoom {
    private String walls;
    private Couch theCouch;

    public LivingRoom(String walls, Couch theCouch) {
        this.walls = walls;
        this.theCouch = theCouch;
    }

    public void sitOnCouch() {
        System.out.println("Living Room -> You are now sitting on the couch!");
    }

    public String getWalls() {
        return walls;
    }

    public Couch getTheCouch() {
        return theCouch;
    }
}
