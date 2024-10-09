package com.phenix.calculphoto;

/**
 *
 * @author <a href="mailto:edouard128@hotmail.com">Edouard Jeanjean</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Objectif[] liste_objectif = new Objectif[]{
            new Objectif(35, 30.38, 14.5),
            new Objectif(50, 18.5, 34.5),
            new Objectif(75, 12, 122.5)
        };

        Cadrage[] liste_cadrage = new Cadrage[]{
            new Cadrage("Plan épaule", Cadrage.PAYSAGE, 40D, 60D),
            new Cadrage("Plan poitrine", Cadrage.PAYSAGE, 55D, 60D),
            new Cadrage("Plan taille", Cadrage.PORTRAIT, 82D, 60D),
            new Cadrage("Plan taille (paysage)", Cadrage.PAYSAGE, 82D, 82D * (4D / 3D)),
            new Cadrage("Plan américain", Cadrage.PORTRAIT, 102D, 60D),
            new Cadrage("Plan plein pîed", Cadrage.PORTRAIT, 180D, 60D)
        };

        int id_objectif_choisit = 1;
        int id_cadrage_choisit = 2;
        System.out.println("Cadrage : " + liste_cadrage[id_cadrage_choisit].nom);

        double tang = Math.tan(Math.toRadians(liste_objectif[id_objectif_choisit].angle));

        System.out.println("Focale : " + liste_objectif[id_objectif_choisit].focale + "mm");

        // Déduire la largeur :
        {
            double distance_cm = 15D;

            System.out.println("tang : " + tang);

            double longeur_cm = (tang * distance_cm) * 2D;

            System.out.println("longeur : " + longeur_cm + "cm");

            if (distance_cm <= liste_objectif[id_objectif_choisit].distance_min) {
                System.out.println("/!\\ L'objectif ne peut pas faire le point aussi près (" + distance_cm + " cm).");
            }
        }

        // Déduire la distance.
        {
            double longeur_cm = liste_cadrage[id_cadrage_choisit].getLongeur();

            System.out.println("longeur : " + longeur_cm + "cm");

            double distance_cm = (longeur_cm / 2D) / tang;
            System.out.println("distance : " + distance_cm + "cm");

            if (distance_cm <= liste_objectif[id_objectif_choisit].distance_min) {
                System.out.println("/!\\ L'objectif ne peut pas faire le point aussi près (" + distance_cm + " cm).");
            }
        }
    }
}
