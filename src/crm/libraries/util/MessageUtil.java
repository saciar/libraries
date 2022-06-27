package crm.libraries.util;

import java.awt.Component;

import javax.swing.JOptionPane;

public class MessageUtil {
	
	public static void showErrorMessage( String msg ) {
		
		JOptionPane.showMessageDialog( null, msg,
				"Error", JOptionPane.ERROR_MESSAGE );
		
	}
	
	public static void showErrorMessage( Component owner, String msg ) {
		
		JOptionPane.showMessageDialog( owner, msg,
				"Error", JOptionPane.ERROR_MESSAGE );
		
	}
	
	public static void showWarningMessage ( String msg ) {
		
		JOptionPane.showMessageDialog( null, msg,
				"Warning", JOptionPane.WARNING_MESSAGE );
		
	}

	public static void showWarningMessage ( Component owner, String msg ) {
		
		JOptionPane.showMessageDialog( owner, msg,
				"Warning", JOptionPane.WARNING_MESSAGE );
		
	}
	
	public static void showMessage ( String msg ) {
		
		JOptionPane.showMessageDialog( null, msg,
				"Mensaje de información", JOptionPane.INFORMATION_MESSAGE );
		
	}

	public static void showMessage ( Component owner, String msg ) {
		
		JOptionPane.showMessageDialog( owner, msg,
				"Mensaje de información", JOptionPane.INFORMATION_MESSAGE );
		
	}
	
	public static boolean showYesNoMessage(String msg, String title){
	
		Object[] options = {"Yes", "No"};
		int n = JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);			
		
		return n == 0;
	
	}
	
	public static boolean showYesNoMessage(Component owner, String msg, String title){
		
		Object[] options = {"Yes", "No"};
		int n = JOptionPane.showOptionDialog(owner, msg, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

		return n == 0;
	
	}
	
}
