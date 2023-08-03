package org.example;

public abstract class Light {
    private boolean turnedOn;

    public abstract void toggle();

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}
