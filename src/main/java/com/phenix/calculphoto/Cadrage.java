package com.phenix.calculphoto;

/**
 *
 * @author <a href="mailto:edouard128@hotmail.com">Edouard Jeanjean</a>
 */
public class Cadrage {

    public final static int PORTRAIT = 0;

    public final static int PAYSAGE = 1;

    /**
     * Nom du plan.
     */
    public String nom;

    /**
     * Utiliser les variables static avant pour définit format : payasage ou
     * portrait.
     */
    public int format;

    /**
     * La hauteur en cm.
     */
    public double hauteur;

    /**
     * Largeur en cm.
     */
    public double largeur;

    public Cadrage(String nom, int format, double hauteur, double largeur) {
        this.nom = nom;
        this.format = format;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    /**
     * Retourne la longeur du cadrage.
     *
     * @return La longeur.
     */
    public double getLongeur() {
        return (this.hauteur > this.largeur) ? this.hauteur : this.largeur;
    }
}
