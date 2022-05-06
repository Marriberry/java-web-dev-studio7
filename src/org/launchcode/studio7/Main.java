package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD one = new CD("Linkin Park", 15, true,true, false);
        //one.spinDisc();

        DVD two = new DVD("Batman", 15,true,true,false);
        two.playability();
    }
}
