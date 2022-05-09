package GUI;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;



 public class Text extends JTextArea {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5495420994055330777L;
	
	public Text(String string) {
		this.setText(string);
		this.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		this.setBackground(Color.decode("#ffffff"));
		this.setForeground(Color.decode("#000000"));
		this.setBounds(28, 35, 550, 400);
		this.setEditable(false);
	}
 }
 
