package tilegame.entities.creatures;

import java.awt.Graphics;

import tilegame.Game;
import tilegame.gfx.Assets;
import tilegame.tilegame.Handler;

public class Enemie1 extends Creature{
	
	private Handler handler;

	public Enemie1(Handler handler, float x, float y) {
		super(handler, x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		this.handler = handler;
	}

	@Override
	public void tick() {
		
	
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.alleft,(int) x,(int) y, width, height,null);
	}

}