package wataru1stProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WataruP1 extends JFrame implements ActionListener {

//	JLabel label;
	JButton[] oxs = new JButton[9];
	int count = 0;
	
	public static void main(String[] args) {
		WataruP1 wp = new WataruP1("wataru 1st Project");
		wp.setVisible(true);
	}
	
	WataruP1(String title){
		setTitle(title);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpanel = new JPanel();
		jpanel.setBackground(Color.ORANGE);
		jpanel.setLayout(new GridLayout(3,3));
//		label = new JLabel("-");
		
		for(int i = 0; i < 9; i++) {
			oxs[i] = new JButton();
			oxs[i].setText("-");
			oxs[i].setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 150));
			oxs[i].addActionListener(this);
			jpanel.add(oxs[i]);
		}
		
		//oxs.addActionListener(this);
		
//		jpanel.add(label);
		
		//Container contentPane = getContentPane();
		getContentPane().add(jpanel, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 9; i++) {
			if(e.getSource() == oxs[i]) {
				oxs[i].setText(checkTurn(count));
			}
		}
		count++;
	}
	
	String checkTurn(int c) {
		if(c % 2 == 0) {
			return "o";
		}else {
			return "x";
		}
	}

	
}


