package Recursion;
import java.util.*;

public class Subsets {
	public static void print(int[] input, int si, int[] output) {
		if(si==input.length)
        {
            for(int i:output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
		//not selecting the option 
		 print(input,si+1,output);
	       
	        int newoutput[]=new int[output.length+1];
	        int j=0;
	        for( ;j<output.length;j++)
	        {
	            newoutput[j]=output[j];
	        }
	        newoutput[j]=input[si];
	        print(input,si+1,newoutput);
		
	}
//	 public static void printSubsets(int input[]) 
//	    {
//	        int output[]=new int[0];
//	        print(input,0,output);
//	    }

	

 public static void main(String[] args) {
		
     int arr[]= new int[5];
     for(int i=0;i<5;i++) {
    	 arr[i]=i+1;
     }
   // System.out.println(printSubsets(arr)); 
     
     int output[]=new int[0];
     print(arr,0,output);
   
	}



}
