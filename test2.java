/*
 //1������
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)");
		float usd;
		String input = a.nextLine();
		int won = Integer.parseInt(input);
		usd = won/1100;
		System.out.println(won + "���� $" + usd + "�Դϴ�.");
		// TODO Auto-generated method stub

	}

}
*/
//2������
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���ڸ��� ���� �Է�(10~99)");
		int num, result1, result2;
		num = a.nextInt();
		result1 = num/10;
		result2 = num%10;
		if (result1 == result2) {
			System.out.print("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}

	}

}
*/
//���� 3��
/*
package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) { 
		int[] coin = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		Scanner s=new Scanner(System.in); 
		System.out.println("�ݾ��� �Է��Ͻÿ�:"); 
		int num=s.nextInt(); 
		for (int i=0; i<coin.length; i++) { 
			System.out.println(coin[i]+"��:" + num/coin[i]); 
			num%= coin[i]; 
		} 
	s.close(); 
	}
}
*/
//���� 4��
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3�� �Է�");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a>=b && a>=c)
		{
			if (b>c)
				System.out.print(b);
			else
				System.out.print(c);
		}
		else if (b>=a && b>=c)
		{
			if (a>c)
				System.out.print(a);
			else
				System.out.print(c);
		}
		else
		{
			if (a>b)
				System.out.print(a);
			else
				System.out.print(b);
		}

	}

}
*/
//���� 6��
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�");
		int a = scan.nextInt();
		if(a/10 == 3 || a/10 == 6 || a/10 == 9) {
			if(a%10==3 || a%10==6 || a%10==9) {
				System.out.print("�ڼ�¦¦");
			}
			
		}
		else{
			if(a%10==3 || a%10==6 || a%10==9) {
				System.out.print("�ڼ�¦");
			}
		}
		

	}

}
*/
//12�� ����
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
	System.out.print("����"); 
	Scanner s=new Scanner(System.in); 
	int op1=s.nextInt(); 
	String op=s.next(); 
	int op2=s.nextInt(); 
	int res=0; 
	if(op.equals("+")) 
		res=op1+op2; 
	else if(op.equals("-")) 
		res=op1-op2; 
	else if(op.equals("*")) 
		res=op1*op2; 
	else if(op.equals("/")) { 
		if(op2==0) { 
			System.out.print("0���� ���� �� �����ϴ�."); 
			s.close(); 
			return; } 
		else res=op1/op2; 
	} 
	else { 
		System.out.print("��Ģ������ �ƴմϴ�.");
	 	s.close(); return; 
	 } 
	 System.out.println(op1+op+op2+"�� �������"+res); 
	 s.close();

	}
}
*/
// 10������
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
	    System.out.println("ù ��° ���� �߽ɰ� ������ �Է�:");
	    Scanner s=new Scanner(System.in); 
	    int x=s.nextInt(); 
	    int x1=s.nextInt(); 
	    double r=s.nextDouble(); 
	    System.out.println("�� ��° ���� �߽ɰ� ������ �Է�:");
	    int y=s.nextInt(); 
	    int y1=s.nextInt();
	    double r1=s.nextDouble(); 
	    double distance=0; 
	    distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
	    if (distance<=r+r1) 
	        System.out.println("�� ���� ���� ��ģ��."); 
	    else System.out.println("�� ���� ���� �Ȱ�ģ��."); 
	    s.close(); 

	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
		int sum =0;
		
		for(int i =1; i<=10; i++) {
			sum +=i;
			System.out.print(i);
			
			if(i<=9) 
				System.out.println("+");
			else { 
				System.out.print("=");
				System.out.print(sum);
			}
			}
		}
		
	}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
		int sum =0;
		int count = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		
		int n = s.nextInt();
		while(n!=-1) {
			sum += n;
			count++;
		}
		
		if(count == 0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������"+ count +"���̸�");
			System.out.print("�����"+ (double)sum/count +"�Դϴ�");
		s.close();
		
		}
		
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
		char c ='a';
		
		do {
			System.out.print(c);
			c = (char)(c+1);
		}while(c<='z');
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"*" + j + "="+ i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum=0;
		
		
		for(int i=1; i<5; i++) {
			int n = s.nextInt();
			if(n<=0)
				continue;
			else
				sum += n;
			
		}
		System.out.println("����� ����"+sum);
		s.close();
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.println("> >");
			String text = s.nextLine();
			if(text.equals("exit")) {
				break;
				}
			}
		
		}
		System.out.println("�����մϴ�");
		s.close();
		
	}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int intArray[] = new int[5];
		
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i<5; i++) {
			intArray[i] = s.nextInt();
			if(intArray[i] >max) {
				max = intArray[i];
			}
			System.out.print("����ū����"+max+"�Դϴ�");
			s.close();
			
		}
		
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int intArray[] = new int[5];
		
		int sum = 0;
		System.out.println(intArray.length+"���� ������ �Է��ϼ���>>");
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = s.nextInt();
			
		}
		for(int i =0; i<intArray.length; i++) {
			sum += intArray[i];
		System.out.print("�����" + (double)sum/intArray.length);
		s.close();
		}
		
	}
}
*/


