package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;



 public class Label extends JLabel {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Label(String string) {
		this.setText(string);
		this.setHorizontalAlignment(SwingConstants.LEFT);
		this.setFont(new Font("Century Gothic", Font.PLAIN, 20));
	}
 }
 

 
