package calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class CalculatorPanel extends JPanel {
	/**
	 * Create JComponents and variables
	 * 
	 */
	JLabel label1;
	boolean Operand = false;
	double total;
	String one, two, three, four, five, six, seven, eight, nine, zero;
	String val = "0", lastOperator = "", tempVar = "", operator = "";
	double a = 0;
	double t = 0;
	double t1 = 0;
	double x = 0;
	int t2 = 0;
	JButton button1, decimal, plus, mc, mr, ms, mp, mm;
	JButton button2, minus, equal, log, ln, cos, sin, tan;
	JButton button3, multiply, divide;
	JButton button4, clear, backspace, sqrt, doover, plusminus, j;
	JButton button5, percent;
	JButton button6, reciprocal;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JTextField field1;

	public CalculatorPanel() {

		/**
		 * Create font and sizefor JTextfield and buttons
		 */
		Font myfontfield = new Font("Helvetica", Font.BOLD, 25);
		Font myfont = new Font("Helvetica", Font.BOLD, 15);
		setBackground(Color.BLUE);
		Dimension dim = new Dimension(60, 50);

		/**
		 * Initialize and add JTexfield and buttons and its attributes
		 */
		field1 = new JTextField("0", 15);
		add(field1, BorderLayout.NORTH);
		field1.setFont(myfontfield);
		field1.setPreferredSize(new Dimension(100, 90));
		field1.setHorizontalAlignment(JTextField.RIGHT);
		field1.setBackground(Color.white);
		field1.setForeground(Color.red);
		field1.setEditable(false);

		mc = new JButton("MC");
		add(mc);
		mc.addActionListener(new ButtonsListener());
		mc.setFont(myfont);
		mc.setPreferredSize(dim);

		mr = new JButton("MR");
		add(mr);
		mr.addActionListener(new ButtonsListener());
		mr.setFont(myfont);
		mr.setPreferredSize(dim);

		ms = new JButton("MS");
		add(ms);
		// ms.addActionListener(new ButtonsListener());
		ms.setFont(myfont);
		ms.setPreferredSize(dim);

		mp = new JButton("M+");
		add(mp);
		mp.addActionListener(new ButtonsListener());
		mp.setFont(myfont);
		mp.setPreferredSize(dim);

		mm = new JButton("M-");
		add(mm);
		mm.addActionListener(new ButtonsListener());
		mm.setFont(myfont);
		mm.setPreferredSize(dim);

		backspace = new JButton("<--");
		add(backspace);
		backspace.setFont(myfont);
		backspace.setPreferredSize(dim);

		doover = new JButton("CE");
		add(doover);
		doover.setFont(myfont);
		doover.setPreferredSize(dim);

		clear = new JButton("C");
		add(clear);
		clear.addActionListener(new ButtonsListener());
		clear.setFont(myfont);
		clear.setPreferredSize(dim);

		plusminus = new JButton("+/-");
		add(plusminus);
		plusminus.setFont(myfont);
		plusminus.setPreferredSize(dim);

		sqrt = new JButton("\u221A");
		add(sqrt);
		sqrt.addActionListener(new ButtonsListener());
		sqrt.setFont(myfont);
		sqrt.setPreferredSize(dim);

		button7 = new JButton("7");
		add(button7);
		button7.addActionListener(new ButtonsListener());
		button7.setFont(myfont);
		button7.setPreferredSize(dim);

		button8 = new JButton("8");
		add(button8);
		button8.addActionListener(new ButtonsListener());
		button8.setFont(myfont);
		button8.setPreferredSize(dim);

		button9 = new JButton("9");
		add(button9);
		button9.addActionListener(new ButtonsListener());
		button9.setFont(myfont);
		button9.setPreferredSize(dim);

		divide = new JButton("/");
		add(divide);
		divide.addActionListener(new ButtonsListener());
		divide.setFont(myfont);
		divide.setPreferredSize(dim);

		percent = new JButton("%");
		add(percent);
		percent.setFont(myfont);
		percent.setPreferredSize(dim);

		button4 = new JButton("4");
		button4.setSize(50, 50);
		add(button4);
		button4.addActionListener(new ButtonsListener());
		button4.setFont(myfont);
		button4.setPreferredSize(dim);

		button5 = new JButton("5");
		button5.setSize(70, 70);
		add(button5);
		button5.addActionListener(new ButtonsListener());
		button5.setFont(myfont);
		button5.setPreferredSize(dim);

		button6 = new JButton("6");
		button6.setSize(70, 70);
		add(button6);
		button6.addActionListener(new ButtonsListener());
		button6.setFont(myfont);
		button6.setPreferredSize(dim);

		multiply = new JButton("*");
		add(multiply);
		multiply.addActionListener(new ButtonsListener());
		multiply.setFont(myfont);
		multiply.setPreferredSize(dim);

		reciprocal = new JButton("1/x");
		add(reciprocal);
		reciprocal.setFont(myfont);
		reciprocal.setPreferredSize(dim);

		button1 = new JButton("1");
		button1.setSize(100, 70);
		add(button1);
		button1.addActionListener(new ButtonsListener());
		button1.setFont(myfont);
		button1.setPreferredSize(dim);

		button2 = new JButton("2");
		button2.setSize(70, 70);
		add(button2);
		button2.addActionListener(new ButtonsListener());
		button2.setFont(myfont);
		button2.setPreferredSize(dim);

		button3 = new JButton("3");
		button3.addActionListener(new ButtonsListener());
		add(button3);
		button3.setFont(myfont);
		button3.setPreferredSize(dim);

		minus = new JButton("-");
		add(minus);
		minus.addActionListener(new ButtonsListener());
		minus.setFont(myfont);
		minus.setPreferredSize(dim);

		j = new JButton("x^2");
		add(j);
		j.addActionListener(new ButtonsListener());
		j.setFont(myfont);
		j.setPreferredSize(dim);

		log = new JButton("log");
		add(log);
		log.addActionListener(new ButtonsListener());
		log.setFont(myfont);
		log.setPreferredSize(dim);

		ln = new JButton("ln");
		add(ln);
		ln.addActionListener(new ButtonsListener());
		ln.setFont(myfont);
		ln.setPreferredSize(dim);

		cos = new JButton("cos");
		add(cos);
		cos.addActionListener(new ButtonsListener());
		cos.setFont(myfont);
		cos.setPreferredSize(dim);

		sin = new JButton("sin");
		add(sin);
		sin.addActionListener(new ButtonsListener());
		sin.setFont(myfont);
		sin.setPreferredSize(dim);

		tan = new JButton("tan");
		add(tan);
		tan.addActionListener(new ButtonsListener());
		tan.setFont(myfont);
		tan.setPreferredSize(dim);

		button0 = new JButton("0");
		add(button0);
		button0.addActionListener(new ButtonsListener());
		button0.setFont(myfont);
		button0.setPreferredSize(new Dimension(125, 50));

		decimal = new JButton(".");
		add(decimal);
		decimal.addActionListener(new ButtonsListener());
		decimal.setFont(myfont);
		decimal.setPreferredSize(dim);

		plus = new JButton("+");
		add(plus);
		plus.addActionListener(new ButtonsListener());
		plus.setFont(myfont);
		plus.setPreferredSize(dim);

		equal = new JButton("=");
		add(equal);
		equal.addActionListener(new ButtonsListener());
		equal.setFont(myfont);
		equal.setPreferredSize(new Dimension(dim));

	}

	/**
	 * 
	 * @author EMR24 Action events for all buttons in calculator
	 */

	public class ButtonsListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == mc) {

				a = 0;
				mc.setBackground(Color.yellow);

			}

			if (event.getSource() == mr) {

				field1.setText("");
				String num = String.valueOf(a);
				field1.setText(num);
				mr.setBackground(Color.yellow);

			}
			if (event.getSource() == mp) {

				String num = field1.getText();
				a += Double.parseDouble(num);
				field1.setText("");
				mp.setBackground(Color.yellow);
			}
			if (event.getSource() == mm) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				a = a - num2;
				field1.setText("");
				mm.setBackground(Color.yellow);
			}
			if (event.getSource() == button1) {

				one = "1";
				field1.setText(field1.getText() + one);
				button1.setBackground(Color.yellow);

			}
			if (event.getSource() == button2) {
                
				two = "2";
				field1.setText(field1.getText() + two);
				button2.setBackground(Color.yellow);

			}
			if (event.getSource() == button3) {

				three = "3";
				field1.setText(field1.getText() + three);
				button3.setBackground(Color.yellow);

			}
			if (event.getSource() == button4) {

				four = "4";
				field1.setText(field1.getText() + four);
				button4.setBackground(Color.yellow);

			}
			if (event.getSource() == button5) {

				five = "5";
				field1.setText(field1.getText() + five);
				button5.setBackground(Color.yellow);

			}
			if (event.getSource() == button6) {

				six = "6";
				field1.setText(field1.getText() + six);
				button6.setBackground(Color.yellow);

			}
			if (event.getSource() == button7) {

				seven = "7";
				field1.setText(field1.getText() + seven);
				button7.setBackground(Color.yellow);

			}
			if (event.getSource() == button8) {

				eight = "8";
				field1.setText(field1.getText() + eight);
				button8.setBackground(Color.yellow);

			}
			if (event.getSource() == button9) {

				nine = "9";
				field1.setText(field1.getText() + nine);
				button9.setBackground(Color.yellow);

			}
			if (event.getSource() == button0) {

				zero = "0";
				field1.setText(field1.getText() + zero);
				button0.setBackground(Color.yellow);

			}

			if (event.getSource() == sqrt) {
				try {
					String num = field1.getText();
					double num2 = Double.parseDouble(num);
					num2 = Math.sqrt(num2);
					num = String.valueOf(num2);
					field1.setText(num);
					sqrt.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error please try again");
				}
			}

			if (event.getSource() == j) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				num2 = num2 * num2;
				num = String.valueOf(num2);
				field1.setText(num);
				j.setBackground(Color.yellow);

			}

			if (event.getSource() == ln) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				double num3 = Math.log(num2);
				num = String.valueOf(num3);
				field1.setText(num);
				ln.setBackground(Color.yellow);

			}

			if (event.getSource() == cos) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				double num3 = Math.cos(num2);
				num = String.valueOf(num3);
				field1.setText(num);
				cos.setBackground(Color.yellow);

			}
			if (event.getSource() == sin) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				double num3 = Math.sin(num2);
				num = String.valueOf(num3);
				field1.setText(num);
				sin.setBackground(Color.yellow);

			}
			if (event.getSource() == tan) {

				String num = field1.getText();
				double num2 = Double.parseDouble(num);
				double num3 = Math.tan(num2);
				num = String.valueOf(num3);
				field1.setText(num);
				tan.setBackground(Color.yellow);

			}
			if (event.getSource() == plus) {
				try {
					t = Double.parseDouble(field1.getText());

					field1.setText("");
					t2 = 1;
					plus.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}

			if (event.getSource() == minus) {

				try {
					t = Double.parseDouble(field1.getText());
					field1.setText("");
					t2 = 2;
					minus.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}

			if (event.getSource() == divide) {
				try {
					t = Double.parseDouble(field1.getText());
					field1.setText("");
					t2 = 3;
					divide.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}
			if (event.getSource() == multiply) {
				try {
					t = Double.parseDouble(field1.getText());
					field1.setText("");
					t2 = 4;
					multiply.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}

			if (event.getSource() == percent) {

				try {
					field1.setText(field1.getText() + zero);
					val += "0";
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}
			if (event.getSource() == equal) {
				try {
					t1 = Double.parseDouble(field1.getText());
					Operate(t2);
					String num2 = String.valueOf(x);
					field1.setText(num2);
					equal.setBackground(Color.yellow);
					t1 = 0;
					t = 0;
					field1.setBackground(Color.yellow);
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}
			if (event.getSource() == clear) {
				field1.setText("0");
				field1.setBackground(Color.white);
				clear.setBackground(Color.yellow);
			}
			if (event.getSource() == decimal) {
				try {
					String deci = ".";
					field1.setText(field1.getText() + deci);
					val += ".";
				} catch (NumberFormatException e) {
					field1.setText("Error! Please start over");
				}

			}

		}

	}

	/**
	 * Switch case function to determine what type of operation is taking place.
	 * 
	 * @param a
	 */

	public void Operate(int a) {

		int sum;
		int operation = a;
		switch (operation) {

		case 1:
			total = t + t1;
			break;

		case 2:
			total = t - t1;
			break;

		case 3:
			total = t / t1;
			break;

		case 4:
			total = t * t1;
			break;

		}

		x = total;

	}

}
