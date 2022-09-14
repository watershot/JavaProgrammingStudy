/*
package test4;

import javax.swing.*;
import java.awt.*;

public class test4 extends JFrame {
	public test4() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 frame = new test4();

	}

}
*/
/*
package test4;

import javax.swing.*;
import java.awt.*;

public class test4 extends JFrame {
	public test4() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 frame = new test4();

	}

}
*/
/*
package test4;

import javax.swing.*;
import java.awt.*;

public class test4 extends JFrame {
	public test4() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30,20));
		
		c.add(new JButton("OK"),BorderLayout.CENTER);
		c.add(new JButton("Cancel"), BorderLayout.NORTH);
		c.add(new JButton("Ignore"),BorderLayout.SOUTH);
		c.add(new JButton("1"), BorderLayout.EAST);
		c.add(new JButton("2"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 frame = new test4();

	}

}
*/
/*
package test4;

import javax.swing.*;
import java.awt.*;

public class test4 extends JFrame {
	public test4() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout g = new GridLayout(4,2);
		g.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(g);
		
		c.add(new JLabel("OK"));
		c.add(new JTextField(""));
		c.add(new JLabel("Cancel"));
		c.add(new JTextField(""));
		c.add(new JLabel("Ignore"));
		c.add(new JTextField(""));
		c.add(new JLabel("1"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 frame = new test4();

	}

}
*/

package test4;

import javax.swing.*;
import java.awt.*;

public class test4 extends JFrame {
	public test4() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("hello, Press Button!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 frame = new test4();

	}

}