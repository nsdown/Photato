package com.trebonius.phototo.core.gps;

import com.google.gson.annotations.Expose;

public class Position {

    public final Double latitude;
    public final Double longitude;

    @Expose
    public final String hardcodedPosition;

    @Expose
    public final String[] coordinatesDescription;

    public Position(Double latitude, Double longitude, String hardcodedPosition, String[] coordinatesDescription) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.hardcodedPosition = hardcodedPosition;
        this.coordinatesDescription = coordinatesDescription;
    }

}
