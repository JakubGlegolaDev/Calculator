import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorGUI implements ActionListener{
	
	private JFrame frame;
	private JButton one, two, three, four, five, six, seven, eight, nine, plus, minus, division, multiplication, dot, delete, equals;
	private JTextField text;
	private final int bWidth = 80, bHeight = 80;
	

	public CalculatorGUI(int width, int height, String name) {
	
	///////////////////////////////
	////////// FRAME /////////////
	///////////////////////////////	
	frame = new JFrame(name);
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	
	//////////////////////////////
	/////////TEXT FIELD///////////
	//////////////////////////////
	text = new JTextField("");
	text.setBounds(70, 135, 420, 90);
	text.setEditable(false);
	frame.add(text);
	
	//////////////////////////////
	////////// BUTTONS //////////
	//////////////////////////////
	one = new JButton("1");
	one.setBounds(70, 230, bWidth, bHeight);
	frame.add(one);
	
	two = new JButton("2");
	two.setBounds(155, 230, bWidth, bHeight);
	frame.add(two);
	
	three = new JButton("3");
	three.setBounds(240, 230, bWidth, bHeight);
	frame.add(three);
	
	four = new JButton("4");
	four.setBounds(70, 315, bWidth, bHeight);
	frame.add(four);
	
	five = new JButton("5");
	five.setBounds(155, 315, bWidth, bHeight);
	frame.add(five);
	
	six = new JButton("6");
	six.setBounds(240, 315, bWidth, bHeight);
	frame.add(six);
	
	seven = new JButton("7");
	seven.setBounds(70, 400, bWidth, bHeight);
	frame.add(seven);
	
	eight = new JButton("8");
	eight.setBounds(155, 400, bWidth, bHeight);
	frame.add(eight);
	
	nine = new JButton("9");
	nine.setBounds(240, 400, bWidth, bHeight);
	frame.add(nine);
	
	plus = new JButton("+");
	plus.setBounds(325, 230, bWidth, bHeight);
	frame.add(plus);
	
	minus = new JButton("-");
	minus.setBounds(325, 315, bWidth, bHeight);
	frame.add(minus);
	
	multiplication = new JButton("*");
	multiplication.setBounds(410, 230, bWidth, bHeight);
	frame.add(multiplication);
	
	division = new JButton("/");
	division.setBounds(410, 315, bWidth, bHeight);
	frame.add(division);
	
	dot = new JButton(".");
	dot.setBounds(325, 400, bWidth, bHeight);
	frame.add(dot);
	
	delete = new JButton("DELETE");
	delete.setBounds(410, 400, bWidth, bHeight);
	frame.add(delete);
	
	equals = new JButton("=");
	equals.setBounds(70, 485, 420, 40);
	frame.add(equals);
	
	////////////////////////////////////////////
	//////////// ACTION LISTENERS //////////////
	////////////////////////////////////////////
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	plus.addActionListener(this);
	minus.addActionListener(this);
	division.addActionListener(this);
	multiplication.addActionListener(this);
	dot.addActionListener(this);
	delete.addActionListener(this);
	equals.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object buttonSource = e.getSource();
		
		if(buttonSource==one) {
			text.setText("1");           // Idea: make update, not set, with every button click change the result on real time.
		}
		
	}
}
