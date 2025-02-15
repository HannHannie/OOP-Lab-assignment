package Testapp1;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StatusPane extends JPanel implements ActionListener{ //action listener (it can handle button click events)
	Application myApp; 
	OptionPane option; 	// game setting
	JLabel score; 		//display current score
	public StatusPane(Application app){
		myApp = app;
		setPreferredSize(new Dimension(120, 400)); //size panel
		setBorder(BorderFactory.createEtchedBorder(Color.red, Color.blue)); //set color
		initializeComponents();
	}
	private void initializeComponents(){
		setLayout(new GridLayout( 10, 1)); // set panel layout (10 hàng/1 cột)
		
		option = new OptionPane(myApp);
		JButton butStart = new JButton("Start Game"); //create buttion New game
		butStart.setPreferredSize(new Dimension(100, 40)); //button size
		butStart.addActionListener(this); //handle button click
		this.add(butStart); //add button to the panel
		JButton butOption = new JButton("Setting");
		butOption.setPreferredSize(new Dimension(100, 40));
		butOption.addActionListener(this);
		this.add(butOption);

		score = new JLabel("Score: 0");
		this.add(score); //add label to display the current score, starting at 0
	}
	
	public void scored(int score){
		this.score.setText("Score: "  +   Integer.toString(score)); //update current score
	}
	
	public void actionPerformed(ActionEvent e) { //this method runs when a button is clicked
		if(e.getActionCommand() == "Start Game"){ // truy xuất văn bản nút đc nhấn, nếu là Start game thì start game
			myApp.tetris.board.start();
		}
		else // ví dụ như setting button đc nhấn thì stop game
		{
			myApp.tetris.board.stop();
			option.setVisible(true); // make option visible to show settings
		}
	}
}


