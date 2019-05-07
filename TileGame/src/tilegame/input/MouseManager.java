package tilegame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import tilegame.entities.creatures.Player;
import tilegame.tilegame.Handler;

public class MouseManager implements MouseListener, MouseMotionListener{

	private boolean leftPress, rightPress;
	private int mouseX, mouseY;
	private int targetX, targetY;
	public MouseManager() {
	}
	public void tick() {
		
	}
	public boolean isleftPress () {
		return leftPress;
	}
	public boolean isrightPress () {
		return rightPress;
	}
	public int getMouseX() {
		return mouseX;
		
	}
	public int getMouseY() {
		return mouseY;
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPress = true;
		if(e.getButton() == MouseEvent.BUTTON3)
			rightPress = true;
	}
		

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPress = false;
		if(e.getButton() == MouseEvent.BUTTON3)
			rightPress = false;
		
		
	}

}
