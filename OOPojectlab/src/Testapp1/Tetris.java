package Testapp1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Tetris extends JFrame {

    JLabel statusbar;
    Board board;
    Application myApp;
    StatusPane statuspane;
	//constructor, take Application as input
    public Tetris(Application app) {
    	myApp = app;
        setSize(500, 700);
        setTitle("Tetris");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initializeComponents();
        setVisible(true);
   }
   //create game's components
   private void initializeComponents() {
		// tạo menu bar phía trên cùng
		JMenuBar menubar = new JMenuBar();
		JMenu menu;
		JMenuItem menuitem;
		
		this.setJMenuBar(menubar); //tạo menu bar
		menu = new JMenu("Game"); // tạo menu mới tên Game
		//shortcut
		// menu.setMnemonic(KeyEvent.VK_G);
		menuitem = new JMenuItem("New Game"); //menu option "new game"
		// menuitem.setMnemonic(KeyEvent.VK_N);
		menuitem.addActionListener(new MenuHandler(this));
		menu.add(menuitem);
		menu.addSeparator();
		menuitem = new JMenuItem("Exit"); // exit option
		// menuitem.setMnemonic(KeyEvent.VK_X);
		menuitem.addActionListener(new MenuHandler(this));
		menu.add(menuitem);
		menubar.add(menu);
		
		statuspane = new StatusPane(myApp);
		statusbar = new JLabel("Choose New Game from the menu Game to start game.");
		board = new Board(myApp, this);

		JPanel sidePanel = new JPanel();
    sidePanel.setLayout(new BorderLayout());

		sidePanel.add(statuspane, BorderLayout.NORTH);

    // Thêm High Scores Label vào dưới
    sidePanel.add(board.highScoresLabel, BorderLayout.SOUTH);
		
    // Thêm các thành phần vào JFrame
    this.setLayout(new BorderLayout());
    this.add(sidePanel, BorderLayout.EAST);   // Panel chứa StatusPane + HighScores bên phải
    this.add(board, BorderLayout.CENTER);     // Bảng trò chơi ở giữa
		this.add(statusbar, BorderLayout.NORTH);  // Thanh trạng thái bên dưới
		
	
	}

   public JLabel getStatusBar() {
       return statusbar;
   }
   
   public class MenuHandler implements ActionListener
   {
	   Tetris ter;
	   public MenuHandler(Tetris ter)
	   {
		   this.ter = ter;
	   }
	   public void actionPerformed(ActionEvent e) {
		   String s = e.getActionCommand();
		   if(s == "New Game")
		   {
			   board.start();
		   }
		   else if(s == "Exit")
		   {
			   ter.dispose();
		   }
	   }
   }
	
}
