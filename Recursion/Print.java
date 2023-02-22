package Recursion;

public class Print {
	public static void PrintToN(int n) {
		if(n<=0)return;
		//backtracking
		PrintToN(n-1);
		System.out.print(n+" ");
	}
	public static int fibonacci(int n) {
		if(n<=1)return n;
		return fibonacci(n-1)+fibonacci(n-2);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PrintToN(5);
     System.out.println();
     System.out.println(fibonacci(2));
	}

}
