package com.phenix.calculphoto;

/**
 * Un objectif photo.
 *
 * @author <a href="mailto:edouard128@hotmail.com">Edouard Jeanjean</a>
 */
public class Objectif {

    /**
     * La focale en mm.
     */
    public int focale;

    /**
     * L'angle en degré.
     */
    public double angle;

    /**
     * Distance minimal de mise au point en cm.
     */
    public double distance_min;

    public Objectif(int focale, double angle, double distance_min) {
        this.focale = focale;
        this.angle = angle;
        this.distance_min = distance_min;
    }
}
