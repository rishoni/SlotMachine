package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Reel {

	
	public  static ArrayList<Symbol> symbol = new ArrayList<Symbol>(6);
	
	
	public class BetOne implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			Main mainGame = new Main();
		    mainGame.checkCredit();
		 //   if(e.getSource().)
		}//spin
		
	}
	
	public class BetMax implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Main mainGame = new Main();
		mainGame.BetMax();
	}
	
}
	
	public class AddCoin implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Main mainGame = new Main();
			mainGame.AddCoin();
			
		}
		
	}
	
	
	public class Reset implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Main mainGame = new Main();
			mainGame.Reset();
			
		}
		
	}
	
	public class NewWindow implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		statistics s = new statistics();
		
		}
		
	}
	

}
