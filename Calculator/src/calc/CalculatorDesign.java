package calc;

import javax.swing.*;

import java.awt.*;

/**
 * 
 * @author EMR24 Create JFrame and its size and add CalculatorPanel
 */
public class CalculatorDesign {

	public static void main(String[] args) {

		JFrame frame = new JFrame("CALCULATOR");

		frame.setPreferredSize(new Dimension(350, 520));
		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 20));
		frame.getContentPane().add(new CalculatorPanel());
		frame.pack();
		frame.setVisible(true);

	}
}
