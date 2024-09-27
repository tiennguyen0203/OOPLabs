package JavaIntro;
import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNum1, secondNum2;
		
		firstNum1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number: ",
				"Input the first number", JOptionPane.INFORMATION_MESSAGE));
		
		secondNum2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number: ",
				"Input the second number", JOptionPane.INFORMATION_MESSAGE));
		
		
		double sum = firstNum1 + secondNum2;
		double diff = firstNum1 - secondNum2;
		double prod = firstNum1 * secondNum2;
		double div = firstNum1 / secondNum2;
		
		
		
		
		JOptionPane.showMessageDialog(null, "Two number is: " + firstNum1 + " and " + secondNum2 + 
				"\n\nSum: " + sum + "\nDiff: " + diff + "\nProduct: " + prod + "\nDivide: " + div, 
					"Operation of two double number", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
