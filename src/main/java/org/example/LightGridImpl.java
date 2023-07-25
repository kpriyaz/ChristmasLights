package org.example;

public class LightGridImpl extends LightGrid{


    public LightGridImpl() {
        super(1000, 1000);
    }

    @Override
    public int countLitLights() {
        int countOnLights = 0;

        for(int i=0;i<this.getMaxRows();i++){
            for(int j=0;j<this.getMaxCols();j++){
                if(lights[i][j].isLightOn()) {
                    countOnLights++;
                }
            }
        }
        return countOnLights;
    }

    @Override
    public void toggleLights(Coordinates topLeft, Coordinates bottomRight) {

        if(!(bottomRight.getRow() >= topLeft.getRow() && bottomRight.getCol() >= topLeft.getCol())){
            throw new InvalidCoordinates("not valid grid coordinates");
        }

        for(int i=topLeft.getRow();i<=bottomRight.getRow();i++){
            for(int j=topLeft.getCol();j<=bottomRight.getCol();j++){
                this.lights[i][j].toggle();
            }
        }
    }
}
