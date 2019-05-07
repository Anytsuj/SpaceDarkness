package tilegame.tiles;

import tilegame.gfx.Assets;

public class spdTile extends Tile{

	public spdTile( int id) {
		super(Assets.spd , id);
	}
	@Override
	public boolean  Solid() {
		return true;
	}
	

}
