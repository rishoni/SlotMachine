package application;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Main extends Application {

	
	public void start1(Stage primaryStage) {
		
			GridPane pane = new GridPane();
			Scene scene = new Scene(pane, 500, 500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Slot Machine");
			primaryStage.show();
			scene.setRoot(pane);
			pane.getChildren().addAll(btn1,btn3);
		
	}

	static Main myMain = new Main();
	static Reel myReel = new Reel();
	Symbol[] array;
	//GridBagLayout grid;
	static int credit = 10;
	static int bet = 0;
	static int imageReel1;
	static int imageReel2;
	static int imageReel3;

	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	// GridPane grid;
	

	Label lbl1;
	// Label lbl2;
	// Label lbl3;
	Label lbl4;
	Label lbl5;

	// error
	public Main() {
		btn1 = new Button("Spin");
		btn2 = new Button("Reset");
		btn3 = new Button("BET One");
		btn4 = new Button("BET Max");
		btn5 = new Button("Add Coin");
		btn6 = new Button("Statistics");
		btn7 = new Button("Stop");
		btn8 = new Button("Stop");
		btn9 = new Button("Stop");
		lbl1 = new Label("WELCOME!!!__Play  the Game");
	
	
	}




	public static void main(String[] args) {
	launch(args);
		myMain.iconImage();
	}

	public void iconImage() {
		Symbol Seven = new Symbol();
		Seven.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/redseven.png"));
		Seven.setValue(7);
		myReel.symbol.add(Seven);

		Symbol cherry = new Symbol();
		cherry.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/cherry"));
		cherry.setValue(2);
		myReel.symbol.add(cherry);

		Symbol bell = new Symbol();
		bell.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/bell.png"));
		bell.setValue(6);
		myReel.symbol.add(bell);

		Symbol lemon = new Symbol();
		lemon.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/lemon"));
		lemon.setValue(3);
		myReel.symbol.add(lemon);

		Symbol plum = new Symbol();
		plum.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/plum"));
		plum.setValue(4);
		myReel.symbol.add(plum);

		Symbol watermelon = new Symbol();
		watermelon.setImage(new Image("file:///C:/Users/User/workspace/SlotMachine/src/image/watermelon "));
		watermelon.setValue(5);
		myReel.symbol.add(watermelon);

		// code
		array= new Symbol[Reel.symbol.size()];
		int count=0;
		for(Symbol arr: Reel.symbol){
			array[count] = arr;
			count++;
		}

		createGUI();
//setVisible(true);

	}

	public void createGUI() {

		// pane.setLayout(new GridBagLayout());
		pane.setGridLinesVisible(true);
		pane.setPadding(new Insets(50,50,50,50));
		pane.setVgap(8);
		pane.setHgap(8);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.fill = GridBagConstraints.HORIZONTAL;

		grid.gridx = 0;
		grid.gridy = 3;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		grid.fill = GridBagConstraints.HORIZONTAL;
		GridPane.setConstraints(pane, 0, 0);
		//pane.add(btn1, grid);
//pane.add(btn1, 0, 3);
pane.addColumn(0, pane);
		grid.gridx = 0;
		grid.gridy = 3;
		grid.gridheight = 1;
		grid.gridwidth = 1;
	//	pane.add(btn2, grid);

		grid.gridx = 1;
		grid.gridy = 4;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		//pane.add(btn3, grid);

		grid.gridx = 2;
		grid.gridy = 4;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		//pane.add(btn4, grid);

		grid.gridx = 0;
		grid.gridy = 5;
		grid.gridheight = 1;
		grid.gridwidth = 1;
	//	pane.add(btn5, grid);

		grid.gridx = 2;
		grid.gridy = 5;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		//pane.add(btn6, grid);

		grid.gridx = 0;
		grid.gridy = 0;
		grid.gridheight = 1;
		grid.gridwidth = 1;
	//	pane.add(btn7, grid);

		grid.gridx = 1;
		grid.gridy = 0;
		grid.gridheight = 1;
		grid.gridwidth = 1;
	//	pane.add(btn8, grid);

		grid.gridx = 2;
		grid.gridy = 0;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		//pane.add(btn9, grid);

		grid.gridx = 1;
		grid.gridy = 5;
		grid.gridheight = 2;
		grid.gridwidth = 1;
		grid.fill = GridBagConstraints.VERTICAL;
		//pane.add(lbl1, grid);

		grid.gridx = 0;
		grid.gridy = 6;
		grid.gridheight = 1;
		grid.gridwidth = 1;
	//	pane.add(lbl4, grid);

		grid.gridx = 2;
		grid.gridy = 6;
		grid.gridheight = 1;
		grid.gridwidth = 1;
		//pane.add(lbl5, grid);

		// code
		btn2.addActionListener(Reset());
		btn5.addActionListener(AddCoin());
		btn3.addActionListener(BetOne());
		btn4.addActionListener(BetMax());
		

	}

	public class Spin implements ActionListener {

		void loop(){
			Main mainGame = new Main();
			mainGame.matchImage();
		}
		public void actionPerformed(ActionEvent e) {
if(bet >0){
	Reel reel = new Reel();
	
}else{
	myMain.lbl1.setText("Bet is zero");
}
			
		}

	}
	
	

	public void matchImage() {

		if (imageReel1 == imageReel2 && imageReel2 == imageReel3) {

		}

	}

	public void checkCredit() {
		if (bet < 3) {
			if (credit >= 1) {
				bet++;
				credit--;
				myMain.lbl4.setText("Credit :" + credit);
				myMain.lbl5.setText("Bet : " + bet);

			} else {
				myMain.lbl4.setText("No credits!");

			}
		} else {
			myMain.lbl5.setText("Bet is Full");
		}

	}

	public ActionListener AddCoin() {
		credit++;
		myMain.lbl4.setText("Credit = " + credit);
		return AddCoin();
	}

	public ActionListener Reset() {
		credit = credit + bet;
		bet = 0;
		myMain.lbl1.setText("Credit : " + credit);
		myMain.lbl5.setText("Bet : " + bet);
		myMain.lbl1.setText("Welcom! Play the Game");
		return Reset();

	}

	public ActionListener BetMax() {
		if (credit >= 3) {
			if (bet >= 3) {
				myMain.lbl4.setText("Bet if Full");
			} else {
				int currentBet = bet;
				int nowBet = 3 - currentBet;
				credit = credit - nowBet;
				// bet=3;
				myMain.lbl4.setText("Credit : " + credit);
				myMain.lbl5.setText("Bet : " + bet);
			}
		}else{
			myMain.lbl1.setText("No Credits to bet max");
		}
		return  BetMax();
	}
	
	public ActionListener BetOne(){
		if(credit >=1){
			if(bet >=1){
				credit--;
				bet++;
				
				myMain.lbl4.setText("Credit : " + credit);
				myMain.lbl5.setText("Bet : " + bet);
			}else{
				myMain.lbl5.setText("No Bets!");
			}
		}else{
			myMain.lbl4.setText("Credit : " + credit);
		}
		return  BetOne();
	}


	

	
	
}
