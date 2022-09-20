package test4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	class NorthPanel extends JPanel{
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
		//	setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Close"));
			add(new JButton("Exit"));
		}
	}
	class CenterPanel extends JPanel{
		public CenterPanel() {
			setLayout(null);
			for (int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*250);
				JLabel label=new JLabel("*");
                label.setForeground(Color.GREEN);
				label.setLocation(x,y);
				label.setSize(20, 20);
				label.setOpaque(true);
				add(label);
				}
		}
	}
	class SouthPanel extends JPanel{
			public SouthPanel() {
			setBackground(Color.YELLOW);
			add(new JButton("Integer Input"));
			add(new TextField(15));
		}
	}
	
public class test4 extends JFrame{
		test4(){
			setTitle("여러 개의 패널을 가진 프레임");
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	NorthPanel nP=new NorthPanel();
    CenterPanel nC=new CenterPanel();
	SouthPanel nS=new SouthPanel();
	add(nP, BorderLayout.NORTH);
	add(nS, BorderLayout.SOUTH);
	add(nC);
	setVisible(true);
	}	

	public static void main(String[] args) {
		new test4();
	}
}