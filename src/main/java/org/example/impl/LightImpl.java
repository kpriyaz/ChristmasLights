package org.example.impl;

import org.example.Light;

public class LightImpl extends Light {
    @Override
    public void toggle() {
        boolean currentState = this.isTurnedOn();
        this.setTurnedOn(!currentState);
    }
}
