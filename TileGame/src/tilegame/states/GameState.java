package tilegame.states;

import java.awt.Graphics;
import tilegame.Game;
import tilegame.entities.creatures.Enemie1;
import tilegame.entities.creatures.Player;
import tilegame.tilegame.Handler;
import tilegame.world.World;

public class GameState extends State{

	private Player player;
	private Enemie1 enemie1;
	private World world;
	private double x  = 128;
	private double y = 128;
	
	public GameState(Handler handler){
		super(handler);
	
		world = new World(handler,"res\\worlds\\world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		enemie1 = new Enemie1(handler,(int) x, (int)y);
		}
//	}
	
	@Override
	public void tick() {
		world.tick();
	//	for (int i =0; i<5;i++) {
		enemie1.tick();
//		}
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
		//for (int i =0; i<5;i++) {
		enemie1.render(g);
		//}
	}

}
