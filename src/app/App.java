package src.app;
import javax.swing.SwingUtilities;

import src.app.login.LogicTemplate;
import src.vistaPrincipal.*;

public class App {
	public static void main(String[] args) {
		Runnable runApplication = new Runnable(){
			@Override
			public void run(){
				LogicTemplate login = new LogicTemplate();
			login.setVisible(true);
			}
			
		};
		SwingUtilities.invokeLater(runApplication);
	}

}