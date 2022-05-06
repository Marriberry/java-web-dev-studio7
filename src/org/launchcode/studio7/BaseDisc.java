package org.launchcode.studio7;

public abstract class BaseDisc {

    private String title;
    private int discStorage;
    private boolean dataCanBeRead;
    private boolean storedData;
    private boolean discScratched;

    public BaseDisc(String title, int discStorage, boolean dataCanBeRead, boolean storedData, boolean discScratched) {
        this.title = title;
        this.discStorage = discStorage;
        this.dataCanBeRead = dataCanBeRead;
        this.storedData = storedData;
        this.discScratched = discScratched;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDiscStorage() {
        return discStorage;
    }

    public void setDiscStorage(int discStorage) {
        this.discStorage = discStorage;
    }

    public boolean getDataCanBeRead() {
        return dataCanBeRead;
    }

    public void setDataCanBeRead(boolean dataCanBeRead) {
        this.dataCanBeRead = dataCanBeRead;
    }

    public boolean getStoredData() {
        return storedData;
    }

    public void setStoredData(boolean storedData) {
        this.storedData = storedData;
    }

    public boolean getDiscScratched() {
        return discScratched;
    }

    public void setDiscScratched(boolean discScratched) {
        this.discScratched = discScratched;
    }

    abstract void dataWritten();
    abstract void reportInformation();
}
