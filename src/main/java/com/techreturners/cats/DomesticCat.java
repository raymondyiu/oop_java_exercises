package com.techreturners.cats;

public class DomesticCat implements Cat{

    private boolean asleep=false;
    private String setting="domestic";
    private int averageHeight=23;


    public String eat(){
        return ("Purrrrrrr");
    }
    public void sleep(){
        System.out.println("Domestic cat sleeping");
    }
    public void run(){
        System.out.println("Domestic cat running");
    }

    public String getSetting() { return setting;}
    public void goToSleep() { asleep = true;}
    public void wakeUp() { asleep = false;}
    public boolean isAsleep() { return asleep;}
    public int getAverageHeight() {
        return averageHeight;
    }


}
