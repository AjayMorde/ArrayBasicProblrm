package welcomeToJava;
import java.util.Scanner;
public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int i;
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter Array Length");
	       int n= sc.nextInt();
	       int a[]=new int[n];
	       System.out.println("Enter Array Element");
	       
	       for(i=0;i<n;i++)
	       {
	    	   a[i]=sc.nextInt();
	       }
	        
	        
	       int max=Integer.MIN_VALUE;
	        //for max
	       for (i=0;i<n;i++)
	       {
	    	  if( max<a[i])
	    	  {
	    		  max=a[i];
	    	  }
	    	   
	       }
	        
	        
	       System.out.println("The maximum element from the array is " + max);
	       
//	       for min
	       
	       int min=Integer.MAX_VALUE;
	       
	       for (i=0;i<n;i++)
	       {
	    	  if( min>a[i])
	    	  {
	    		  min=a[i];
	    	  }
	    	   
	       }
	       System.out.println("The maximum element from the array is " + min);
	       int diff=max-min;
	       System.out.println("Differnce between max and min is " + diff );
	       
//	       Duplicate  element
	       
	       for(i =0;i<n-1;i++)
	       {
	    	   if(a[i]==a[i+1])
	    	   {
	    		   System.out.print("The Duplicate Number from array is  ");
	    		   System.out.println(a[i]);
	    		   
	    	   }
	    		   
	       }
	       
	       
//	       peak Element
	       
	       for(i=1;i<n;i++)
	       {
	    	   if(a[i-1]<a[i] && a[i]>a[i+1])
	    	   {
	    		   System.out.println("The peak element is " + a[i]);
	    	   }
	    		   
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
