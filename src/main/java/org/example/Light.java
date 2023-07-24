package org.example;

public abstract class Light {
    private boolean lightOn;

    public abstract void toggle();

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }
}
