package GUI;

import com.mycompany.foolthief.Controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;


import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Dimension;

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
	private JTextField hour;
	private JTextField placeDescription;
	private JTextField neighborhood;
	private JTextField stolenObject;
	private JTextField description;
	private JTextField modusOperandi;
	private Label fullNameL;
	private Label dateL;
	private Label hourL;
	private Label placeDescriptionL;
	private Label neighborhoodL;
	private Label stolenObjectL;
	private Label descriptionL;
	private Label modusOperandiL;
        

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
	 * @throws IOException 
	 */
	public InsertWin() throws IOException {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		URL url = new URL("https://github.com/MillerBarrera/FoolThief/blob/master/IMG/edit.png?raw=true");
		Image image = ImageIO.read(url);
		URL url2 = new URL("https://github.com/MillerBarrera/FoolThief/blob/master/IMG/WhatsApp%20Image%202022-05-04%20at%2012.56.47%20AM.jpeg?raw=true");
		Image image2 = ImageIO.read(url2);
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("FoolThief");
		frame.setIconImage(image2);
		frame.setBounds(size.width/7, size.height/7, 1040, 670);
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
		icon.setIcon(new ImageIcon(image));
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
		  //Date
		dateL = new Label("-Write here the date ");
		dateL.setBounds(46, 150, 460, 26);
		frame.getContentPane().add(dateL);
		  //Hours
		hourL = new Label(" & hour the object was stolen");
		hourL.setBounds(510, 150, 460, 26);
	    frame.getContentPane().add(hourL);
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
		//Modus Operandi
		modusOperandiL = new Label("-Write here the stealing method");
		modusOperandiL.setBounds(46, 500, 924, 26);
		frame.getContentPane().add(modusOperandiL);
		
		
		//Text Fields
		  //Full Name
		fullName = new JTextField();
		fullName.setBounds(46, 104, 924, 35);
		frame.getContentPane().add(fullName);
		fullName.setColumns(fullName.getColumns());
		fullName.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
	      //Date And Hours
		date = new JTextField();
		date.setBounds(46, 174, 460, 35);
		frame.getContentPane().add(date);
		date.setColumns(date.getColumns());
		date.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		  //Date And Hours
		hour = new JTextField();
		hour.setBounds(510, 174, 460, 35);
		frame.getContentPane().add(hour);
		hour.setColumns(date.getColumns());
		hour.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
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
		 //ModusOprandi
		modusOperandi = new JTextField();
		modusOperandi.setBounds(46, 524, 924, 35);
		frame.getContentPane().add(modusOperandi);
		modusOperandi.setColumns(description.getColumns());
		modusOperandi.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		
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
			
                        String nameObj = fullName.getText();
                        String dateObj = date.getText();
                        String hourObj = hour.getText();
                        String objectObj = stolenObject.getText();
                        String placeObj = placeDescription.getText();
                        String neightborhoodObj= neighborhood.getText();
                        String descriptionObj = description.getText();
                        String modusoperandiObj = modusOperandi.getText();
                        
                        
                        
                        MainInter.controller.insertData(nameObj, dateObj, hourObj, objectObj, placeObj, neightborhoodObj, descriptionObj ,modusoperandiObj);
                        MainInter.addLabel(neightborhoodObj, dateObj, hourObj, descriptionObj, objectObj, modusoperandiObj);
    /*Desde aqui*/	
                        
                        MainInter.enableFrame();
				frame.setVisible(false);
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
