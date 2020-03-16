package com.quantitymeasurement;

public enum Conversion {
    FEET(1), INCH(1), FEET_TO_INCH(1 * 12), INCH_TO_FEET(1 / 12),FEET_TO_YARD(1/3.0),
    INCH_TO_YARD(1/36.0), YARD_TO_INCH(1*36), YARD_TO_FEET(1*3.0), INCH_TO_CM(1*2.50),
    CM_TO_INCH(1/2.50), GALLON_TO_LITRE(3.79), LITRE_TO_ML(1000), ML_TO_LITRE(1/1000);

    public double unitValue;

    Conversion(double unitValue) {
        this.unitValue = unitValue;
    }
}
