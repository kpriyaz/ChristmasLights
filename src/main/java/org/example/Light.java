package org.example;

public abstract class Light {
    private int brightness;

    public abstract void toggle();

    public abstract void turnOn();

    public abstract void turnOff();

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
