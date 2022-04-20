/*
 //1번문제
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)");
		float usd;
		String input = a.nextLine();
		int won = Integer.parseInt(input);
		usd = won/1100;
		System.out.println(won + "원은 $" + usd + "입니다.");
		// TODO Auto-generated method stub

	}

}
*/
//2번문제
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("두자리의 정수 입력(10~99)");
		int num, result1, result2;
		num = a.nextInt();
		result1 = num/10;
		result2 = num%10;
		if (result1 == result2) {
			System.out.print("yes! 10의 자리와 1의 자리가 같습니다.");
		}

	}

}
*/
//문제 3번
/*
package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) { 
		int[] coin = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		Scanner s=new Scanner(System.in); 
		System.out.println("금액을 입력하시오:"); 
		int num=s.nextInt(); 
		for (int i=0; i<coin.length; i++) { 
			System.out.println(coin[i]+"원:" + num/coin[i]); 
			num%= coin[i]; 
		} 
	s.close(); 
	}
}
*/
//문제 4번
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력");
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
//문제 6번
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오");
		int a = scan.nextInt();
		if(a/10 == 3 || a/10 == 6 || a/10 == 9) {
			if(a%10==3 || a%10==6 || a%10==9) {
				System.out.print("박수짝짝");
			}
			
		}
		else{
			if(a%10==3 || a%10==6 || a%10==9) {
				System.out.print("박수짝");
			}
		}
		

	}

}
*/
//12번 문제
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
	System.out.print("연산"); 
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
			System.out.print("0으로 나눌 수 없습니다."); 
			s.close(); 
			return; } 
		else res=op1/op2; 
	} 
	else { 
		System.out.print("사칙연산이 아닙니다.");
	 	s.close(); return; 
	 } 
	 System.out.println(op1+op+op2+"의 계산결과는"+res); 
	 s.close();

	}
}
*/
// 10번문제
/*
package test;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) { 
	    System.out.println("첫 번째 원의 중심과 반지름 입력:");
	    Scanner s=new Scanner(System.in); 
	    int x=s.nextInt(); 
	    int x1=s.nextInt(); 
	    double r=s.nextDouble(); 
	    System.out.println("두 번째 원의 중심과 반지름 입력:");
	    int y=s.nextInt(); 
	    int y1=s.nextInt();
	    double r1=s.nextDouble(); 
	    double distance=0; 
	    distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
	    if (distance<=r+r1) 
	        System.out.println("두 원은 서로 겹친다."); 
	    else System.out.println("두 원은 서로 안겹친다."); 
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
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		
		int n = s.nextInt();
		while(n!=-1) {
			sum += n;
			count++;
		}
		
		if(count == 0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는"+ count +"개이며");
			System.out.print("평균은"+ (double)sum/count +"입니다");
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
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		
		
		for(int i=1; i<5; i++) {
			int n = s.nextInt();
			if(n<=0)
				continue;
			else
				sum += n;
			
		}
		System.out.println("양수의 합은"+sum);
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
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.println("> >");
			String text = s.nextLine();
			if(text.equals("exit")) {
				break;
				}
			}
		
		}
		System.out.println("종료합니다");
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
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i<5; i++) {
			intArray[i] = s.nextInt();
			if(intArray[i] >max) {
				max = intArray[i];
			}
			System.out.print("가장큰수는"+max+"입니다");
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
		System.out.println(intArray.length+"개의 정수를 입력하세요>>");
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = s.nextInt();
			
		}
		for(int i =0; i<intArray.length; i++) {
			sum += intArray[i];
		System.out.print("평균은" + (double)sum/intArray.length);
		s.close();
		}
		
	}
}
*/


/*
package test;
import java.util.Scanner;
public class test2 {
enum Week {월, 화, 수, 목, 금, 토, 일}
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"사과","배","바나나", "체리","딸기","포도"};
		int sum = 0;
		for (int k:n) {
			System.out.print(k + " ");
			sum +=k;
		}
		
		System.out.println("합은"+ sum);
		
		for(String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		for (Week day : Week.values()) {
			System.out.print(day + "요일 ");
		
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
			System.out.print("나뉨수를 입력하시오:");
			dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오");
			divisor = sc.nextInt();
			try {
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("돌아가 그거아니야");
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
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시입력하세요");
				sc.nextInt();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("합은"+sum);
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
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시입력하세요");
				sc.nextInt();
				i--;
				continue;
			}
			sum +=n;
		}
		System.out.println("합은"+sum);
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
				System.out.println("숫자로 변환된 값은"+j);
				
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
		pizza.name ="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		test2 donut = new test2();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
		
		
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
		pizza.name ="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		test2 donut = new test2();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
		
		
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
		title = t; author = "작자미상";
	}
	
	public test2(String t, String a) {
		title =t; author = a;
	}
	public static void main(String[] args) {
		test2 lp = new test2("어린왕자", "생택쥐페리");
		test2 ls= new test2("춘향전");
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
		System.out.println("생성자 호출됨");
	}
	
	public test2(String title) {
		this(title, "작자미상");
	}
	public test2(String title, String author) {
		this.title = title;  this.author = author;
	}
	public static void main(String[] args) {
		test2 lp = new test2("어린왕자", "생택쥐페리");
		test2 ls= new test2("춘향전");
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
		System.out.print("정수를 입력하시오>>");
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
//3번문제
/*
package test;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
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
//4번문제
//6번문제
//8번문제
//10번 문제
//14번 문제
//15번 문제
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
	   public static void printSeat(String seat[]) { //좌석 한줄 출력 메소드
		      for(int i=0; i<seat.length; i++) {
		         System.out.print(" "+seat[i]+" " );
		      }
		      System.out.println();
		   }
		   public void allPrint() { //모든 좌석 출력 메소드
		      System.out.print("S>>");
		      Concert.printSeat(S);
		      System.out.print("A>>");
		      Concert.printSeat(A);
		      System.out.print("B>>");
		      Concert.printSeat(B);
		      System.out.println("<<<조회를 완료하였습니다.>>>");
		   }
		   public void choiceSeat() { //좌석 선택(S, A, B) 메소드
		      while(true) {
		         System.out.print("좌석구분 S(1), A(2), B(3)>>");
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
		            System.out.println("다시 입력해 주세요.");
		         }
		      }
		   }
		   public void inputSeat(String seat[]) { //좌석에 이름값 넣는 메소드
		      System.out.print("이름>>");
		      String name = sc.next();
		      while(true) {
		         System.out.print("번호>>");
		         int num = sc.nextInt();
		         num--;
		         if(seat[num].equals("___")) {
		            seat[num] = name;
		            break;
		         }
		         else {
		            System.out.println("다른 좌석을 선택해 주세요.");
		         }
		      }
		   }  
		   public void d_choiceSeat() {
		      while(true) {
		         System.out.print("좌석 S:1, A:2, B:3>>");
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
		            System.out.println("다시 입력해 주세요.");
		         }
		      }
		   }
		   public void delete(String seat[]) {
		      System.out.print("이름>>");
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
	      System.out.println("명품콘서트홀 예약 시스템입니다.");
	      Concert concert = new Concert();
	      while(true) {
	         System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
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
	            System.out.println("다시 입력해 주세요.");
	         }
	      }
	   }

}




