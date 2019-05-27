package fr.unilim.iut.spaceinvaders1.model;

public class Envahisseur extends Sprite {

	Direction sensDeplacementEnvahisseur = Direction.GAUCHE;
	
	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
	    super(dimension, positionOrigine, vitesse);
    }
}
