package Recursion;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" enter the size of array");
	 int n=sc.nextInt();
	 System.out.println("enter the array ellement");
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	reverse(arr,0,n-1) ;
	System.out.println("reverse array is:");
	for(int k:arr) {
		System.out.println(k);
	}
	  
	}

	private static void reverse(int[] arr, int i, int j) {
	 if(i>j) {
		 return;
	 }
	 int temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
	 i++;j--;
	 reverse(arr,i,j);
		
	}

}
