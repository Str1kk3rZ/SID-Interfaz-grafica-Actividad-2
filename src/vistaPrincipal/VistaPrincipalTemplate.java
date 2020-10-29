package src.vistaPrincipal;

import javax.swing.JFrame;

public class VistaPrincipalTemplate extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public VistaPrincipalTemplate() {
		super("Vista principal");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
	}
}