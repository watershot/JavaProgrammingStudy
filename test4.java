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
/*
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
*/
/*
package test4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test4 extends JFrame{
	test4(){
		setTitle("Open Challenge 9"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); 
		
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test4();
	}
	
}
class NorthPanel extends JPanel{ 
	NorthPanel(){
		setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}
}
class CenterPanel extends JPanel{ 
	CenterPanel(){
		this.setLayout(null);
		String text[] = {"Hello", "Java", "Love"};
		int x;
		int y;
		JLabel label;
		for(int i=0;i<3;i++) {
			x = (int)(Math.random()*250); 
			y = (int)(Math.random()*250);
			label = new JLabel(text[i]);
			label.setLocation(x, y); 
			label.setSize(50,10); 
			this.add(label);
		}
	}
}
*/
/*
package test4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test4 extends JFrame {
	test4() {
		setTitle("Ten Color Buttons Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		for(int i=0; i<16; i++) {
			
			Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA, 
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
					Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE};
			JLabel label=new JLabel(i+"");
			label.setBackground(col[i]);
			label.setOpaque(true);
			c.add(label);
			}	
		setVisible(true);
	}
	public static void main(String[] args) {
		new test4();
	}
}
*/
/*
package test4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test4 extends JFrame {
	
	test4() {
		setTitle("계산기 프레임");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		JPanel pn=new JPanel();
		JPanel ps=new JPanel();
		JPanel pc=new JPanel();
		
		pn.setBackground(Color.LIGHT_GRAY);
		pc.setLayout(new GridLayout(4,4));
		ps.setBackground(Color.YELLOW);

		c.add(pc);
		c.add(pn, BorderLayout.NORTH);
		c.add(ps, BorderLayout.SOUTH);
		
		JLabel l1=new JLabel("수십입력");
		JTextField tf1=new JTextField(10);
		pn.add(l1);
		pn.add(tf1);
		
		JLabel l2=new JLabel("계산결과");
		JTextField tf2=new JTextField(10);
		ps.add(l2);
		ps.add(tf2);
		
		for(int i=0; i<16; i++) {
			JButton b=new JButton();
			String[] str= {"CE","Enter","+","-","x","/"};
			pc.add(b);
			if(i<10) {
				b.setText(i+"");
			}else { 
				b.setText(str[i-10]);
			}
			if(i>11) {
				//b.setBackground(Color.CYAN);
				b.setOpaque(true);
			}
		}
		setVisible(true);
			}	
	
	public static void main(String[] args) {
		new test4();
	}
}
*/
/*
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
*/
/*
package test4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test4 extends JFrame{
		private JLabel la = new JLabel("Love Java");
		
		public test4() {
			setTitle("마우스 올리기 내리기 예제"); 
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel label = new JLabel("Love Java");
			label.addMouseListener(new MyMouseAdapter());
			label.setSize(200,50);
			add(label);
			setSize(400,200);
			setVisible(true);
			
		}
		class MyMouseAdapter extends MouseAdapter{
			public void mouseEntered(MouseEvent e) {
				JLabel l = (JLabel)e.getSource();
				l.setText("사랑해");
			}
			public void mouseExited(MouseEvent e) {
				JLabel l = (JLabel)e.getSource();
				l.setText("Love Java");
			}
		}
		
			
	public static void main(String[] args) {
		new test4();
	}
}
*/
/*
package test4;

public class test4 {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 85;
		if(count >= 90) {
			System.out.println("if문: 합격(장학생)");
			
			
		}
		else if (count >= 60) {
			System.out.println("if문 합격");
			
		}
		else {
			System.out.println("if문 불합격");
		}
		int jumsu = (count/10)*10;
		switch(jumsu) {
		case 100:
		case 90:
			System.out.println("switch문 합격");
			break;
		case 80:
		case 70:
		case 60:
			System.out.println("switch문: 합격");
			break;
		default:
			System.out.println("switch문 불합격");
		}
	}

}
*/
/*
package test4;

public class test4{
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[] = new int[3];
		for (int i = 0; i < one.length; i++) {
			one[i] = 10*i;
		}
		String two[] = {"하나", "둘", "셋"};
		for (String str : two) {
			System.out.println(str);
		}
		int j=0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}
	}

}
*/

package test4;


/*
package test4;

public class test4{
	
	public static void main(String[] args) {
		int var1 = 10;
		float var2 = 10.1f;
		double var3 = 10.2;
		char var4 = '안';
		String var5 = "안드로이드";
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
*/
/*
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
import javax.swing.JFrame;
 
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(new mouseListener());
		c.addMouseMotionListener(new motionListener());
		setSize(300,300);
		setVisible(true);
	}
	
	public class motionListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.yellow);
		}
	}
	
	public class mouseListener extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
}
 
public class test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}

*/
/*
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		c.add(j);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					String text=j.getText();
					j.setText(text.substring(1)+text.charAt(0));
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
}
 
public class test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
*/
/*
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		j.setFont(new Font("Arial",Font.PLAIN,10));
		c.add(j);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				Font temp=j.getFont();
				int size=temp.getSize();
				if(e.getKeyCode()==KeyEvent.VK_ADD||e.getKeyCode()==KeyEvent.VK_EQUALS) {
					j.setFont(new Font("Arial",Font.PLAIN,size+5));					
				}
				if(e.getKeyCode()==KeyEvent.VK_MINUS||e.getKeyCode()==KeyEvent.VK_SUBTRACT) {
					if(size-5>0) {
						j.setFont(new Font("Arial",Font.PLAIN,size-5));
					}
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
}
 
public class test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
*/

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel j=new JLabel("c");
		j.setBounds(100,100,10,10);
		j.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x=(int)(Math.random()*c.getWidth());
				int y=(int)(Math.random()*c.getHeight());
				j.setLocation(x,y);
			}
		});
		
		c.add(j);
		
		setSize(300,300);
		setVisible(true);
	}
}
 
public class test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}