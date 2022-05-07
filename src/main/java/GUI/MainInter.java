package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;


import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class MainInter {

	private static JFrame frame;
	private JLabel title;
	private JLabel paneBorder;
	private JLabel icon;
	private JScrollPane scrollRecent;
	private Button insert;
	private Button modify;
	private Button viewMore;
	private Button highlyStolen;
	private Button highlyDangerous;
	private Button eliminate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInter window = new MainInter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInter() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("FoolThief");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ingri\\Downloads\\WhatsApp Image 2022-05-04 at 12.56.47 AM.jpeg"));
		frame.setBounds(250, 150, 1272, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.decode("#02aed9"));
		frame.getContentPane().setBounds(0, 0, 1270, 727);

		//Icon
		icon = new JLabel("");
		icon.setOpaque(true);
		icon.setBackground(Color.decode("#ffffff"));
		/*icon.setEnabled(false);
		icon.setDisabledIcon(new ImageIcon("C:\\Users\\ingri\\Downloads\\WhatsApp Image 2022-05-04 at 12.56.47 AM.jpeg"));*/
		icon.setIcon(new ImageIcon("C:\\Users\\ingri\\Downloads\\edit.png"));
		icon.setHorizontalAlignment(SwingConstants.CENTER);
		icon.setVerticalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(icon);
		icon.setVisible(true);
		icon.setBounds(450,6, 63, 63);
		
		// title label
		title = new JLabel("Fool Thief");
		title.setOpaque(true);
		title.setForeground(Color.decode("#000000"));
		title.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		frame.getContentPane().add(title);
		title.setVisible(true);
		title.setBounds(2, 3, frame.getContentPane().getWidth()-18, 69);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Freestyle Script", Font.PLAIN, 65));
		title.setBackground(Color.decode("#ffffff"));
	
		
		// Scroll
		scrollRecent = new JScrollPane();
		scrollRecent.setBounds(32, 95, 777, 567);
		frame.getContentPane().add(scrollRecent);
		scrollRecent.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		scrollRecent.setVisible(true);
		scrollRecent.setBackground(Color.decode("#ffffff"));
		
		// Buttons
		  //Insert
		insert = new Button("Insert");
		insert.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		insert.setBounds(845, 108, 387, 47);
		frame.getContentPane().add(insert);
		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			frame.setEnabled(false);
			InsertWin.main(null);
			}
		});
		  //Modify
		modify = new Button("Modify");
		modify.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		modify.setBounds(845, 198, 387, 47);
		frame.getContentPane().add(modify);
		modify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		  //view More
		viewMore = new Button("View More");
		viewMore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewMore.setBounds(845, 378, 387, 47);
		frame.getContentPane().add(viewMore);
		viewMore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		  //Eliminate
		eliminate = new Button("Eliminate");
		eliminate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eliminate.setBounds(845, 288, 387, 47);
		frame.getContentPane().add(eliminate);
		eliminate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		  //Highly Stolen Objects
		highlyStolen = new Button("Highly Stolen Objects");
		highlyStolen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		highlyStolen.setBounds(845, 468, 387, 47);
		frame.getContentPane().add(highlyStolen);
		highlyStolen.setForeground(Color.decode("#bd0000"));
		highlyStolen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		  //Highly Dangerous Places
		highlyDangerous = new Button("Highly Dangerous Places");
		highlyDangerous.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		highlyDangerous.setBounds(845, 558, 387, 47);
		frame.getContentPane().add(highlyDangerous);
		highlyDangerous.setForeground(Color.decode("#bd0000"));
		highlyDangerous.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		//paint some decoration
		paneBorder = new JLabel("");
		paneBorder.setBorder(new LineBorder(new Color(0, 0, 0), 4, false));
		frame.getContentPane().add(paneBorder);
		paneBorder.setVisible(true);
		paneBorder.setBounds(0,0, 1256, 690);
	}
	public static void enableFrame() {
		frame.setEnabled(true);
	}
}
