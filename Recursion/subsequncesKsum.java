package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequncesKsum {
	
   public static void kSum(int si,int arr[],int n,int sum,List<Integer>output,int k) {
	   if(si>=n) {
		   if(k==sum) {
			   for(int i=0;i<output.size();i++) {
				   System.out.print(output.get(i)+" ");
			   }
			   System.out.println();
		   }
		   
		   return;
	   }
	   kSum(si+1,arr,n,sum,output,k);
	   k+=arr[si];
	   List<Integer>newOutput=new ArrayList<>();
	   for(int i=0;i<output.size();i++) {
		   newOutput.add(output.get(i));
	   }
	   
	   newOutput.add(arr[si]);
	   kSum(si+1,arr,n,sum,newOutput,k);
	   
	   
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1};
		int n=arr.length;
		int sum=2;
	//	.args. output[]=new int [0];
		List<Integer>output=new ArrayList<>();
		kSum(0,arr,n,sum,output,0);

	}

}
