package tilegame.states;

import java.awt.Graphics;

import tilegame.Game;
import tilegame.entities.creatures.Player;
import tilegame.tiles.Tile;
import tilegame.world.World;

public class GameState extends State{

	
	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
		world = new World("C:\\Users\\TheDick\\eclipse-workspace\\TileGame\\res\\worlds\\world1.txt");
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
