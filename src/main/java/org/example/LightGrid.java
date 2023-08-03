package org.example;

import org.example.impl.LightImpl;

public abstract class LightGrid {

    Light[][] lights;

    private int maxRows;
    private int maxCols;

    public LightGrid(int maxRows, int maxCols) {
        this.maxRows = maxRows;
        this.maxCols = maxCols;

        lights = new Light[maxRows][maxCols];
        for (int i = 0; i < maxRows; i++) {
            for (int j = 0; j < maxCols; j++) {
                lights[i][j] = new LightImpl();
            }
        }
    }

    public abstract void toggleGrid(Coordinates c1, Coordinates c2);
    public abstract void turnOffGrid(Coordinates c1, Coordinates c2);
    public abstract void turnOnGrid(Coordinates c1, Coordinates c2);
    public abstract int countLitLights();

    public int getMaxRows() {
        return maxRows;
    }

    public int getMaxCols() {
        return maxCols;
    }

    public Light[][] getLights() {
        return lights;
    }
}
