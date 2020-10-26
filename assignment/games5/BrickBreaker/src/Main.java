

import assignment.games5.BrickBreaker.src.GamePlay;
import javax.swing.JFrame;

public class Main {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		
		final JFrame obj = new JFrame();
		final GamePlay gamePlay = new GamePlay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		
	}

}
