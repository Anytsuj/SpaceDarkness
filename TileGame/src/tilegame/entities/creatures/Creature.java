package tilegame.entities.creatures;

import tilegame.entities.Entity;

public abstract class Creature extends Entity{

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 84;
	public static final int DEFAULT_CREATURE_HEIGHT = 84;
	protected int health;
	protected float speed;
	public Creature(float x, float y,int width, int height) {
		super(x, y,width,height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
	}

}
