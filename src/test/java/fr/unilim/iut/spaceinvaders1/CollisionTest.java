package fr.unilim.iut.spaceinvaders1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders1.model.Dimension;
import fr.unilim.iut.spaceinvaders1.model.Envahisseur;
import fr.unilim.iut.spaceinvaders1.model.Missile;
import fr.unilim.iut.spaceinvaders1.model.Position;
import fr.unilim.iut.spaceinvaders1.model.Collision;

public class CollisionTest {

	private Missile missile;
	private Envahisseur envahisseur;
	private Collision collision;
	
	@Before
		public void initialiser() {
		   collision = new Collision();
	}
	
	@Test
		public void testCollision_AUnePositionExacte() {
		   missile = new Missile(new Dimension(2, 2), new Position(3, 4), 2);
		   envahisseur = new Envahisseur(new Dimension(2, 2), new Position(3, 4), 2);
		   
		   collision.detecterCollision(envahisseur, missile);
		   assertEquals(true ,collision.isCollisionMissileEnvahisseur());
	   	}
	
	@Test
	public void testCollision_EnvahisseurLimiteBasGauche() {
		   missile = new Missile(new Dimension(2, 2), new Position(2, 5), 2);
		   envahisseur = new Envahisseur(new Dimension(2, 2), new Position(3, 4), 2);
		   
		   collision.detecterCollision(envahisseur, missile);
		   assertEquals(true ,collision.isCollisionMissileEnvahisseur());
		}
	
	@Test
	public void testCollision_EnvahisseurLimiteBasDroite() {
		   missile = new Missile(new Dimension(2, 2), new Position(4, 5), 2);
		   envahisseur = new Envahisseur(new Dimension(2, 2), new Position(3, 4), 2);
		   
		   collision.detecterCollision(envahisseur, missile);
		   assertEquals(true ,collision.isCollisionMissileEnvahisseur());
		}
		
		
}
