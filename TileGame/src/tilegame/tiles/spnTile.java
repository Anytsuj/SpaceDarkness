package tilegame.tiles;

import tilegame.gfx.Assets;

public class spnTile extends Tile{

	public spnTile( int id) {
		super(Assets.spn , id);
		
	}
	@Override
	public boolean  Solid() {
		return true;
	}
	

}
