package org.example;

public class LightGridImpl extends LightGrid{


    public LightGridImpl() {
        super(1000, 1000);
    }

    @Override
    public int countLightBrightness() {
        int brightness = 0;

        for(int i=0;i<this.getMaxRows();i++){
            for(int j=0;j<this.getMaxCols();j++){
                brightness += this.getLights()[i][j].getBrightness();
            }
        }
        return brightness;
    }

    @Override
    public void toggleLights(Coordinates topLeft, Coordinates bottomRight) {
        performLightAction(topLeft, bottomRight, LightAction.TOGGLE);
    }

    @Override
    public void turnOnLights(Coordinates topLeft, Coordinates bottomRight) {
        performLightAction(topLeft, bottomRight, LightAction.TURN_ON);
    }

    @Override
    public void turnOffLights(Coordinates topLeft, Coordinates bottomRight) {
        performLightAction(topLeft, bottomRight, LightAction.TURN_OFF);
    }

    private void performLightAction(Coordinates topLeft, Coordinates bottomRight, LightAction action) {
        if(!isValidCoordinate(topLeft) || !isValidCoordinate(bottomRight)) {
            throw new InvalidCoordinates("not valid grid coordinates");
        }
        else if(!(bottomRight.getRow() >= topLeft.getRow() && bottomRight.getCol() >= topLeft.getCol())){
            throw new InvalidCoordinates("not valid grid coordinates");
        }

        for(int i=topLeft.getRow();i<=bottomRight.getRow();i++){
            for(int j=topLeft.getCol();j<=bottomRight.getCol();j++){
                switch (action) {
                    case TOGGLE -> this.lights[i][j].toggle();
                    case TURN_ON -> this.lights[i][j].turnOn();
                    case TURN_OFF -> this.lights[i][j].turnOff();
                    default -> {}
                }
            }
        }
    }
    
    private boolean isValidCoordinate(Coordinates coor) {
        return ((coor.getRow() >= 0 && coor.getRow() < getMaxRows()) && 
                (coor.getCol() >= 0 && coor.getCol() < getMaxCols()));
    }
}
