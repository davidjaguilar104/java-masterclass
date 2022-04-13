package com.company;

public class House {

    private LivingRoom livingRoom;
    private Couch theCouch;

    public House(LivingRoom livingRoom, Couch theCouch) {
        this.livingRoom = livingRoom;
        this.theCouch = theCouch;
    }

    public void sit() {
        livingRoom.sitOnCouch();
        getCouchColor();
    }

    private void getCouchColor() {
        theCouch.getColor();
    }
}
