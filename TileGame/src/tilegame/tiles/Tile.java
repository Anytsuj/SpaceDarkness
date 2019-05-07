package tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
public static Tile[] tiles = new Tile[256];
public static Tile pod1 = new pod1Tile(0);
public static Tile pod2 = new pod2Tile(1);
public static Tile pod3 = new pod3Tile(2);
public static Tile sspn = new spnTile(3);
public static Tile sspd = new spdTile(4);
public static Tile bpldop = new bpdopTile(5);
public static Tile bpldol = new bpdolTile(6);
public static Tile bplnop = new bpnopTile(7);
public static Tile bplnol = new bpnolTile(8);
	
	protected BufferedImage texture;
	protected final int id;
	public static final int TILEWIDTH = 84, TILEHEIGHT = 84;
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	public void tick() {
		
	}
	public void render(Graphics g, int x , int y) {
		g.drawImage(texture,x , y, TILEWIDTH, TILEHEIGHT, null);
	}
	public boolean Solid() {
		return false;
	}
	public int getId() {
		return id;
	}
}
