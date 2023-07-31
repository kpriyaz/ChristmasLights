package org.example;

public class LightImpl extends Light{
    @Override
    public void toggle() {
        this.setBrightness(this.getBrightness() + 2);
    }

    @Override
    public void turnOn() {
        this.setBrightness(this.getBrightness() + 1);
    }

    @Override
    public void turnOff() {
        int currentBrightness = this.getBrightness();
        if(currentBrightness > 0) {
            this.setBrightness(currentBrightness - 1);
        }
    }
}
