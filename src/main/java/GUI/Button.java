package GUI;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;



 public class Button extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5495420994055330777L;
	
	public Button(String string) {
		this.setText(string);
		this.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		this.setBorder(new BevelBorder(BevelBorder.RAISED, UIManager.getColor("Button.disabledForeground"), new Color(0, 0, 0), UIManager.getColor("Button.foreground"), new Color(0, 0, 0)));
		this.setBackground(Color.decode("#ffffff"));
	}
 }
 
