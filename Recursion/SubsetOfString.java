package Recursion;

public class SubsetOfString {
 public static void subset(String str,int si,String output) {
	 if(si>=str.length()) {
		  
			 System.out.println(output);
			 return;
		 
	 }
		 subset(str,si+1,output);
//		 String newoutput[]=new String[output.length+1];
//	        int j=0;
//	        for( ;j<output.length;j++)
//	        {
//	            newoutput[j]=output[j];
//	        }
	         String newoutput=output+str.charAt(si);
	        subset(str,si+1,newoutput);
	        
		 
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		//String output[]=new String[1];
		subset(str,0,"");

	}

}
