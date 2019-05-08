package tilegame.tilegame;

import tilegame.Game;
import tilegame.input.KeyManager;
import tilegame.input.MouseManager;
import tilegame.world.World;

public class Handler {
	private Game game;
	private World world;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public MouseManager getMouseMager() {
		return game.getMouseManager();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}




}
