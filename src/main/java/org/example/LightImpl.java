package org.example;

public class LightImpl extends Light{
    @Override
    public void toggle() {
        boolean currentState = this.isLightOn();
        this.setLightOn(!currentState);
    }
}
