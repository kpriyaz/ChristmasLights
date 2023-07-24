package org.example;

public class LightImpl extends Light{
    @Override
    public void toggle() {
        boolean newState = !isLightOn();
        this.setLightOn(newState);
    }
}
