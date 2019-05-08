package tilegame.entities.creatures;

import java.awt.Graphics;
import tilegame.gfx.Assets;
import tilegame.tilegame.Handler;
public class Player extends Creature{
	
	private Handler handler;
	public Player(Handler handler, float x, float y) {
		super(handler, x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		this.handler = handler;
	}

	@Override
	public void tick() {
		if(handler.getKeyManager().up)
			y -= 3;
		if(handler.getKeyManager().down)
			y += 3;
		if(handler.getKeyManager().left)
			x -= 3;
		if(handler.getKeyManager().right)
			x += 3;
	}

	
	

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.alright,(int) x,(int) y, width, height,null);
	
	}



}
