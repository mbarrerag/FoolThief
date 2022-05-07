package GUI;

import java.awt.Color;
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
import javax.swing.JTextField;

public class InsertWin {

	private JFrame frame;
	private JLabel title;
	private JLabel paneBorder;
	private JLabel icon;
	private Button cancel;
	private Button save;
	private JTextField fullName;
	private JTextField date;
	private JTextField placeDescription;
	private JTextField neighborhood;
	private JTextField stolenObject;
	private JTextField description;
	private Label fullNameL;
	private Label dateL;
	private Label placeDescriptionL;
	private Label neighborhoodL;
	private Label stolenObjectL;
	private Label descriptionL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertWin window = new InsertWin();
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
	public InsertWin() {
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
		frame.setBounds(350, 180, 1040, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.decode("#02aed9"));
		frame.getContentPane().setBounds(0, 0, 1038, 668);
		frame.setUndecorated(true);
		
		//Icon
		icon = new JLabel("");
		icon.setOpaque(true);
		icon.setBackground(Color.decode("#ffffff"));
		/*icon.setEnabled(false);
		icon.setDisabledIcon(new ImageIcon("C:\\Users\\ingri\\Downloads\\WhatsApp Image 2022-05-04 at 12.56.47 AM.jpeg"));*/
		icon.setIcon(new ImageIcon("C:\\Users\\ingri\\Downloads\\WhatsApp Image 2022-05-04 at 12.56.47 AM.jpeg"));
		frame.getContentPane().add(icon);
		icon.setVisible(true);
		icon.setBounds(149,11, 86, 50);
		
		
		// title label
		title = new JLabel("Fool Thief - Insert Robbery Information");
		title.setOpaque(true);
		title.setForeground(Color.decode("#000000"));
		title.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		frame.getContentPane().add(title);
		title.setVisible(true);
		title.setBounds(2, 3, 1036, 65);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Freestyle Script", Font.PLAIN, 50));
		title.setBackground(Color.decode("#ffffff"));
		
		//JLabes for TextField
		  //Full Name
		fullNameL = new Label("-Write here your full name");
		fullNameL.setBounds(46, 79, 924, 26);
		frame.getContentPane().add(fullNameL);
		  //Date And Hours
		dateL = new Label("-Write here the date&hour the object was stolen");
		dateL.setBounds(46, 150, 924, 26);
		frame.getContentPane().add(dateL);
		  //Place Description
		placeDescriptionL = new Label("-Write a breeve description of the place where the object was stolen");
		placeDescriptionL.setBounds(46, 220, 924, 26);
		frame.getContentPane().add(placeDescriptionL);
		  //Neighborhood
		neighborhoodL = new Label("-Write here the neighborhood-sector where the object was stolen");
		neighborhoodL.setBounds(46, 290, 924, 26);
		frame.getContentPane().add(neighborhoodL);
		  //Stolen Object
		stolenObjectL = new Label("-Write here the stolen object");
		stolenObjectL.setBounds(46, 360, 924, 26);
		frame.getContentPane().add(stolenObjectL);
		  //Description
		descriptionL = new Label("-Write here a breeve description of what happened");
		descriptionL.setBounds(46, 430, 924, 26);
		frame.getContentPane().add(descriptionL);
		//Text Fields
		  //Full Name
		fullName = new JTextField();
		fullName.setBounds(46, 104, 924, 35);
		frame.getContentPane().add(fullName);
		fullName.setColumns(fullName.getColumns());
		fullName.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
	      //Date And Hours
		date = new JTextField();
		date.setBounds(46, 174, 924, 35);
		frame.getContentPane().add(date);
		date.setColumns(date.getColumns());
		date.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		  //Place Description
		placeDescription = new JTextField();
		placeDescription.setBounds(46, 244, 924, 35);
		frame.getContentPane().add(placeDescription);
		placeDescription.setColumns(placeDescription.getColumns());
		placeDescription.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		  //Neighborhood
		neighborhood = new JTextField();
		neighborhood.setBounds(46, 314, 924, 35);
		frame.getContentPane().add(neighborhood);
		neighborhood.setColumns(neighborhood.getColumns());
		neighborhood.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		  //Stolen Object
		stolenObject = new JTextField();
		stolenObject.setBounds(46, 384, 924, 35);
		frame.getContentPane().add(stolenObject);
		stolenObject.setColumns(stolenObject.getColumns());
		stolenObject.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		  //Description
		description = new JTextField();
		description.setBounds(46, 454, 924, 35);
		frame.getContentPane().add(description);
		description.setColumns(description.getColumns());
		description.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		
		// Buttons
		  //Cancel
		cancel = new Button("Cancel");
		cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancel.setBounds(49, 586, 450, 47);
		frame.getContentPane().add(cancel);
		cancel.setForeground(Color.decode("#bd0000"));
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainInter.enableFrame();
				frame.dispose();
			
			}
		});
		  //Save
		save = new Button("Save");
		save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		save.setBounds(543, 586, 450, 47);
		frame.getContentPane().add(save);
		save.setForeground(Color.decode("#00f500"));
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		
		//paint some decoration
		paneBorder = new JLabel("");
		paneBorder.setBorder(new LineBorder(new Color(0, 0, 0), 4, false));
		frame.getContentPane().add(paneBorder);
		paneBorder.setVisible(true);
		paneBorder.setBounds(0,0, 1040, 670);
		
	
		
	}
}
