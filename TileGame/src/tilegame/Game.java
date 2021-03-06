package tilegame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import display.Display;
import tilegame.gfx.Assets;
import tilegame.input.KeyManager;
import tilegame.input.MouseManager;
import tilegame.states.GameState;
import tilegame.states.State;
import tilegame.tilegame.Handler;

public class Game implements Runnable {
	//val
	private Display display;
	private int width, height;
	public String title;
	
	//Thread and run
	private boolean running = false;
	private Thread thread;
	
	//Graph
	private BufferStrategy bs;
	private Graphics g;
	
	//mouse input
	private MouseManager mousemanage;
	private KeyManager keymanager;
	
	//States
	private State gameState;
	
	//handl
	private Handler handler;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		mousemanage = new MouseManager();
		keymanager = new KeyManager();
	}
	
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keymanager);
		display.getFrame().addMouseMotionListener(mousemanage);
		display.getFrame().addMouseListener(mousemanage);
		display.getCanvas().addMouseMotionListener(mousemanage);
		display.getCanvas().addMouseListener(mousemanage);
		handler = new Handler(this);
		Assets.init();
		
		gameState = new GameState(handler);
		State.setState(gameState);
	}
	
	private void tick(){
		mousemanage.tick();
		keymanager.tick();
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public MouseManager getMouseManager() {
		return mousemanage;
	}
	public KeyManager getKeyManager() {
		return keymanager;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	
}



