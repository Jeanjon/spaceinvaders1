package fr.unilim.iut.spaceinvaders1.model;

public class Collision {

	private boolean collision;

	public Collision() {
		this.setCollision(false);
	}

	public void detecterCollision(Sprite sprite1, Sprite sprite2) {
		if (null != sprite1 && null != sprite2) {
			if ((sprite1.abscisseLaPlusAGauche() <= sprite2.abscisseLaPlusADroite()) && (sprite1.abscisseLaPlusADroite() >= sprite2.abscisseLaPlusAGauche())) {
				if ((sprite1.ordonneeLaPlusBasse() <= sprite2.ordonneeLaPlusHaute()) && (sprite1.ordonneeLaPlusHaute() >= sprite2.ordonneeLaPlusBasse())) {
					setCollision(true);
				}
			}
		}
	}

	public boolean isCollision() {
		return collision;
	}

	public void setCollision(boolean collisionMissileEnvahisseur) {
		this.collision = collisionMissileEnvahisseur;
	}

}