/*
package test;
import java.util.Scanner;
public class test2 {
enum Week {��, ȭ, ��, ��, ��, ��, ��}
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���", "ü��","����","����"};
		int sum = 0;
		for (int k:n) {
			System.out.print(k + " ");
			sum +=k;
		}
		
		System.out.println("����"+ sum);
		
		for(String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		for (Week day : Week.values()) {
			System.out.print(day + "���� ");
		
		}
		System.out.println();
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int dividend;
			int divisor;
			System.out.print("�������� �Է��Ͻÿ�:");
			dividend = sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ�");
			divisor = sc.nextInt();
			try {
				System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("���ư� �װžƴϾ�");
			}
		}
		sc.close();
		
	}
	
}
*/
/*
package test;
import java.util.Scanner;
import java.util.InputMismatchException;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���");
				sc.nextInt();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("����"+sum);
		sc.close();
		
	}
}
*/
/*
package test;
import java.util.Scanner;
import java.util.InputMismatchException;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���");
				sc.nextInt();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("����"+sum);
		sc.close();
		
	}
}
*/
/*
package test;
import java.util.Scanner;
import java.util.InputMismatchException;
public class test2 {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i =0;
		try {
			for(i=0; i<stringNumber.length;i++);{
				int j=Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ����"+j);
				
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i]);
		}
		
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {
	int radius;
	String name;
	public test2(){}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		test2 pizza;
		pizza = new test2();
		pizza.radius = 10;
		pizza.name ="�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		test2 donut = new test2();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
		
		
	}
}
*/
/*
package test;
import java.util.Scanner;
public class test2 {
	int radius;
	String name;
	public test2(){}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		test2 pizza;
		pizza = new test2();
		pizza.radius = 10;
		pizza.name ="�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		test2 donut = new test2();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
		
		
	}
}
*/
//4-4
/*
package test;
import java.util.Scanner;
public class test2 {

	String title;
	String author;
	
	public test2(String t) {
		title = t; author = "���ڹ̻�";
	}
	
	public test2(String t, String a) {
		title =t; author = a;
	}
	public static void main(String[] args) {
		test2 lp = new test2("�����", "�������丮");
		test2 ls= new test2("������");
		System.out.println(lp.title+" "+lp.author);
		System.out.println(ls.title+" "+ls.author);
		
		
	}
}
*/
//4-5
/*
package test;
import java.util.Scanner;
public class test2 {

	String title;
	String author;
	void show( ) { System.out.println(title + " " + author );}	
	public test2() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public test2(String title) {
		this(title, "���ڹ̻�");
	}
	public test2(String title, String author) {
		this.title = title;  this.author = author;
	}
	public static void main(String[] args) {
		test2 lp = new test2("�����", "�������丮");
		test2 ls= new test2("������");
		test2 emptyBook = new test2();
		ls.show();
		
	}
}
*/
//4-6
/*
package test;
import java.util.Scanner;
class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

}
public class test2 {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for(int i =0; i<c.length; i++)
			c[i] = new Circle(i);
		
		for(int i =0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+" ");
		
	}
}
*/
/*

package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			for(int j =0; j<a-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
*/
//3������
/*
package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			for(int j =0; j<a-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
*/
//4������
//6������
//8������
//10�� ����
//14�� ����
//15�� ����
package test;
import java.util.Scanner;
import java.util.InputMismatchException;
class Concert{
	   private String S[];
	   private String A[];
	   private String B[];
	   private Scanner sc;
	   Concert() {
	      sc = new Scanner(System.in);
	      S = new String[10];
	      A = new String[10];
	      B = new String[10];
	      for(int i=0; i<S.length; i++) {
	         S[i] = "___";
	         A[i] = "___";
	         B[i] = "___";
	      }
	   }
	   public static void printSeat(String seat[]) { //�¼� ���� ��� �޼ҵ�
		      for(int i=0; i<seat.length; i++) {
		         System.out.print(" "+seat[i]+" " );
		      }
		      System.out.println();
		   }
		   public void allPrint() { //��� �¼� ��� �޼ҵ�
		      System.out.print("S>>");
		      Concert.printSeat(S);
		      System.out.print("A>>");
		      Concert.printSeat(A);
		      System.out.print("B>>");
		      Concert.printSeat(B);
		      System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
		   }
		   public void choiceSeat() { //�¼� ����(S, A, B) �޼ҵ�
		      while(true) {
		         System.out.print("�¼����� S(1), A(2), B(3)>>");
		         int select = sc.nextInt();
		         switch(select) {
		         case 1: 
		            System.out.print("S>>");
		            printSeat(S);
		            inputSeat(S);
		            return;
		         case 2:
		            System.out.print("A>>");
		            printSeat(A);
		            inputSeat(A);
		            return;
		         case 3: 
		            System.out.print("B>>");
		            printSeat(B);
		            inputSeat(B);
		            return;
		         default:
		            System.out.println("�ٽ� �Է��� �ּ���.");
		         }
		      }
		   }
		   public void inputSeat(String seat[]) { //�¼��� �̸��� �ִ� �޼ҵ�
		      System.out.print("�̸�>>");
		      String name = sc.next();
		      while(true) {
		         System.out.print("��ȣ>>");
		         int num = sc.nextInt();
		         num--;
		         if(seat[num].equals("___")) {
		            seat[num] = name;
		            break;
		         }
		         else {
		            System.out.println("�ٸ� �¼��� ������ �ּ���.");
		         }
		      }
		   }  
		   public void d_choiceSeat() {
		      while(true) {
		         System.out.print("�¼� S:1, A:2, B:3>>");
		         int select = sc.nextInt();
		         switch(select) {
		         case 1: 
		            System.out.print("S>>");
		            printSeat(S);
		            delete(S);
		            return;
		         case 2:
		            System.out.print("A>>");
		            printSeat(A);
		            delete(A);
		            return;
		         case 3: 
		            System.out.print("B>>");
		            printSeat(B);
		            delete(B);
		            return;
		         default:
		            System.out.println("�ٽ� �Է��� �ּ���.");
		         }
		      }
		   }
		   public void delete(String seat[]) {
		      System.out.print("�̸�>>");
		      String name = sc.next();
		      for(int i=0; i<seat.length; i++) {
		         if(name.equals(seat[i])) {
		            seat[i] = "___";
		            break;
		         }
		      }
		   }
		}
	   
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
	      Concert concert = new Concert();
	      while(true) {
	         System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
	         int select = sc.nextInt();
	         switch(select) {
	         case 1:
	            concert.choiceSeat();
	            break;
	         case 2:
	            concert.allPrint();
	            break;
	         case 3:
	            concert.d_choiceSeat();
	            break;
	         case 4:
	            sc.close();
	            return;
	         default :
	            System.out.println("�ٽ� �Է��� �ּ���.");
	         }
	      }
	   }

}




