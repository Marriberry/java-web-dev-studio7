package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String title, int discStorage, boolean dataCanBeRead, boolean storedData, boolean discScratched) {
        super(title, discStorage, dataCanBeRead, storedData, discScratched);
    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD is spinning!");
    }

    @Override
    public void playability() {
        if (getDiscScratched()) {
            System.out.println("Cannot Read!");
        } else {
            spinDisc();
        }
    }

    @Override
    void dataWritten() {

    }

    @Override
    void reportInformation() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
