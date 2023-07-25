package org.example;

import java.util.List;

public abstract class LightGrid {

    Light[][] lights;

    private int maxRows;
    private int maxCols;

    public LightGrid(int maxRows, int maxCols) {
        this.maxRows = maxRows;
        this.maxCols = maxCols;
        this.lights = new Light[maxRows][maxCols];

        for(int i=0;i<maxRows;i++){
            for(int j=0;j<maxCols;j++){
                this.lights[i][j] = new LightImpl();
            }
        }
    }

    public abstract int countLitLights();

    public abstract void toggleLights(Coordinates topLeft, Coordinates bottomRight);

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
