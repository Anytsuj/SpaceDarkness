package tilegame.entities.creatures;

import tilegame.entities.Entity;
import tilegame.tilegame.Handler;

public abstract class Creature extends Entity{

	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 84;
	public static final int DEFAULT_CREATURE_HEIGHT = 84;
	protected int health;
	protected float speed;
	public Creature(Handler handler,float x, float y,int width, int height) {
		super(handler, x, y,width,height);
		speed = DEFAULT_SPEED;
	}

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

}
