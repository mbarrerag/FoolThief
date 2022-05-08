package GUI;

import com.mycompany.foolthief.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import java.util.ArrayList;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;

import javax.swing.border.LineBorder;


import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.JPanel;

public class MainInter {

	public static JFrame frame;
	private JLabel title;
	private JLabel paneBorder;
	private JLabel icon;
	public static JTextArea lblNewLabel;
	public static JLabel label;
	private JScrollPane scrollRecent;
	private Button insert;
	private Button modify;
	private Button viewMore;
	private Button highlyStolen;
	private Button highlyDangerous;
	private Button eliminate;
	public static JPanel panel;
	public static DynamicArrayJLabel SLabels;
        
        // Clase que contiene todas las estructuras
        public static Controller controller = new Controller(); 
        
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
	 * @throws IOException 
	 */
	public MainInter() throws IOException {
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
		frame.setBounds(size.width/7, size.height/7, 1272, 729);
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
		icon.setIcon(new ImageIcon(image));
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
		
		panel = new JPanel();
		panel.setBounds(32, 95, 777, 567);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(900, 1400));
		panel.setBackground(Color.decode("#ffffff"));
		scrollRecent.setViewportView(panel);
		
		lblNewLabel = new JTextArea("    Id:       " + panel.getWidth() +  "       Date:     " + panel.getWidth() + "      Hour:   "+ panel.getHeight()+ '\n'+'\n'+ "     Neighbornhood:     "+  panel.getWidth() +"     Object:     " + panel.getWidth() + "     Modus:     "+panel.getWidth());
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setBounds(0, 0, 0, 0);
		lblNewLabel.setVisible(false);
		panel.add(lblNewLabel);
		
		
		
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
		
		/*//paint some decoration
		paneBorder = new JLabel("");
		paneBorder.setBorder(new LineBorder(new Color(0, 0, 0), 4, false));
		frame.getContentPane().add(paneBorder);
		paneBorder.setVisible(true);
		paneBorder.setBounds(0,0, 1256, 690);*/
	}
	
	public static void addLabel(String id, String date, String hour, String neighbornhood, String object,String modus) {
		JTextArea text = new JTextArea("    Id:       " + id +  "       Date:     " + date + "      Hour:   "+ hour+ '\n'+'\n'+ "     Neighbornhood:     "+  neighbornhood +"     Object:     " + object + "     Modus:     "+modus);
		Point location = lblNewLabel.getLocation();
		text.setBounds(location.x+28, location.y+28, 769, 134);
		text.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		text.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		text.setEditable(false);
		text.setVisible(true);
		lblNewLabel.setBounds(location.x, location.y+134, 769, 134);
		panel.add(text);
		frame.revalidate();
		frame.repaint();
	}
	public static void enableFrame() {
		frame.setEnabled(true);
	}
}
