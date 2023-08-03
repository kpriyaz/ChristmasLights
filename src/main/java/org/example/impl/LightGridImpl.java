package org.example.impl;

import org.example.Coordinates;
import org.example.InvalidGridCoordinates;
import org.example.LightGrid;

public class LightGridImpl extends LightGrid {

    public LightGridImpl() {
        super(1000, 1000);
    }

    @Override
    public void toggleGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public void turnOffGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public void turnOnGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public int countLitLights() {
        int count = 0;
        for (int i = 0; i < this.getMaxRows(); i++) {
            for (int j = 0; j < this.getMaxCols(); j++) {
                if(this.getLights()[i][j].isTurnedOn()){
                    count++;
                }
            }
        }
        return count;
    }
}
