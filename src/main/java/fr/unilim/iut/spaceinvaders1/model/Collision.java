package fr.unilim.iut.spaceinvaders1.model;

public class Collision {
	
	private boolean collisionMissileEnvahisseur;
	

	public Collision() {
		this.setCollisionMissileEnvahisseur(false);
	}

	public void detecterCollision(Sprite sprite1, Sprite sprite2 ) {
		if(null != sprite1 && null != sprite2) {
			detecterCollisionEntreUnMissileEtUnEnvahisseur(sprite1, sprite2);
		}
	}

	public void detecterCollisionEntreUnMissileEtUnEnvahisseur(Sprite sprite1, Sprite sprite2) {
		if(sprite1 instanceof Missile && sprite2 instanceof Envahisseur) {
			AvoirCollisionEntreMissileEtEnvahisseur((Envahisseur) sprite2, (Missile) sprite1);
		}
		if(sprite1 instanceof Envahisseur && sprite2 instanceof Missile) {
			AvoirCollisionEntreMissileEtEnvahisseur((Envahisseur) sprite1, (Missile) sprite2);
		}
				
		
	}

	public void AvoirCollisionEntreMissileEtEnvahisseur(Envahisseur envahisseur, Missile missile) {
			if((envahisseur.abscisseLaPlusAGauche()<=missile.abscisseLaPlusADroite()) && (envahisseur.abscisseLaPlusADroite()>=missile.abscisseLaPlusAGauche())) {
				if((envahisseur.ordonneeLaPlusBasse()<=missile.ordonneeLaPlusHaute()) && (envahisseur.ordonneeLaPlusHaute()>=missile.ordonneeLaPlusBasse())) {
					setCollisionMissileEnvahisseur(true);
				}
			}
		
	}

	public boolean isCollisionMissileEnvahisseur() {
		return collisionMissileEnvahisseur;
	}

	public void setCollisionMissileEnvahisseur(boolean collisionMissileEnvahisseur) {
		this.collisionMissileEnvahisseur = collisionMissileEnvahisseur;
	}
	
}
