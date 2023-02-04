package com.techreturners.cats;

abstract class WildCat {

    private String setting="wild";
    private int averageHeight=1100;
    private boolean asleep=false;

    public String getSetting() { return setting;}

    public int getAverageHeight() {
        return averageHeight;
    }

    public void wakeUp() {
        asleep=false;
    }
    public void goToSleep() { asleep = true;}
    public boolean isAsleep() {
        return asleep;
    }

}
