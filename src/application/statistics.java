package application;

import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.TilePane;

public class statistics {

	static int numOfWinGames;
	static int numOfLooseGames;
	static int wins = 0;
	static int total = 0;
	static double avg = 0;

	private Button btn1;
	TilePane pane;
	private Label lbl1,lbl2,lbl3,lbl4;
	private DateFormat dataFormat;
	
	statistics (){
		pane = getTilePane();
		lbl1 = new Label();
		lbl2 = new Label();
		lbl3 = new Label();
		lbl4 = new Label();
		btn1 = new Button("save statistics");
		
		
	}
	public void start(){
		createGUI_2();
		
	}

	private TilePane getTilePane() {
		return pane;
	}
	
	public void winResult(int x){
		numOfWinGames++;
		wins = wins+x;
	}
	
	public void looseResult(){
		numOfLooseGames++;
		
	}
	
	public void createGUI_2(){
		//pane.setLayoutX(numOfLooseGames);
		
		
		
		total = numOfWinGames+numOfLooseGames;
		if(total==0){
            lbl4.setText("Average Number of Credit netted per game : 0");
        }else{
        avg = wins/total;
        if (avg==0){
            lbl4.setText("Average Number of Credit netted per game : -" + total);
        }else{
            lbl4.setText("Average Number of Credit netted per game : " + avg);
        }
        }
		
		
		lbl1.setText("Number of game you played : " + total);
		lbl2.setText("Number of wins : " + numOfWinGames);
		lbl3.setText("Number of lose" + numOfLooseGames);
	}
	
	public void saveFile(){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH-mm-ss");
		System.out.println(format.format(date));
		
		File file = new File(dataFormat.format(date) + ".txt");
		
		try{
			file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		writer.write("Average number of credit netted per game : " +  avg );
		writer.write("Number of games you played : " +  total);
		writer.write("Number of games you won: " +  numOfWinGames);
		writer.write("Number of games you loose : " +  numOfWinGames);
				
		}catch(IOException ex){
			  Logger.getLogger(Side.class.getName()).log(Level.SEVERE, null, ex); //vdg
		}
		
		
		
	}
}


